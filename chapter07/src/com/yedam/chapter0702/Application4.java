package com.yedam.chapter0702;

public class Application4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		//c->b->a   상속 관계. 
		
		A a1 = b;
		A a2 = c;
		
	}
}
