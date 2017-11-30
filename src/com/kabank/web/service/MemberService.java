package com.kabank.web.service;

import java.util.Calendar;

public class MemberService {
	
	public int createCustomNum(int i) {
		return i+1;
	}
	
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
}