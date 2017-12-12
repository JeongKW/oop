package com.kabank.web.serviceImpl;

import java.util.Calendar;
import java.util.Vector;

import com.kabank.bean.MemberBean;
import com.kabank.web.service.MemberService;

public class MemberServiceImpl implements MemberService {
	private Vector<MemberBean> members;
	
	public MemberServiceImpl() {
		members = new Vector<MemberBean>(10,10);
	}
	
	@Override
	public int createCustomNum() {
		int temp = 0;
		return temp;
	}
	@Override
	public String findGender(String ssn) {
		String temp = "";
		char temp1 = 0;
		temp1 = ssn.charAt(7);
		if(temp1 == '1' || temp1 == '3') { // 성별 체크
			temp = "남";
		} else if(temp1 == '2' || temp1 == '4') {
			temp = "여";
		} else {
			temp = "누구냐넌";
		}
		return temp;
	}
	
	@Override
	public int findAge(String ssn) {
		Calendar cl = Calendar.getInstance();
		String ssnTemp = "";
		char temp1 = 0, temp2 = 0;
		int c1 = 0, c2 = 0;
		temp1 = ssn.charAt(7);
		c1 = cl.get(Calendar.YEAR);
		temp2 = ssn.charAt(0);
		ssnTemp += temp2;
		temp2 = ssn.charAt(1);
		ssnTemp += temp2;
		if(temp1 == '3' || temp1 == '4') { 
			ssnTemp = "20" + ssnTemp;
		} else {
			ssnTemp = "19" + ssnTemp;
		}
		c2 = Integer.parseInt(ssnTemp);
		return (c1 - c2) + 1;
	}

	@Override // 서비스에 연동
	public void addMember(MemberBean member) {
		members.add(member);
	}

	@Override
	public Vector<MemberBean> list() {
		return members;
	}

	@Override
	public int count() {
		return members.size();
	}

	@Override
	public void memberAllDelete() {
		members.clear();
	}

	@Override
	public void delete(String id) {
		for(int i = 0; i < members.size(); i++) {
			if(id.equals(members.get(i).getId())) {
				members.remove(i);
			}
		}
	}

	@Override
	public String login(MemberBean member) {
		String res = "존재하지 않습니다";
		for(int i = 0; i < members.size(); i++) {
			if(member.getId().equals(members.get(i).getId())) {
				res = (member.getPw().equals(members.get(i).getPw())) ?
					 members.get(i).getName() + "님 로그인되었습니다"
					: "PW가 다릅니다";
			}
		}
		return res;
	}
}