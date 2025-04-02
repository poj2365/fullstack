package com.info.model.vo;

public class People {
	private String name;
	private int age;
	private String gender;

	public People() {
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		People p = (People)obj;
		if(p.name.equals(this.name) && p.age==age && p.gender == gender) {
			return true;
		}
		return false;
	}
	
	public People(String name, int age, String gender) {
		super();
		this.name = name;
		if(age>10) {
			this.age = age;
		}
		if(gender.equals("남")|| gender.equals("여")) {
			this.gender = gender;
		}
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
