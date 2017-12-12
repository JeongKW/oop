package com.kabank.web.service;

import java.util.Vector;

import com.kabank.bean.MemberBean;

public interface MemberService{
	public int createCustomNum();
	public String findGender(String ssn);
	public int findAge(String ssn);
	public void addMember(MemberBean memberBean);
	public Vector<MemberBean> list();
	public int count();
	public void memberAllDelete();
	public void delete(String id);
	public String login(MemberBean member);
}
