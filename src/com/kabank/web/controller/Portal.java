package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.bean.AccountBean;
import com.kabank.bean.MemberBean;
import com.kabank.web.service.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.println("[MENU] 0.종료 1.회원가입 2.계좌개설");
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1 :
				MemberBean memberBean = new MemberBean();
				MemberService memberService = new MemberService();
				System.out.print("이름 입력 : ");
				memberBean.setName(scanner.next());
				System.out.print("주민번호 입력('-'포함) : ");
				memberBean.setSsn(scanner.next());
				memberBean.setCustomNum(memberService.createCustomNum(i));
				memberBean.setGender(memberService.findGender(memberBean.getSsn()));
				memberBean.setAge(memberService.findAge(memberBean.getSsn()));
				System.out.printf("[고객번호] %d\n"
						+ "[이름]  %s\n" 
						+ "[주민번호] %s\n"
						+ "[성별]  %s\n"
						+ "[나이]  %s\n", 
						memberBean.getCustomNum(), memberBean.getName(),
						memberBean.getSsn(), memberBean.getGender()
						, memberBean.getAge() );
				i++;
				break;
			case 2:
				AccountBean account = new AccountBean();
				System.out.print("이름 입력 : ");
				account.setName(scanner.next());
				account.setAccountNum();
				System.out.println(account.getName() + "님의 계좌가 " + account.getAccountNum() + "로 개설 되었습니다");
				break;
			}
		}
	}
}
