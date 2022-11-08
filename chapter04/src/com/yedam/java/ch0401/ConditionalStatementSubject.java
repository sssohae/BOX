package com.yedam.java.ch0401;

public class ConditionalStatementSubject {

	public static void main(String[] args) {
		//문제1) 두 개의 정수가 주어졌을 때
		// 		두 정수의 합이 자연수이면 'Natural Number'를 출력하는 코드를 작성하세요.
		int a = -1, b = 2;
		
		if(a+b>0) {
			System.out.println("Natural Number");
		}
		
		//문제 2) 두 개의 정수가 주어졌을 때
		//		 두 수의 대소관계에 따라서 부등호를 출력하는 코드를 작성하세요.
		if(a>b) {
			System.out.println(">");
		}else if(a==b) {
			System.out.println("==");
		}else {
			System.out.println("<");
		}
		
		//문제 3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분
		// 		BMI = 체중 / (키(m)*키(m)). 키 미터로 해야함 cm아님!!
		//		저체중(18.5미만), 정상(18.5 이상 25미만),
		//		과체중(25이상 30미만), 비만(30이상)
		
//		double bmi = 54/(1.58*1.58); --> 변수에 담도록 해. 범위는 case 못써 
		
		double weight = 54;
		double height = 1.58;
		double bmi = weight / (height * height);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		}else if(bmi<25) { //그냥 bmi < 25로 해도됨
			System.out.println("정상");
		}else if(bmi<30) { //그냥 bmi < 30으로 해도됨
			System.out.println("과체중");
		}else {
			System.out.println("비만");
		}
		
		//문제4) 선택한 단의 6번째 값을 출력하는 코드
		// 		예를 들어, 2단일 경우 2 x 6 = 12
		//		단, 출력문에는 변수 사용하지 않는다. 
		
		int gugu = (int)(Math.random()*9) + 1;
		//System.out.println("gugu는" + gugu);
		switch(gugu){
		case 1:
			System.out.println(6);
			//System.out.printf("%d x 6 = %d\n", 1, 1*6);
			break;
		case 2:
			System.out.println(12);
			break;
		case 3:
			System.out.println(18);
			break;
		case 4:
			System.out.println(24);
			break;
		case 5:
			System.out.println(30);
			break;
		case 6:
			System.out.println(36);
			break;
		case 7:
			System.out.println(42);
			break;
		case 8:
			System.out.println(48);
			break;
		case 9:
			System.out.println(54);
		}
		
		// 문제5) 다음과 같이 점수 범위에 따라 등급을 구문
		// 		 해당 점수에 대한 등급을 출력하는 코드
		//		 90점 이상 100점 이하: A등급,
		//		 80       90   미만: B등급, 
		//		 70 	  80   미만: C등급,
		//		 60		  70      : D등급,
		//		 60점 미만 : E등급 
		
		double score = 92.1;
		
		switch((int)score/10) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default :
			System.out.println("E등급");
		}
		
		
	
		
		
		
		
	}

}
