package com.variable.controller;

public class B_StringTest {
	public static void main(String[] args) {
		// 문자열 자료형 활용하기
		// String -> 하나의 클래스(참조형)
		// 기본 자료형처럼 사용할 수 있는 클래스
		String name = "유병승";
		System.out.println(name);
		name = new String("양지혁");
		System.out.println(name);
		
		// 문자열 리터럴, 변수에 + 연산 이용하기
		// 문자열 결합연산이 됨
		String temp = "자바" + " 유병승";
		System.out.println(temp);
		String result = temp + "선생님";
		System.out.println(result);
		System.out.println(result+temp);
		
		// 다른 자료형과 문자열 + 연산하기
		result = "";
		result = "유병승 " + 19;
		System.out.println(result);
		double height = 180.5;
		System.out.println(result+height);
		
		result = "";
		result = 'A' + "는 " + 100+"점"+ "키는 " + 180.5+"cm";
		System.out.println(result);
		
		char grade = 'C';
		int point = 70;
		double inputHeight = 167.3;
		result = "";
		result = grade + "는 " + point+ "점"+" 키는 "+inputHeight+"cm";
		System.out.println(result);
		
		// String에서 제공하는 유용한 기능
		// 1. String 타입 변수에 저장된 문자열 길이 확인 기능
		String msg = "나는 풀스택 11기야";
		System.out.println(msg.length());
		System.out.println("곧 쉬시".length());
		
		// 2. 문자열 변수에 저장된 문자열 값을 한 글자씩 가져오는 기능
		// charAt(번호);
		System.out.println(msg.charAt(0));
		System.out.println(msg.charAt(1));
		System.out.println(msg.charAt(2));
		//System.out.println(msg.charAt(11));
		
		String myName = "이예찬";
		int myAge = 32;
		char gender = 'M';
		String address = "경기도 의왕시";
		String phoneNum = "010-2574-7584";
		double myHeight = 170.0;
		
		String introduce = "나의 이름은 " + myName + "이고 " + "나이는 "+ myAge + "살이고" + " 키는 " + myHeight + "cm" 
						 + "\n주소는 " + address +", 성별은 " + gender + " 전화번호 " + phoneNum + "이다.";
		System.out.println(introduce);
		System.out.println("출력문의 길이 : " + introduce.length());
		System.out.println("출력문의 4번째 문구 : " + introduce.charAt(3));
		System.out.println("출력문의 5번째 문구 : " + introduce.charAt(4));
		
	}
}
