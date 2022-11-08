package com.yedam.java;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result =0;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println(String.valueOf(num1) + operator + num2 +"="+ result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(String.valueOf(num1) + operator + num2 +"="+ result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(String.valueOf(num1) + operator + num2 +"="+ result);
			break;
		case '/':
			result = num1/num2;
			System.out.println(String.valueOf(num1) + operator + num2 +"="+ result);
			break;
		}
		
		
		
		
		
	}

}
