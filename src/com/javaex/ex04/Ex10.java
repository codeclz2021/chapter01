package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
	
		for(int i=1; i<=10; i++) {
			
			//2의 배수 이면서 3의 배수이냐?  -->6이냐?
			if( (i%2==0) && (i%3==0) ) {
				//break;
				continue;
			}
			
			System.out.println(i);
		} //for문의 끝
		
	}

}
