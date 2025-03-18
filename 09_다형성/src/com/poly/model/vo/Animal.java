package com.poly.model.vo;

public abstract class Animal {
	private String name;
	private String color;
	private double weight;
	private int height;
	private int legs;
	private int age;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name, String color, double weight, int height, int legs, int age) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.legs = legs;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void bark();
	public abstract void move();
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", weight=" + weight + ", height=" + height + ", legs="
				+ legs + ", age=" + age + "]";
	}
	
	
}
