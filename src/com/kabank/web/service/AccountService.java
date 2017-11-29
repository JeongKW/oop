package com.kabank.web.service;

import java.util.Random;

public class AccountService {
	Random gen = new Random();
	
	public int createAccount() {
		int res = 0, accNum = 0;
		boolean flag = true;
		while(flag) {
			accNum = gen.nextInt(1000000);
			if(accNum > 100000) {
				res = accNum;
				flag = false;
			} else {
				flag = true;
			}
		}
		return res;
	}
}
