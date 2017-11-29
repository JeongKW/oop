package com.kabank.web.service2;

import java.util.Calendar;

public class MemberService {
	private String id;
	private String name;
	private String ssn;
	private String gender;
	private int age;
	
	public MemberService(){
		this.id = "";
		this.name = "";
		this.ssn = "";
		this.gender = "";
		this.age = 0;
	}
	
	public void join(String ssn) {
		Calendar cl = Calendar.getInstance();
		String res = "";
		char temp = 0;
		int c1 = 0, c2 = 0;
		temp = ssn.charAt(7);
		if(temp == '1' || temp == '3') {
			gender = "남";
		} else if(temp == '2' || temp == '4') {
			gender = "여";
		} else {
			gender = "누구냐넌";
		}
		c1 = cl.get(Calendar.YEAR);
		temp = ssn.charAt(0);
		res += temp;
		temp = ssn.charAt(1);
		res += temp;
		if(temp == '3' || temp == '4') {
			res = "20" + res;
		} else {
			res = "19" + res;
		}
		c2 = Integer.parseInt(res);
		age = (c1 - c2) + 1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
