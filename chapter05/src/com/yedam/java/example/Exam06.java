package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		boolean run = true; //반복문 제어 선언문. switch쓰려면 반드시 필요함 
		Scanner sc = new Scanner(System.in); // 컨 + shift + O
		
		int studentNum = 0;
		int[]scores = null;
		
		while(run) { //각 메뉴 1번씩 실행시키는 것임. 
			System.out.println("=================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("=================================================");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) { //if에서 break는 전체 종료지만 switch에서는 해당 switch만. 애초에 흐름만 막는 용임
			case 1:
				System.out.println("학생수>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"] > ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
				
			case 4:
				int sum = 0;
				int max = scores[0];
				
				for(int i=0; i<scores.length; i++ ) {
					//최고점수 
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				
				System.out.println("최고 점수 :" +max);
				System.out.println("평균 점수 :" +(double)sum/scores.length);
				break;
			case 5:
				run = false;
				break;
			default :
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 이력해주세요.");
			}
		}
	}
}
