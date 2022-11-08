package com.yedam.java.ch0402;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		// for문
		// 1부터 10까지 출력

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력"); // 출력 7번 1 16 31 46 61 76 91
		}
		System.out.println("x : " + x); // stop이 되는 경우라서 x는 100이상임 106

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("1~100까지의 합계 :" + sum);
//			System.out.printf("%d, %d",i,ii,);

		// float 타입 카운터 변수
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			System.out.println(f); // 누적되면 정밀도가 깨진다. 가능하면 int로 만들어 써
		}
		// 구구단을 2~9단까지 출력
		for (int i = 1; i <= 9; i++) {
			// i = 0;
//			System.out.println("***" + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				// i=0, j =0;
//				    j = 1;
//				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}

		// while문
		// 1~10가지 출력. while에 쓰는 변수는 무조건 밖에서 선언돼야함 먼저.
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++; // 증감식이 코드의 마지막에 있어
		}

		count = 0;
		while (count <= 9) {
			count++;
			System.out.println(count);
		}

		// 1부터 100까지 출력, 1부터 100까지 합을 출력
		count = 1;
		sum = 0;
		while (count <= 100) {
			System.out.println(count);
			sum += count;
			count++;
		}
		System.out.println("1~" + (count - 1) + "까지 합 : " + sum);

		// 주사위 두 개를 굴립니다. 합이 3이 되는 경우 계속 굴리는 경우
		int a = (int) (Math.random() * 6) + 1;
		int b = (int) (Math.random() * 6) + 1;

		while ((a + b) == 3) {
			System.out.println();
		}

		int index = 1;

		while (index != 1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		}

		do {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		} while (index != 1);

		// break로 while문 종료
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6)
				break;
		}

		//이중 for문에서 break문 사용
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			boolean result = false;
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					result = true;
					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
			
		}
		System.out.println("2) 바깥쪽 for문 종료");
		
		System.out.println("-------------------------------");
		
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
			System.out.println("1) 안쪽 for문 종료");
		}
		System.out.println("2) 바깥쪽 for문 종료"); //stop돼서 여기로 옮
		
		//continue를 사용한 for문
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) continue;
			System.out.println(i);
			}
		}
	}

