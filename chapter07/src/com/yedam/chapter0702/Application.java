package com.yedam.chapter0702;

public class Application {
	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemTire = car.run();
			
			switch(problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				//frontLeftTire - > Tire 
				//frontLeftTire 펑크
				//타이어를 교체
				//자식 클래스인 HankookTire로 교체. 규격에 맞아야 해서 Tire Tire타입에 자식타입을
				//넣어서 세부내용은 한국타이어꺼를 쓰도록 만들었음. 부모정의된 내용 +한국타이어가 바꾼 내용 => 갈아끼운다  
				//부모클래스에서 오버라이딩 한 내용을 바꿔 끼우게 되는 것
				//자동 타입 변환으로 인해서 가능한 일 
				//HankookTire tire = new HankookTire("앞 왼쪽, 15);
				//car. frontLeftTire = trire --->이 두줄을 하나로 만든게 밑임 
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);//이 부분이 중요
				//프론트레프트타이어가 한국타이어의 부모라서 가능 
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				//자동타입변환
				car.frontRightTire = new KumhoTire("앞오른쪽" , 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
	
			}
		}
	}
}
