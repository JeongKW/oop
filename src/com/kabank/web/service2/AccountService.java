package com.kabank.web.service2;

import java.util.Random;
import java.util.Scanner;

public class AccountService {
	Random gen = new Random();
	private String name;
	private String ssn;
	private String acc;
	
	public AccountService(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		acc = "";
	}
	public String createAccount(Scanner scanner) {
		String accNum = "";
		for(int i = 0; i < 16; i++) {
			if(i != 0 && i % 4 == 0) {
				accNum += "-";
			}
			accNum += gen.nextInt(10);
		}
		acc = accNum;
		return accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn(String ssn) {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
