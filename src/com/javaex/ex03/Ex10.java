package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("코드를 입력하세요");
		
		int code = sc.nextInt();
		
		switch(code) {
			case 1:
				System.out.println("101호입니다.");
				break;
			case 2:
				System.out.println("201호입니다.");
				break;
			case 3:
				System.out.println("301호입니다");
				break;
			case 4:
				System.out.println("401호입니다.");
				break;
			default :
				System.out.println("상담원");
				break;	
		}
		
		sc.close();
	}

}
