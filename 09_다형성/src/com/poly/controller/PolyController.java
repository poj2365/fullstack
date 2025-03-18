package com.poly.controller;

import java.util.Scanner;

import com.poly.model.vo.A_Child;
import com.poly.model.vo.A_Child2;
import com.poly.model.vo.A_Parent;
import com.poly.model.vo.A_Person;
import com.poly.model.vo.B_AbstractChild;
import com.poly.model.vo.B_AbstractImplement;
import com.poly.model.vo.B_AbstractImplement2;
import com.poly.model.vo.B_AbstractIncludeAbstractMethod;
import com.poly.model.vo.B_AbstractParent;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Student;
import com.poly.model.vo.Teacher;

public class PolyController {// 3/18
	public void basicTest() {
		A_Parent parent;
		parent = new A_Parent();
		A_Child child = new A_Child();
		A_Child2 child2 = new A_Child2();

		// 부모 클래스 타입의 변수는 자식 객체를 저장할 수 있다.
		parent = new A_Child();
//		parent = new A_Child2();
		// 상속 관계 일때만 가능

		// 자식 클래스 타입의 변수에 부모 객체를 저장하기 -> 불가능
//		child = new A_Parent();

		// 부모클래스 타입의 변수에 자식 객체가 저장되었을때
		// 부모에 설정된 내용만 접근이 가능
		System.out.println(parent);
		parent.setParentDate("부모");
		System.out.println(parent.getParentDate());

		// 원본 자식 객체로 변경하려면 강제 형변환을 해야한다
		child = (A_Child) parent;
		System.out.println(child.getParentDate());
		((A_Child) parent).setChildAge(100);
		System.out.println(((A_Child) parent).getChildAge());

		// Object 클래스 타입의 변수는 자바에서 사용하는 모든 객체를 저장할 수 있다.
		Object o;
		o = new String("test");
		o = new Scanner(System.in);
		o = new A_Parent();
		o = new A_Child();
		o = new A_Child2();
		o = new int[10];

		// 객체 배열 이용하기
		Employee[] employee = new Employee[5];
		Teacher[] teacher = new Teacher[5];

		A_Person[] persons = new A_Person[10];
		persons[0] = new Employee("김경주", 28, '여', 100, "개발");
		persons[1] = new Teacher("박서영", 28, '여', "영어", 3);
		persons[2] = new Employee("이난희", 28, '여', 100, "개발");
		persons[3] = new Student("유병승", 19, '남', new String[] { "자바", "오라클" }, 0);
		persons[4] = new Teacher("박지성", 30, '남', "자바", 3);

		for (int i = 0; i < persons.length; i++) {
//			System.out.println(persons[i]);
			// 각 타입에 맞춰서 데이터를 출력하기
			// instanceof 연산자 이용
			if (persons[i] instanceof Employee) {
				Employee e = (Employee) persons[i];
				System.out.println(e.getName() + " " + e.getAge() + " " + e.getGender() + " " + e.getSalary() + " "
						+ e.getJobName());
			} else if (persons[i] instanceof Teacher) {
				Teacher t = (Teacher) persons[i];
				System.out.println(
						t.getName() + " " + t.getAge() + " " + t.getGender() + " " + t.getMajor() + " " + t.getYear());
			}
		}

		// 저장된 사람의 객체별 수 구하기
		// 학생 : 00명
		// 선생 : 00명
		// 사원 : 00명
		// 총 : 00명
		// 출력하기
		int cntEmployee = 0;
		int cntTeacher = 0;
		int cntStudent = 0;
		// 내풀이
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i] instanceof Employee) {
//				cntEmployee++;
//			} else if (persons[i] instanceof Teacher) {
//				cntTeacher++;
//			} else if (persons[i] instanceof Student) {
//				cntStudent++;
//			}
//		}
		// 선생님 풀이
		int totalAge=0, index=0;
		Teacher[] eng= new Teacher[persons.length];
		for (A_Person p : persons) {
			if (p != null) {
				if (p instanceof Employee) {
					cntEmployee++;
				} else if (p instanceof Teacher) {
					cntTeacher++;
					if(((Teacher)p).getMajor().equals("영어")) {
						eng[index++] = (Teacher)p;
					}
				} else if (p instanceof Student) {
					cntStudent++;
				}
				totalAge += p.getAge();
			}
		}
		int resultCnt = cntStudent + cntTeacher + cntEmployee;
		System.out.println("학생 : " + cntStudent + "명");
		System.out.println("선생 : " + cntTeacher + "명");
		System.out.println("사원 : " + cntEmployee + "명");
		System.out.println("총 : " + resultCnt + "명");

		// 등록된 사람들의 평균 나이 구하기
		int resultAge = 0;
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
				resultAge += persons[i].getAge();
			}
		}
		System.out.println("등록된 사람들의 평균 나이 : " + (double)resultAge / resultCnt);
		System.out.println("등록된 사람들의 평균 나이 : " + (double)totalAge / resultCnt);
		System.out.println("등록된 사람 중 선생이고 담당과목이 영어인 사람 정보 : " + eng);

		// 등록된 사람 중 선생이고 담당과목이 영어인 사람 정보 출력하기
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Teacher) {
				if (((Teacher) persons[i]).getMajor().equals("영어")) {
					Teacher t = (Teacher) persons[i];
					System.out.println(t.getName() + " " + t.getAge() + " " + t.getGender() + " " + t.getMajor() + " "
							+ t.getYear());
				}
			}
		}
		
		// 동적 바인딩 테스트
		A_Parent parent2 = new A_Child();
		parent2.dynamicTest();
		((A_Child)parent2).dynamicTest();
		parent2 = new A_Parent();
		parent2.dynamicTest();
		
		printPerson(new A_Person("유병승",19,'남'));
		printPerson(new Teacher("양지혁",22,'남',"수학",15));
		
	
	}
	
	public void printPerson(A_Person param) {
		System.out.println(param.toString());
		if(param instanceof Teacher) {
			Teacher t =(Teacher)param;
			t.toString();
		}
	}
	
	public A_Person makePerson(String title) {
		switch (title) {
		case "student": return new Student();
		case "teacher": return new Teacher();
		case "employee": return new Employee();
		default:
			return null;
		}
	}
	
	public void abstractClassTest() {
		// 추상 클래스 이용하기
		// 생성이 불가능함
//		B_AbstractParent ap = new B_AbstractParent();
		// 타입으로 선언은 가능
		B_AbstractParent ap;
		
		// 추상 클래스는 자식 클래스가 상속해서 이용하는 클래스
		ap= new B_AbstractChild();
		System.out.println(ap.getTest());
		
		// 클래스에 선언된 메소드 중 추상 메소드가 있으면
		// 반드시 추상 클래스로 선언
		
		B_AbstractIncludeAbstractMethod aiam;
//		aiam = new B_AbstractImplement();
		aiam = new B_AbstractImplement2();
		aiam.test();
	}
	
	public void testCheck(B_AbstractIncludeAbstractMethod param) {
		param.test();
	}
}
