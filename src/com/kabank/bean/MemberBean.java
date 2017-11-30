package com.kabank.bean;


public class MemberBean {
	private int customNum;
	private String name;
	private int age;
	private String gender;
	private String ssn;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCustomNum(int customNum) {
		this.customNum = customNum;
	}
	public int getCustomNum() {
		return customNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
}
