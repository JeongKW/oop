package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.AccountService;
import com.kabank.web.service.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(true) {
			System.out.println("[MENU] 0.종료 1.회원가입 2.계좌개설");
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1 :
				MemberService mem = new MemberService();
				String res[] = new String[2];
				System.out.print("이름 입력 : ");
				name = scanner.next();
				System.out.print("주민번호 입력('-'포함) : ");
				res = mem.join(scanner.next());
				System.out.printf("[고객번호] 101\n"
						+ "[이름]  %s\n" 
						+ "[성별]  %s\n"
						+ "[나이]  %s\n", 
						name, res[0], res[1] );
				break;
			case 2:
				AccountService account = new AccountService();
				System.out.print("이름 입력 : ");
				name = scanner.next();
				System.out.println(name + "님의 계좌가 " 
				+ account.createAccount() + "로 개설 되었습니다");
				break;
			}
		}
	}
}
