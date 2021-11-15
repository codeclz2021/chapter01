package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		double v01 = 5/4;         // 정수/정수-->정수 1 ---> 1.0  
		System.out.println(v01);
		
		double v02 = (double)5/4;   // (d)5/4 -->5.0/4 --->5.0/4.0 --> 1.25
		System.out.println(v02);
		
		double v03= 5/(double)4;    // 5/(d)4 --->5/4.0 ---> 5.0/4.0 -->1.25
		System.out.println(v03);
		
		double v04= (double)5 / (double)4;  // (d)5 / (d)4  ---> 5.0/4.0 -->1.25  
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;  // 1 + 1
		System.out.println(v05);
		
		int v06 = (int)(1.3+1.8);      //  (int)3.1 --->3
		System.out.println(v06);
	}
	
}
