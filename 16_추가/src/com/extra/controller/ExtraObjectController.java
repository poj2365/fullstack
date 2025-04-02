package com.extra.controller;

import java.time.Month;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.extra.common.Command;
import com.extra.common.Gender;
import com.extra.common.StudentController;
import com.extra.model.vo.Animal;
import com.extra.model.vo.Student;

public class ExtraObjectController {
	public static void main(String[] args) {
		// Enum 객체 활용하기
		// EnumType -> 특정 카테고리 내용을 정의할때
		// enumType에 값을 대입하기
		Gender gender;
		gender = Gender.M;
		
		Student s = Student.builder()
				.name("유병승")
				.gender(Gender.M)
				.address("경기도 시흥시")
				.build();
		Student s1= Student.builder()
				.name("양지혁")
				.gender(Gender.M)
				.address("서울시 광진구")
				.build();
		Student s2 = Student.builder()
				.name("박서영")
				.gender(Gender.F)
				.address("서울시 영등포구")
				.build();
		
		if(s.getGender()==s1.getGender()) {
			System.out.println("같은 성벌임");
		}

		// enum 에 설정된 값 확인하기
		System.out.println(Gender.M.getGender());
		// enumType에 매핑된 값 출력하기
		System.out.println(s.getGender().getGender());
		// enumType 값 출력
		System.out.println(s.getGender().name());
		// 내부에서 사용하는 숫자 값을 출력하기
		System.out.println(s.getGender().ordinal());
		
//		Month.MARCH -> enum 타입
		System.out.println(Command.CREATE_DIR.getCommend().replace("$path", "/home/ubuntu"));
		
		StudentController.controller.mainMenu();
		StudentController.controller.insertStudent();
		
		// Record 객체
		// 데이터 보관용 클래스를 간편하게 해주는 객체
		// getter/setter를 선언하지 않음
		// 수정이 불가능한 객체 필드가 final로 선언됨
		// 자동으로 getter, toString, hashCode, equals 생성해줌
		Animal a = new Animal("덕만이",7,5.4);
		System.out.println(a);
		Animal a2 = new Animal("춘식이",5,5.5);
		System.out.println(a2);
		Animal a3 = new Animal("춘식이",5,5.5);
		System.out.println(a3);
		Set<Animal> set = new HashSet();
		set.add(a);
		set.add(a2);
		set.add(a3);
		System.out.println(set);
		// 필드값 가져오기
		System.out.println(a.name());
		System.out.println(a.age());
		// 필드 수정하기-> 불가능
  //		a.name="만덕이";
		
		// 타입 추론하는 예약어 사용하기
		// 지역변수에서만 사용이 가능
		// var 예약어
		var name = "유병승";
		var age = "19";
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7);
		for(var n : numbers) {
			
		}
//		var data; var 는 선언과 동시에 선언해줘야됨
		
		// 자료형을 확인하는 instanceof
		// switch 패턴 매칭 문법
		Object o = new String("switch");
//		switch(o) {
//		case String s->{System.out.println(s.length());
//		}
	}
}
