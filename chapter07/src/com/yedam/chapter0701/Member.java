package com.yedam.chapter0701;

public class Member extends People {
	
	public int stdNo;
	
	public Member(String name, String ssn) {
		super(name, ssn); //부모클래스 쓰기 위해서 부모 만듦 -> people 호출
		this.stdNo = stdNo;
		
	}

}
