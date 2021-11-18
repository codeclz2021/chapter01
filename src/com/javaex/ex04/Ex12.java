package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		int num ;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요[0이면 종료]");
		
		///반복구간
		/*
		do {
			num  =  sc.nextInt();
			sum = sum + num;
			System.out.println("합계: " + sum);
				
		}while(num != 0); // 0이 아니면 계속 계산
		*/
		//반복구간
		
		while(true) {
			
			num  =  sc.nextInt();
			sum = sum + num;
			System.out.println("합계: " + sum);			

			if(num == 0 ) { // num 0 이면 끝 --> while문을 나가라 -->break
				break;
			}
			
		}
		
		System.out.println("종료");
		
		sc.close();	
	}

}
