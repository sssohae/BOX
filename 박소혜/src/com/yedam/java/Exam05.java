package com.yedam.java;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.주사위크기 (5~10) 입력받기. 범위를 벗어난 경우 범위안내 메세지를 출력
		//2.5가 나올 때까지 주사위를 몇번 굴리는 지 구하고 출력 
		//3. 2에서 각 주사위 수별로 몇 번씩 나왔는지 출력
		//4. 2에서 가장 많이 나온 수가 몇인지 구하고 출력. 가장 많이 나온 수가 여러개일 경우
		//가장 각은 수가 출력
		//5. 프로그램 종료 
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		int[] numList = null;
		int count = 0;
		
		while (run) {
		System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료===");
		System.out.println("메뉴 >");
		int selectNo = Integer.parseInt(sc.nextLine());
		
		if(selectNo == 1) {
			System.out.println("주사위 크기 >");
			int input = 0;
			
	
			numList = new int[count++]; 
		while(input!=5) { 
			input = Integer.parseInt(sc.nextLine());
			if (input>4 && input<11) {
			}else {
				System.out.println("범위를 벗어났습니다. 5~10을 입력해주세요.");
			}
			count ++;
	
		} 
		
		}else if(selectNo ==2) {
			System.out.println("5가 나올 때까지 주사위를 " + (count-1) + "번 굴렸습니다." );
			
		}else if(selectNo ==3) {
			int[]list = new int[count];
			
/*			for
*/			
			
			
//			System.out.println( + "은 "+ +"번 나왔습니다." );
			
		}else if(selectNo ==4) {
//			System.out.println("가장 많이 나온 수는 " +  + "입니다");
			
		}else if(selectNo ==5) {
			System.out.println("프로그램 종료");
			run = false;
		}

		}
		
		
		
	
	}
}
