package com.kabank.web.controller;

import javax.swing.JOptionPane;

import com.kabank.bean.MemberBean;
import com.kabank.web.serviceImpl.MemberServiceImpl;

public class Portal {
	public static void main(String[] args) {
		MemberServiceImpl memberService = new MemberServiceImpl();
		MemberBean member = null;
		while(true) {
			switch(JOptionPane.showInputDialog(
					"[MENU] 0.종료 1.회원가입 2.계좌개설\n"
					+ " 3.총회원수 4.회원목록 5.로그인 6.회원검색\n"
					+ " 7.PW 수정 8.회원탈퇴 9.회원전체삭제")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				String spec = JOptionPane.showInputDialog("이름/주민번호/id/pw");
				String[] dummy = {
					"홍길동/800101-123456/hong/1",
					"김유신/900203-134567/kim/1",
					"이이/920304-189456/lee/1",
					"유관순/850910-223456/you/1",
					"신사임당/950101-273456/shin/1"
				};
				for(int i = 0; i < dummy.length; i++) {
					String[] arr = dummy[i].split("/");
					member = new MemberBean();
					member.setName(arr[0]);
					member.setSsn(arr[1]);
					member.setId(arr[2]);
					member.setPw(arr[3]);
					member.setCustomNum(memberService.createCustomNum());
					member.setGender(memberService.findGender(member.getSsn()));
					member.setAge(memberService.findAge(member.getSsn()));
					memberService.addMember(member);
				}
				break;
			case "2":
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "총 가입 수는 " + memberService.count() + "입니다");
				break;
			case "4":
				JOptionPane.showMessageDialog(null, memberService.list());
				break;
			case "5":
				String login = JOptionPane.showInputDialog("ID/PW");
				String[] arr = login.split("/");
				member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]);
				JOptionPane.showMessageDialog(null, memberService.login(member));
				break;
			case "6":
				JOptionPane.showMessageDialog(null, memberService.searchMember(JOptionPane.showInputDialog("ID ??")));;
			case "7":
				
				break;
			case "8":
				memberService.delete(JOptionPane.showInputDialog("삭제할 id"));
				break;
			case "9":
				memberService.memberAllDelete();
				JOptionPane.showMessageDialog(null, "총 가입 수는 " + memberService.count());
				break;
			}
		}
	}
}
