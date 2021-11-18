package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num == 0 ) { //0이면 종료
				System.out.println("종료");
				break;
			}else if(num%3==0) {
				System.out.println("3의 배수 입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
				
		}

		sc.close();
		
	}

}
