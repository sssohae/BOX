package com.yedam.chapter0701;

public class Child extends Parent {

	//필드
	public String lastName;
	public int age;
	//생성자
	
	//메소드
	
	@Override
	public void method1() { //<- 이게 시그니처 메소드 이름, 매개변수, 리턴타입 
		System.out.println("Child 클래스 재정의 된 method1 호출");
	}
	public void method3() {
		System.out.println("child 클래스 method3 호출");
	}
	
}
