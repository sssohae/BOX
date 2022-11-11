package com.yedam.chapter0703;

public class Dog extends Animal { //미완성 메소드 오버라이딩 안 하며 오류남 

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
