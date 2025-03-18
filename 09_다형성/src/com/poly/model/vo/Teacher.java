package com.poly.model.vo;

public class Teacher extends A_Person{
	private String major;
	private int year;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, char gender, String major, int year) {
		super(name, age, gender);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Teacher [major=" + major + ", year=" + year + "]";
	}
	
	
}
