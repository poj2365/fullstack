package com.inherit.model.vo;

import java.util.Arrays;

public class B_Developer extends B_Person{
//	private String name;
//	private int age;
//	private char gender;
	private int career;
	private String[] language;
	
	public B_Developer() {
		
	}

	public B_Developer(String name, int age, char gender, int career, String[] language) {
		super(name,age,gender);
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
		this.career = career;
		this.language = language;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}
	
	public String infoDev() {
		return infoPerson()+" "+career + " "+ Arrays.toString(language);
	}
}
