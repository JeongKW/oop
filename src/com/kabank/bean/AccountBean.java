package com.kabank.bean;

import java.util.Random;

public class AccountBean {
	private String name;
	private int accountNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum() {
		Random gen = new Random();
		int accNum = 0;
		boolean flag = true;
		while(flag) {
			accNum = gen.nextInt(1000000);
			if(accNum > 100000) {
				accountNum = accNum;
				flag = false;
			} else {
				flag = true;
			}
		}
	}
}
