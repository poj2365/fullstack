package com.inherit.model.vo;

public /* final */ class D_Person{// final -> 상속 불가능
	private String name;
	private int age;
	private char gender;
	
	public D_Person() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return name + " "+age +" " + gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		D_Person p = (D_Person)obj;
		if(p.name.equals(this.name) && p.age==age && p.gender == gender) {
			return true;
		}
		return false;
	}
	
	public D_Person(String name, int age, char gender) {
		super();
		this.name = name;
		if(age>10) {
			this.age = age;
		}
		if(gender=='남'|| gender=='여') {
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
		if(age>10) {
			this.age = age;
		}
	}
	private boolean ageChk() {
		return age>10;
	}
	private boolean genderChk() {
		return gender=='남'|| gender=='여';
	}
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if(gender=='남'|| gender=='여') {
			this.gender = gender;
		}
	}
	
}
