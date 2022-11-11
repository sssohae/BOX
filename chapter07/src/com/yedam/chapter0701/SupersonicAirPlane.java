package com.yedam.chapter0701;

public class SupersonicAirPlane extends AirPlane { //부모에서 내용 수정하면 다 적용돼서 편해진다

	public static final int NORMAL = 1;

	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 모드입니다.");
		}else {
		super.fly();
		}
	}
	
	public void test() {
		super.fly(); //일반모드에서도 가능하긴함 
	}
}
