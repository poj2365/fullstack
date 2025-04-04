package com.inherit.model.vo;

public class B_Person extends A_Parent{
	private String name;
	private int age;
	private char gender;
	
	public B_Person() {
		// TODO Auto-generated constructor stub
	}

	public B_Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	protected String infoPerson() {
		return name + " " + age + " "+ gender;
	}
	
}
