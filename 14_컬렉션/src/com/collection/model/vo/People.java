package com.collection.model.vo;

import java.util.Comparator;

public class People implements Comparator{
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;

	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String name, int age, char gender, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight="
				+ weight + "]";
	}
	
	@Override
	public int compare(Object o, Object o1) {
		Person prev = (Person) o;
		Person next = (Person) o1;
		return next.getName().compareTo(prev.getName());
	}
	
	
}