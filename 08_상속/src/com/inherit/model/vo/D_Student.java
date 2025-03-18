package com.inherit.model.vo;

import java.util.Arrays;
import java.util.Objects;

public class D_Student extends D_Person{
	private String[] subjects;
	private int classNo;
	
	public D_Student() {
		// TODO Auto-generated constructor stub
	}

	public D_Student(String name, int age, char gender,String[] subjects, int classNo) {
		super(name,age,gender);
		this.subjects = subjects;
		this.classNo = classNo;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubject(String[] subjects) {
		this.subjects = subjects;
	}

	public int getClassNo() {
		return classNo;
	}

	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+Arrays.toString(subjects)+" "+classNo;
	}
	
	@Override
	public boolean equals(Object student) {
		if(this==student) {
			return true;
		}
		D_Student s =(D_Student)student;
//		if(this.classNo==s.classNo && super.getName().equals(s.getName()) && getAge() == s.getAge())
		if(super.equals(s) && this.classNo==s.classNo) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.getName(),super.getAge(),getGender(),classNo);
	}
}
