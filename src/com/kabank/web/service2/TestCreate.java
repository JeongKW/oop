package com.kabank.web.service2;

import java.util.Random;

public class TestCreate {
	public void createA() {
		int temp = 0;
		Random r = new Random();
		temp = r.nextInt(900000) + 100000;
		System.out.println(temp);
	}
}
