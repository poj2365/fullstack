package com.inherit.model.vo;

public class C_Animal {
	private String name;
	private int age;
	private double weight;
	
	
	public C_Animal() {
		// TODO Auto-generated constructor stub
	}


	public C_Animal(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
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


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public void move() {
		System.out.println(name+" 앞으로 움직임");
	}

	public void bark() {
		System.out.println(name+" 울어요!");
	}
}
