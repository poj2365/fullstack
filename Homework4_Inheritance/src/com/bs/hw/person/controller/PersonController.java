package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int cnt = 0;
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				cnt++;
			}
		}
		for (int j = 0; j < e.length; j++) {
			if (e[j] != null) {
				count++;
			}
		}
		int[] result = new int[] { cnt, count };
		return result;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = new Student();
				s[i].setName(name);
				s[i].setAge(age);
				s[i].setHeight(height);
				s[i].setWeight(weight);
				s[i].setGrade(grade);
				s[i].setMajor(major);
				return;
			}
		}
	}

	public Student[] printStudent() {
		return s;

	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for (int i = 0; i < e.length; i++) {
			if (e[i] == null) {
				e[i] = new Employee();
				e[i].setName(name);
				e[i].setAge(age);
				e[i].setHeight(height);
				e[i].setWeight(weight);
				e[i].setSalary(salary);
				e[i].setDept(dept);
				return;
			}
		}
	}

	public Employee[] printEmployee() {
		return e;

	}
}
