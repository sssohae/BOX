package com.yedam.chapter0701;

public class Application {

	public static void main(String[] args) {
		
//		Child child = new Child(); //인스턴스 생성 
//		
//		
//		//자식 클래스 고유 필드 
//		child.lastName = "paul";
//		child.age = 20;
//		
//		//부모 클래스 필드. 부모 클래스에 정의된 내용, 필드명을 사용할 수 있음
//		System.out.println(child.firstName + child.lastName);
//		
//		//부모 -> 여러명의 자식 -> 가질 수 O
//		//자식 -> 여러명의 부모 -> 섬길 수 X
//		
//		DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
//		
//		//부모 클래스 필드 사용 
//		System.out.println("모델 : " + dmb.model);
//		System.out.println("색상 : " + dmb.color);
//		//자식 클래스 필드 사용 
//		System.out.println("채널 : " + dmb.channel);
//		
//		//부모 클래스 메소드 사용 
//		dmb.powerOn();
//		dmb.sendVoice("안녕하세요");
//		dmb.receiveVoice("안녕안녕하세요");
//		dmb.powerOff();
//		
//		//자식 클래스 메소드 사용 
//		dmb.turnOnDmb();
//		
//		Member member = new Member("고길동", "12367-45897");
//		//객체 만들었음. 생성자 Member로 이동함
//		
//		//부모 객체의 필드 사용 
//		System.out.println("name : " + member.name);
//		System.out.println("ssn : " + member.ssn);
//		
//		//자식 객체의 필드 사용 
//		System.out.println("memberNo : " + member.stdNo);
		
//		Child cd = new Child();
//		
//		cd.method1();
//		cd.method2();
//		cd.method3();
//		
//		Compute com = new Compute();
//		
//		double result = com.areaCircle(5);
//		System.out.println("result : " + result);
//		
//		
//		
//		SupersonicAirPlane sa = new SupersonicAirPlane();
//		
//		sa.takeOff();
//		sa.fly();
//		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
//		sa.fly();
//		sa.flyMode = SupersonicAirPlane.NORMAL;
//		sa.fly();
//		sa.land();
		
		Child chd = new Child();
		//Parent parent = new Child();
		//부모 클래스에 있는 필드, 메소드를 사용을 하되
		//만약 자식 클래스에 오버라이딩이 되어있는 메소드가 존재 한다면 
		//부모 클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 있는 메소드를 사용 
		Parent parent = chd; 
	
		parent.method1(); //자식 클래스에 있는거 호출됨
		parent.method2(); //부모클래스에 있는거 호출됨
//		parent.method3(); //부모타입에 있는 것만 불러오는데 부모타입에 없어서 오류중 
		//상속이랑 반대느낌임.
	
	
	}
}
