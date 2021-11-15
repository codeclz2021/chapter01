package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 && --> 깐깐하다
		System.out.println("&&연산자");
		System.out.println(true&&true);   //true
		System.out.println(true&&false);  //false
		System.out.println(false&&true);  //false
		System.out.println(false&&false); //false 
		
		
		//&&연산자 응용
		System.out.println("&&연산자 응용");
		System.out.println( (a>b)&&(a<b) );  // F&&T --> F
		System.out.println( (a>b)&&(a>b) );  // F&&F --> F
		
		
		//논리연산자 || --> 착하다
		System.out.println("||연산자");
		System.out.println(true||true);   //true
		System.out.println(true||false);  //true
		System.out.println(false||true);  //true
		System.out.println(false||false); //false 
		
		//||연산자 응용
		System.out.println("||연산자 응용");
		System.out.println( (a>b)||(a<b) );  //5>7 F   5<7 T    F||T --> T 
		
		
		//논리연산자 ! --> 반대
		System.out.println("!연산자");
		System.out.println(!true); 
		System.out.println(!false);
		
		System.out.println(a>b); //5>7 F
		System.out.println( !(a>b) ); // !F --> true    !a
		
		
	}
	
	
}
