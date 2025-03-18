package com.poly.model.vo;

import java.util.Arrays;

public class Student extends A_Person{
	private String[] subjects;
	private int grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, char gender, String[] subjects, int grade) {
		super(name, age, gender);
		this.subjects = subjects;
		this.grade = grade;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [subjects=" + Arrays.toString(subjects) + ", grade=" + grade + "]";
	}
		
}
