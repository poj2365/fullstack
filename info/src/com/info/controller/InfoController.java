package com.info.controller;

import java.util.Scanner;

import com.info.model.vo.Driver;
import com.info.model.vo.Employee;
import com.info.model.vo.People;
import com.info.model.vo.Student;
import com.info.model.vo.Teacher;

public class InfoController {
	public Scanner sc = new Scanner(System.in);
	
	public void info() {
		People p = new People();
		System.out.println(p.toString());
		p.setName("테스트");
		p.setAge(19);
		p.setGender("남자");
		Student s = new Student();
		s.setName("학생");
		s.setAge(19);
		s.setGender("남자");
		s.setSubjects(new String[] {"java","Ruby"});
		s.setClassNo(1);
		System.out.println(s.toString());
		Teacher t = new Teacher();
		System.out.println(t.toString());
		t.setName("선생님");
		t.setAge(39);
		t.setGender("남자");
		t.setChargeSubject("JPA");
		t.setMajorSubject("ruby");
		System.out.println(t.toString());
		Employee e = new Employee();
		e.setName("직원");
		e.setAge(49);
		e.setGender("남자");
		e.setDocument("R&D 개발팀");
		e.setPhoneNo("010-1234-1234");
		System.out.println(e.toString());
		com.info.model.vo.Driver d = new Driver();
		d.setName("운전기사");
		d.setAge(59);
		d.setGender("남자");
		d.setArea("구로시");
		d.setYear(30);
		System.out.println(d.toString());
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("반 : ");
		int classNo = sc.nextInt();
		System.out.print("담당지역 : ");
		String area = sc.next();
		System.out.print("운전경력 : ");
		int year = sc.nextInt();
		System.out.print("전공과목 : ");
		String major = sc.next();
		System.out.print("부서 : ");
		String document = sc.next();
		
		if(p.getName().equals(name) && p.getAge()==age) {
			if(p.getGender().charAt(0)==gender.charAt(0)) {
				if(s.getClassNo()==classNo) {
					System.out.println("학생과 같은 객체");
					System.out.println(s.toString());
				}else if(d.getArea().equals(area) && d.getYear()==year){
					System.out.println("운전과 같은 객체");
					System.out.println(d.toString());
				}
			}
			if(t.getMajorSubject().equals(major)){
				System.out.println("선생과 같은 객체");
				System.out.println(t.toString());
			}
			if(e.getDocument().equals(document)){
				System.out.println("직원과 같은 객체");
				System.out.println(e.toString());
			}
		}
		
		
		
	}
}
