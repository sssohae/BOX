package com.yedam.chapter0702;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명" + (maxRotation - accRotation) + "회");
			return true;
		} else {
			System.out.println("###" + location + "KumhoTire 펑크 ###");
			return false;
		}

	}
}
