package com.yedam.java.ch0402;

public class ConditionalStatementSubject {
	public static void main(String[] args) {
		// 문제1) 책 161페이지 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		// *
		// **
		// ***
		// ****
		// ******
		//주석만 가지고 다시 풀어봐~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		String x = "";
		for (int i = 1; i <= 5; i++) {
			x += "*";
			System.out.println(x);
		}

		for (int i = 1; i <= 5; i++) {// line
			for (int j = 1; j <= i; j++) { // "*출력
				System.out.print("*");
			}
			System.out.println();
		}

		// 문제3) for문을 이용해서 1부터 100까지의 정수 중에서
		// 2의 배수가 아닌 숫자의 갯수를 구하세요.

		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			total++;
		}
		System.out.println(total);

		Outter: for (int a = 1; a <= 10; a++) {
			for (int b = 1; b <= 10; b++) {
				if (((4 * a) + (5 * b)) == 60) {
					System.out.println("a 는 : " + a + "b는 :" + b);
					break Outter;
				}
			}
		}
		// 문제4) do ~ while문과 Math.random() 함수를 이용
		// 1 ~ 10의 정수 중 7이라는 수가 나올 때까지 숫자를 출력

		int ran = 0;

		do { ran = (int) (Math.random() * 10) + 1;
			System.out.println(ran);
		} while (ran != 7);

		//문제5) 책 161페이지 3번 
		//		while문과 Math.random() 함수를 이용
		//		2개의 주사위를 던졌을 때 숫자를 (숫자1, 숫자2)로 출력
		//		숫자의 합이 5일 경우에 종료, 아닌 경우에 계속 던짐 
		//		최종으로 주사위를 몇번 던졌는지 횟수를 출력
		//		숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)
		
		
		int a= 0;
		int b= 0;
		int cnt = 0;
		
		while(a+b != 5){
			a= (int)(Math.random()*6)+1;
			b= (int)(Math.random()*6)+1;
			cnt += 1;
			System.out.printf(" (%d,  %d)\n",a, b);
		 if(a+b ==5) {
			break;
		 }
		
		
		}
		System.out.println("주사위를 던진 횟수는 총" + cnt + "번 입니다."); 	
	}
}
