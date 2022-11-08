package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		//클래스 테스트
		//배열을 선언 -> 모든 타입을 값으로 가질 수 있음 
		
		
		User user = new User(); //반드시 new 사용
		user.name = "홍길동";
		user.age = 25;
		user.height = 175.7;
//		let user = {
//				name : '홍길동',
//				age : 25,
//				height : 175.7
//		} 이런식으로 불가능 
		
		int[]intAry = null;
//		int intAry2[];
//		System.out.println("intAry[0] : " + intAry[0]);
		
		int[] scores = {83, 90, 87}; //자바 안에서 객체라는 개념은 사실 아님 얘가. scores 하나 부르면 값 다 부르는거 
		System.out.println("scores[0] :" + scores[0]);
		System.out.println("scores[0] :" + scores[1]);
		System.out.println("scores[0] :" + scores[2]);
		
		int total = 0;
		for(int i=0; i<3; i++) {
			total += scores[i];
		}
		
		System.out.println( "총합 : "+ total);
		double avg = total / 3.0;
		System.out.println( "평균 : "+ avg);
		
		// 주의사항
		int[] scoreList;
//		scoreList = {83, 90, 87}; //변수를 사용하고 나서 값 주는거 불가능 
		scoreList = new int[] {83, 90, 87}; //객체는 원래 new 써야하는데 얘 예외봐주는거. 크기는 주면 안됨..
		//ex) new int[5] {83, 90, 97}; 이런거 불가능 
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scoreList[i];
		}
		System.out.println("총합: " +sum);
		
		
		sum = add(new int[]{83, 90, 87});
		
		//new 연산자로 배열 생성
		int[] array = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("array["+i+"]:" + array[i]);
		}
		
		//length는 정수라서 필요하면 double로 바꿔줘야 함
		String[] strAry = new String[4];
		for(int i =0; i<strAry.length; i++){
			strAry[i] = String.valueOf(i); //주석하면 null나옴 
		}
		
		for(int i =0; i<strAry.length; i++){
			System.out.println("strAry["+i+"] :" + strAry[i]);
		}
	}
	
	static int add(int[] numList) {
		int sum = 0;
		for (int i = 0; i < numList.length; i++) {
			sum += numList[i];
		}
		return sum;

	}
}
