package com.extra.model.vo;

import java.util.Objects;

import com.extra.common.Gender;

public class Student {
	private String name;
	private int age;
	private double height;
	private String address;
//	private char gender;
	private Gender gender;
	
//	private var test;
	
	private Student() {
		// TODO Auto-generated constructor stub
	}

	private Student(String name, int age, double height, String address, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.address = address;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	//내부클래스로 생성하는 로직을 작성
	public static class Builder{
		private String name;
		private int age;
		private double height;
		private String address;
		private Gender gender;
		
		public Builder() {}
		
		public Builder name(String value) {
			this.name=value;
			return this;
		}
		public Builder age(int value) {
			this.age=value;
			return this;
		}
		public Builder height(double value) {
			this.height=value;
			return this;
		}
		public Builder gender(Gender value) {
			this.gender=value;
			return this;
		}
		public Builder address(String value) {
			this.address=value;
			return this;
		}
		public Student build() {
			return new Student(name,age,height,address,gender);
		}
	}
	
//	public static Builder builder(String name) {
	public static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + ", address=" + address + ", gender="
				+ gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, gender, height, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && gender == other.gender
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
	}
	
	public Student(String name) {
		this.name=name;
	}
	
	private void testRelection() {
		System.out.println("test실행함");
	}
	
	
	
	
}
