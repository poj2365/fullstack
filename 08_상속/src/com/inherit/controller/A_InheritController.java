package com.inherit.controller;

import com.inherit.model.vo.A_Child;
import com.inherit.model.vo.A_Child2;
import com.inherit.model.vo.B_Developer;

public class A_InheritController {// 3/17
	
	public void basicInherit() {
		// 기본 상속에 대해 알아보자
		// 선언되어 있는 클래스의 내용을 가져와 사용
		// 클래스 간의 관계를 설정
		// 클래스 선언부에 extends 예약어를 사용해서 설정
		// ex) public class child(sub) extends parent(super){}
		
		A_Child child = new A_Child();
		child.gender = '남';
		child.test();
		System.out.println(child.gender);
		child.setData("우와 신기해");
		System.out.println(child.getData());
		
		A_Child child2 = new A_Child();
		System.out.println(child2.gender);
				
		// 부모 클래스의 필드, 메소드에 접근할때 부모 클래스에 선언된 접근제한자 우선처리
//		child2.weight = 66.4;
		
		child.setNames(new String[] {"월요일","화요일","수요일"});
		A_Child2 child3 = new A_Child2();
		child3.setData("test");
		child.setData("test22222");

		// 직업별 사람을 관리하는 프로그램
		// 개발자, 강사, 회사원, 학생
		// 개발자 : 이름 , 나이 , 성별 , 경력, 주언어
		// 강사 : 이름 , 나이 , 성별 , 경력 , 주과목, 연봉
		// 회사원 : 이름 , 나이 , 성별 , 연차 , 직급, 부서
		// 학생 : 이름 , 나이 , 성별 , 학년 , 학과, 학교
		B_Developer developer = new B_Developer();
		developer.setName("유병승");
		developer.setAge(19);
		developer.setCareer(1);
		developer.setGender('남');
		developer.setLanguage(new String[] {"자바","자바스크립트"});
		B_Developer dev =new B_Developer("양지혁",20,'남',10,new String[] {"자바","파이썬","코틀린","자바스크립트"});
		System.out.println(developer.getName()
				+ " "+ developer.getAge()
				+" "+developer.getGender()
				+" "+developer.getCareer()
				+" "+developer.getLanguage()
		);
		System.out.println(dev.getName()
				+ " "+ dev.getAge()
				+" "+dev.getGender()
				+" "+dev.getCareer()
				+" "+dev.getLanguage()
		);
		
		System.out.println(developer.infoDev());
		System.out.println(dev.infoDev());
		
		// 상속은 계층구조가 있음
		// 자식은 부모, 부모의 부모, 부모의 부모의 부모의 모든 것을 가져와 사용
		dev.setData("우와 대박");
		System.out.println(dev.getData());
	}
}
