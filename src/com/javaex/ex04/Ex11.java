package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		//20까지 정수중에 2의배수출력X  3배수출력X 나머지 다 출력해주세요
		/*
		for(int i=1; i<=20; i++) {
			
			if( i%2==0 || i%3==0 ) {
				//아무일도 안해야된다
				continue;
			}
			
			System.out.println(i);
		}
		*/
		
		/*
		for(int i=1; i<=20; i++) {
			
			if( i%2==0 || i%3==0  ) { // 2의배수 또는 3의 배수면 들어가라
				//실수아님
			}else {                   // 2의배수 또는 3의 배수가 아니면
				System.out.println(i);
			}
			
		}
		*/
		
		for(int i=1; i<=20; i++) {
			
			if( !(i%2==0 || i%3==0) ) { //2의배수 또는 3의 배수 가 아니면 들어가라
				System.out.println(i);
			}
		}

	}

}
