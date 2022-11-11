package com.yedam.chapter0702;

public class Application2 {
public static void main(String[] args) {
	
	HankookTire hTire = new HankookTire("right", 10);
	KumhoTire kTire = new KumhoTire("left", 20);
	
	//Tire 객체에 자식 객체인 hTire
	//tire -> 한국 타이어를 사용하고 있다.
	Tire tire = hTire; //자동타입변환으로 인해 자식클래스꺼 실행함 
	System.out.println(tire.roll());
	
	tire = kTire;
	System.out.println(tire.roll());
	//1상속 2오버라이딩 필요  -> 다형성 가능 
	tire = hTire;
	System.out.println(tire.roll());
}
}
