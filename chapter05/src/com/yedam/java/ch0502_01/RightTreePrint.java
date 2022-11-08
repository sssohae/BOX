package com.yedam.java.ch0502_01;

import java.util.Scanner;

public class RightTreePrint {
	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {//예금
				System.out.println("예금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;
				
			}else if(selectNo == 2) {//출금
				System.out.println("출금액> ");
				int money = Integer.parseInt(scanner.nextLine());
				balance -= money;
				
			}else if(selectNo == 3) {//잔고
				System.out.println("잔고>" + balance);
				
			}else if(selectNo == 4) {//종료 
				System.out.println("종료합니다");
				run = false;
				
			}else {//기타입력 
				System.out.println("정해진 메뉴(1~4)중에서 선택해주세요.");
				
			}
		}

		// * -> 1번째 줄, 공백 3개, 별 1개 =>총 문자 4개
		// ** -> 2번째 줄, 공백 2개, 별 2개 =>총 문자 4개
		// ***
		// ****

//		for (int i = 1; i <= 4; i++) { // 라인
//			for (int j = 1; j <= 4; j++) { // 문자 수
//				if (j <= (4 - i)) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

	}
}
