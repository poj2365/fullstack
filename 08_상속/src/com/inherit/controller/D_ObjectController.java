package com.inherit.controller;

import com.inherit.model.vo.D_ObjectTest;
import com.inherit.model.vo.D_Student;

public class D_ObjectController {
	
	public void objectTest() {
		// Java 에서 기본적으로 제공하는 Object 클래스 활용하기
		// 최상위 클래스 -> 자바에서 사용하는 모든 클래스의 부모
		// root 클래스
		// extends 예약어로 상속관계를 설정하지 않아도 자동으로 설정됨.
		D_ObjectTest ot = new D_ObjectTest();
		
		// Object 클래스가 제공하는 메소드 -> 자식 클래스에서 오버라이드(재정의)해서 사용
		// equals() : 객체의 동등성 비교를 하기 위한 메소드
		// hashCode() : 객체에 부여된 숫자 id 값을 반환하는 메소드 -> 주소 값
		// clone() : 객체의 사본을 생성하는 메소드
		// toString() : 객체를 대표하는 문자열을 반환하는 메소드
		// 각 자식클래스가 필요에 따라 재정의해서 사용
		ot.setNo(1);
		ot.setName("유병승");
		D_ObjectTest ot2 = new D_ObjectTest(1,"유병승");
		System.out.println(ot);
		System.out.println(ot2);		
		System.out.println(ot==ot2);
		// 객체의 동등성 비교를 위해서는 equals() 메소드를 이용
		System.out.println(ot.equals(ot2));
//		ot.test("test");
		System.out.println("ot hashCode : "+ot.hashCode());
		System.out.println("ot2 hashCode : "+ot2.hashCode());
		D_ObjectTest ot3 = ot2.clone();
		System.out.println(ot3);
		ot3.setName("김경주");
		System.out.println(ot3);
		
		D_Student s = new D_Student("장명수",27,'남',new String[] {"자바","오라클","JDBC"},1);
		D_Student s1 = new D_Student("장명수",27,'남',new String[] {"React","angular","Vue.js"},1);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s);
		System.out.println(s1);
	}
}
