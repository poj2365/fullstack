package com.collection.model.vo;

import java.util.Objects;

public class Animal implements Comparable{
	private String name;
	private int age;
	private double weight;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Animal(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}



	@Override
	public int hashCode() {
		return Objects.hash(name,age,weight);
	}
	
	@Override
	public int compareTo(Object o) {
		return age-((Animal)o).getAge();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj==this) return true;
		if(obj instanceof Animal) {
			Animal a = (Animal)obj;
			if(a.name.equals(name) && a.age==age&& a.weight==weight) {
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]";
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
	
	
}
