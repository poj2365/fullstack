package com.poly.model.vo;

public class A_Person {
	private String name;
	private int age;
	private char gender;
	
	public A_Person() {
		// TODO Auto-generated constructor stub
	}
	
	public A_Person(String name, int age, char gender) {
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

	@Override
	public String toString() {
		return "A_Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
}
