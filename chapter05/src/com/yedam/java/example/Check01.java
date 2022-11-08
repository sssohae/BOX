package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1 ) 주어진 배열을 이용의 총합과 평균을 구하세요.
		
		
		int[] array = {10,53,26,85,75};
		int sum = 0;
		
		for(int i=0; i<=array.length-1; i++) {
			sum += array[i];
		}
		
		double avg = (double)sum/(array.length);
		System.out.printf("총합은 : %d , 평균은 : %.2f\n ", sum, avg);
		
		
		//문제2) 배열의 최대값과 최소값을 구하세요. 
		
		int max =array[array.length-1];
		int min =array[0];
		
		for(int i=0; i<array.length; i++) { //최대최소 따로 놂. 각각 다른 if문 써 
		 if(max < array[i]) {
			 max = array[i];
		 }
		 if(min > array[i]) {
			 min = array[i];
		 }
		}
		System.out.println("max는 :" + max+ "min은 :" + min);
		
		//문제 3) 문제2에서 구한 최대값과 최소값이 각각 몇번째 값인지 뭔지 구하세요. cf) 몇번째 인덱슨지랑 다름
		
		int maxNum = 0;
		int minNum = 0;
		
		for(int i=0; i<array.length; i++) {
			if(max == array[i]) {
				maxNum = i;
			}
			if(min == array[i]) {
				minNum = i;
			}
		}
		System.out.println("최대값 :" + max + "는" + (maxNum+1) + "번째입니다.");
		System.out.println("최소값 :" + min + "는" + (minNum+1) + "번째입니다.");
		
		
		
	}
}
