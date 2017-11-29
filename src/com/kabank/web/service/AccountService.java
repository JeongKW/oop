package com.kabank.web.service;

import java.util.Random;

public class AccountService {
	private String name;
	private int acc;
	public AccountService() {
		name = "";
		acc = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcc() {
		return acc;
	}
	public void setAcc() {
		Random gen = new Random();
		int accNum = 0;
		boolean flag = true;
		while(flag) {
			accNum = gen.nextInt(1000000);
			if(accNum > 100000) {
				acc = accNum;
				flag = false;
			} else {
				flag = true;
			}
		}
	}
}
