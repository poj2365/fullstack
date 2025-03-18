package com.inter.controller;

import com.inter.common.A_BasicInter;
import com.inter.model.vo.A_BasicInterImpl;
import com.inter.model.vo.A_BasicInterImpl2;

public class A_InterfaceController {
	
	public void basicInterface() {
		// 기본 인터페이스 선언하기
		// 접근제한자 interface 인터페이스명 {추상 메소드 , static final 필드}
		// 내부 기본적으로 abstract 메소드를 선언
		// 자체 생성이 불가능한 객체, 다른 클래스가 구현해서 이용
		// 구현 클래스는 반드시 인터페이스에 선언된 메소드를 재정의 해야한다.
		// 클래스에서 구현하는 방법
		// public class 클래스명 [extends 클래스] implements 인터페이스명, 인터페이스명1
		
//		A_BasicInter inter = new A_BasicInter() {
		A_BasicInter inter;
		inter = new A_BasicInterImpl();
//		inter = new A_BasicInterImpl2();
		inter.test();
		
		System.out.println(inter.calc(20,3));
//		((A_BasicInterImpl)inter).myMethod();
		
		System.out.println(A_BasicInter.AGE);
		
		System.out.println(inter.printMsg("우와! 신기"));
		
		A_BasicInter.staticTest();
		
	
	}
}
