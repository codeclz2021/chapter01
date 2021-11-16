package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");

		int time = sc.nextInt();
		int pay;

		if (time > 8) { // 형변환 체크할것
			pay = 10000 * 8 + (int) (10000 * 1.5) * (time - 8);
		} else {
			pay = 10000 * time;
		}

		System.out.println("임금은 " + pay + "원 입니다.");

		sc.close();

	}
}
