package com.extra.controller;

import com.extra.model.vo.Student;

public class BuilderPatternController {
	public static void main(String[] args) {
		// 빌더 패턴에 대해 알아보자
		// 내부 클래스를 이용해서 객체를 생성하는 방식
		Student s= Student.builder("안녕")
				.name("유병승")
				.build();
	}
}
