package com.kabank.web.service;

import java.util.Calendar;

public class MemberService {
	public String[] join(String ssn) {
		Calendar cl = Calendar.getInstance();
		String res[] = new String[2];
		String ssnTemp = "";
		char temp1 = 0, temp2 = 0;
		int c1 = 0, c2 = 0, result = 0;
		temp1 = ssn.charAt(7);
		if(temp1 == '1' || temp1 == '3') { // 성별 체크
			res[0] = "남";
		} else if(temp1 == '2' || temp1 == '4') {
			res[0] = "여";
		} else {
			res[0] = "누구냐넌";
		}
		c1 = cl.get(cl.YEAR);
		temp2 = ssn.charAt(0);  // 주민번호 첫째자리를 temp2에 assignment
		ssnTemp += temp2; // ssnTemp에 첫째자리를 붙혀넣는다
		temp2 = ssn.charAt(1); // 주민번호 둘째자리를 temp2에 assignment
		ssnTemp += temp2; // ssnTemp에 둘째자리를 붙혀넣는다
		
		// 2000년도와 1900년도는 7번째 주민번호가 다르다
		// 조건을 줘서 구분한다.
		if(temp1 == '3' || temp1 == '4') {  // 2000 ~  
			ssnTemp = "20" + ssnTemp; // ex) 2000, 2001, 2005, etc.
		} else { //  1900 ~ 1999
			ssnTemp = "19" + ssnTemp; // ex) 1984, 1986, 1988, 1990, etc.
			System.out.println(ssnTemp);// ex) 2000, 2001, 2005, etc.
		}
		c2 = Integer.parseInt(ssnTemp); // String Type의 res[1]을 int type으로 변환해서 c2에 assignment
		result = (c1 - c2) + 1; // 우리나라의 나이는 1살으로 시작하기 때문에 +1
		res[1] = String.valueOf(result);    // result 값을 String type으로 변환
		return res;
	}
}