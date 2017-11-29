package com.kabank.web.service;

import java.util.Calendar;

public class MemberService {
	private int customNum;
	private String name;
	private int age;
	private String gender;
	private String ssn;
	public MemberService() {
		this.customNum = 0;
		this.name = "";
		this.gender = "";
		this.ssn = "";
		this.age = 0;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCustomNum() {
		this.customNum = 101;
	}
	public int getCustomNum() {
		return customNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
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
		age = (c1 - c2) + 1;
	}
	public String getGender() {
		return gender;
	}
	public void setGender() {
		char temp1 = 0;
		temp1 = ssn.charAt(7);
		if(temp1 == '1' || temp1 == '3') { // 성별 체크
			gender = "남";
		} else if(temp1 == '2' || temp1 == '4') {
			gender = "여";
		} else {
			gender = "누구냐넌";
		}
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
}