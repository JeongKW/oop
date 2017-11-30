package com.kabank.web.controller2;

import java.util.Scanner;

import com.kabank.bean.AccountBean;
import com.kabank.bean.MemberBean;
import com.kabank.web.service.MemberService;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberBean[] memberBean = null;
		int i = 0, size = 10, acc = 3;
		while(true) {
			System.out.println("[MENU] 0.종료 1.회원가입 2.계좌개설");
			switch(scanner.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1 :
				if(i == size) {
					MemberBean[] memberTemp = new MemberBean[size];
					for(int indexT=0; indexT < memberTemp.length; indexT++) {
						memberTemp[indexT] = new MemberBean();
					}
					memberTemp = memberBean;
					memberBean = new MemberBean[size+acc];
					for(int index=0; index < memberBean.length; index++) {
						memberBean[index] = new MemberBean();
					}
					size += acc;
				} else if(i == 0){
					memberBean = new MemberBean[size];
						for(int indexM=0; indexM < memberBean.length; indexM++) {
							memberBean[indexM] = new MemberBean();
						}
				}
				MemberService memberService = new MemberService();
				memberBean[i].setCustomNum(memberService.createCustomNum(i));
				System.out.print("이름 입력 : ");
				memberBean[i].setName(scanner.next());
				System.out.print("주민번호 입력('-'포함) : ");
				memberBean[i].setSsn(scanner.next());
				memberBean[i].setGender(memberService.findGender(memberBean[i].getSsn()));
				memberBean[i].setAge(memberService.findAge(memberBean[i].getSsn()));
				System.out.printf("[고객번호] %d\n"
						+ "[이름]  %s\n" 
						+ "[주민번호] %s\n"
						+ "[성별]  %s\n"
						+ "[나이]  %s\n", 
						memberBean[i].getCustomNum(), memberBean[i].getName(),
						memberBean[i].getSsn(), memberBean[i].getGender()
						, memberBean[i].getAge());
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
