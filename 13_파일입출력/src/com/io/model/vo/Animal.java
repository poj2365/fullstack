package com.io.model.vo;

import java.io.Serializable;

public class Animal implements Serializable{
	private String name;
	private String type;
	private int age;
	private double weight;
	private char gender;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, String type, int age, double weight, char gender) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + ", age=" + age + ", weight=" + weight + ", gender=" + gender
				+ "]";
	}
	
	
}
