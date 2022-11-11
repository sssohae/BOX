package com.yedam.chapter0702;

public class Application3 {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { //왼쪽은 내가 쓸 객체, 오른쪽은 타입 (클래스)
			//뭘로 참조해서 만들었니? 느낌. 그걸 알아야함 
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 선공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child)parent; //2)
		System.out.println("method2 - child 변환 성공");
	}
	
	
public static void main(String[] args) {
	
	Parent parentA = new Child();
	method1(parentA);
	
	Parent parentB = new Parent();//1)자동타입변환안됐음 
	method2(parentB);
	
	
	
	
	
	
	
	
	Driver driver = new Driver();
	
	//bus, taxi vehicle 부모클래스 
	Bus bus = new Bus();
	Taxi taxi = new Taxi();

	driver.drive(bus); 
	//driver.drive(Vehicle vehicle = new Bus). 부모클래스에 자식 객체 넣는거 
	driver.drive(taxi);

	Animal animal = null; //객체가 안 만들어진 상태임. 공통적 기능 메소드 넣어줌 
	
	animal = new Cat(); // 그걸 상속받아서 자기 스타일대로 -> (각각 짖는거)오버라이딩. 자동타입변환해서 자식 객체의 메소드 사용하도록  
	
	animal.speak();
	
	animal = new Dog();
	
	animal.speak();

 //하나의 객체(애니멀꺼)로 다양한 객체들이 사용하는게 다형성 
	
	Parent parent = new Child();
	
	parent.field = "parent";
	parent.method1();
	parent.method2();
	
//	parent.field2 = "child";
//	parent.method3(); => 캐스팅전이라 못 쓴다 
	
	//Casting
	Child child = (Child)parent;
	
	child.field2 = "parent";
	child.method3();
	
	child.field = "parent"; //자동타입은 오버라이딩만 가져오지만 강제타입변환은 부모+자식꺼까지 다 쓰겠다는 것 
	










}
}
