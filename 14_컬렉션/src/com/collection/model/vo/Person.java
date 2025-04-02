package com.collection.model.vo;

import java.util.Objects;

public class Person implements Comparable{// 객체 간 정렬할 때 우선순위를 설정
	private String name;
	private int age;
	private double height;
	private char gender;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(Object o) {
		System.out.println("매개변수 Object 받는 생성자");
		System.out.println(o);
	}
	
	public Person(String name, int age, double height, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	// Tree저장소 구조 안에 반드시 필요
	@Override
	public int compareTo(Object o) {
		return (int)Math.ceil(height-((Person)o).height);
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (o instanceof Person) {
			Person p = (Person) o;
			if (this.name.equals(p.name) && this.age == p.age && this.height == p.height && this.gender == p.gender) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() { // equals()를 오버라이드하면, hashCode()도 같이 오버라이드하는 게 원칙
		return Objects.hash(name, age, height, gender);
	}
	
	public /* static */ void referenceMethodTest(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
			if(p.age >20) {
				System.out.println(p);
			}
			
		}
	}
}