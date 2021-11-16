package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();
		
		if(num>=60) {
			//true일때만
			System.out.println("합격입니다.");
		}else {
			//false일때만
			System.out.println("불합격입니다.");
		}
		
		//System.out.println("프로그램종료");
		sc.close();
		
		//System.out.println("프로그램종료");
	}

}
