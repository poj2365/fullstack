package com.generic.model.vo;


public class Student extends Person{
	private int grade;
	private int classNumer;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, char gender, int grade, int classNumer) {
		this.grade = grade;
		this.classNumer = classNumer;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", classNumer=" + classNumer + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNumer() {
		return classNumer;
	}

	public void setClassNumer(int classNumer) {
		this.classNumer = classNumer;
	}

	
	
}
