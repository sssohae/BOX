package com.yedam.chapter0701;

public class DmbCellPhone extends Cellphone{
	

	//필드
	public int channel;
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		//부모 클래스 필드 
		//super(); 생략돼있는거임 -> 이거 쓰려면 생성자 있어야함 
		//부모클래스에서 생성자가 생성돼있으면 무조건 얘를 통해서 객체를 만들 수있음 -->자식클래스에서 부모클래스 만들어줘야함
		this.model = model;
		this.color = color;
		//자식 클래스 필드
		this.channel = channel; //-> 생성자 없어서 
	}
	
	//메소드 
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
	}


}
