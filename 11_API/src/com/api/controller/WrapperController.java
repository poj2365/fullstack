package com.api.controller;

public class WrapperController {
	public static void main(String[] args) {
		// Wrapper 클래스
		// 기본 타입을 객체화해주는 클래스
		// jvm이 알아서 처리해줌.
		int su = 10;
		Integer isu = 10;
		// 원래는 integer 는 클래스기 때문에 int 값이 들어갈 수 없음
		Double dsu = 180.5;
		su = isu;
		// 다형성 이용
		Object o;
		o = su;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// wrapper 클래스는 문자열 데이터를
		// 기본타입으로 변경하는 메소드 제공
		su = Integer.parseInt("100");
		System.out.println(su);
		String strSu="180 ";
		dsu = Double.parseDouble(strSu.trim());
		
		print(10);
		print(180.5);
		
		// 수학적 계산 메소드
		System.out.println(Math.PI);
		System.out.println(Math.round(180.5));
		System.out.println(Math.round(180.3));
		System.out.println(Math.ceil(180.1));
		System.out.println(Math.floor(180.9));
		System.out.println(Math.abs(-100)); // 절댓값 0에서부터의 값
		
		
	}
	
	public static void print(Object o) {
		// 그래서 Object 매개변수에는 모든 값이 들어갈 수 있다.
	}
}
