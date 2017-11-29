package com.kabank.web.controller2;

import java.util.Scanner;

import com.kabank.web.service2.AccountService;
import com.kabank.web.service2.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[MENU] 0.종료 1.회원가입 2.계좌개설");
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1 :
				MemberService mem = new MemberService();
				System.out.print("이름 입력 : ");
				mem.setName(scanner.next());
				System.out.print("주민번호 입력('-'포함) : ");
				mem.setSsn(scanner.next());
				mem.join(mem.getSsn());
				System.out.printf("[고객번호] %s\n"
						+ "[이름]  %s\n" 
						+ "[성별]  %s\n"
						+ "[나이]  %d\n", 
						mem.getId(), mem.getName(), 
						mem.getGender(), mem.getAge() );
				break;
			case 2:
				AccountService account = new AccountService();
				System.out.print("이름 입력 : ");
				account.setName(scanner.next());
				System.out.println(account.getName() + "님의 계좌가 " 
				+ account.createAccount(scanner) + "로 개설 되었습니다");
				break;
			}
		}
	}
}
