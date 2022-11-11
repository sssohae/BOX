package com.yedam.chapter0702;

public class HankookTire extends Tire{ //매개변수를 가진 생성자가 있어서

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	} //이거 해야함 

	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명" + 
		(maxRotation-accRotation)+ "회");
			return true;
		}else {
			System.out.println("###" + location + "HankookTire 펑크 ###");
			return false;
		}
	}
}
