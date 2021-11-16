package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("과목번호를 입력하세요");
		System.out.print("과목번호:");
		int code = sc.nextInt();
		
		if(code==1) {
			System.out.println("101호");
		}else if(code==2) {
			System.out.println("202호");
		}else if(code==3) {
			System.out.println("303호");
		}else if(code==4) {
			System.out.println("404호");
		}else {
			System.out.println("상담원");
		}
		
		
		sc.close();
		
		
	}
}
