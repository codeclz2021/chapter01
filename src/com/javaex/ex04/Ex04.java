package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=10; i++ ) {
			
			sum = sum + i;
			System.out.println(sum);
		}
		
		System.out.println("1부터 10까지의 정수의 합은 " + sum);
		
	}
}
