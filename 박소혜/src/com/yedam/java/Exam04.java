package com.yedam.java;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=2; i<=9; i++) {
			System.out.println("========"+ i + "단==========");
			for(int j=1; j<=i; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}

}
