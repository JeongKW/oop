package com.kabank.web.service2;

import java.util.Random;
import java.util.Scanner;

public class AccountService {
	Random gen = new Random();
	private String name = "";
	String accNum = "";
	public String createAccount(Scanner scanner) {
		for(int i = 0; i < 16; i++) {
			if(i != 0 && i % 4 == 0) {
				accNum += "-";
			}
			accNum += gen.nextInt(10);
		}
		return accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
