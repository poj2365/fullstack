package com.obj.controller;

import java.util.Scanner;

import com.obj.model.vo.Product;

public class MyMethod {// 3/12 메소드
	// 메소드 선언하기
	// 접근제한자(public) 반환형(기본, 참조형, void) 메소드명([매개변수]){로직}
	// 유형별 메소드 선언해보기
	// 1. 반환형이 없고, 매개변수 없는 메소드를 선언하기
	public void test1() {// 인스턴스 메소드
		System.out.println("매개변수 없고 반환형 없는 메소드");

	}

	// 2. 반환형이 없고, 매개변수 있는 메소드 선언하기
	public void test2(String msg) {
		System.out.println(msg + "출력메세지");
	}
	
	// 3. 반환형이 있고 매개변수 없는 메소드 선안하기
	// 메소드의 반환형을 설정하면 반드시 {} 내부에 return 예약어를
	// 이용해서 반환형으로 선언한 이 값을
	public int test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 숫자 입력 : ");
		int su = sc.nextInt();
		if (su>0) {
			return su;
		}
		System.out.println("이거 실행할거야");
		return su;
//		return sc.nextInt();
	}
	
	// 4. 반환형이 있고 매개변수 있는 메소드 선언하기
	public long test4(int su, int su1) {
		su+=200;
		su1*=10;
		return su*su1;
	}
	
	// 자주 사용하는 중복되는 코드를 메소드로 만들어서 활용
	// myobject - MemberMain에서 실습함
	
	// 매개변수, 반환형에 참조형 타입 선언하기
	public int test5(int num) {// 반환형이 아닐경우 데이터 수정해도 반환이 안됨
		return num*100;
	}
	public void test6(int[] num) {// 주소를 전달할 경우 반환형이 없을지라도 데이터 수정 가능
		num[0]*=100;
	}
	public void test7(Product p) { // 주소를 전달할 경우 반환형이 없을지라도 데이터 수정 가능
		p.productPrice*=0.5;
	}
	
	public static String test;
	// 메소드의 예약어
	// synchronized abstract -> 나중에
	// static 
	public static void test8() {
		System.out.println("static 메소드 실행");
		// 필드 접속 불가능하다
		test = "호호호";
	}
	
	public static String errorMessage(int code) {
		String message = "";
		switch(code) {
		case 404 : message = "없는 페이지입니다"; break;
		case 500 : message = "서버상 페이지입니다"; break;
		case 403 : message = "이용권한이 없습니다"; break;
		default : message = "정의되지 않는 에러코드 입니다.";
		}
		return message;
	}
	
	
}
