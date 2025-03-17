package com.bs.hw.member.model.vo;

public class Member {
	private String id;
	private String name;
	private String password;
	private String email;
	private String gender;
	private int age;

	public Member() {
	}

	public Member(String id, String name, String password, String email, String gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String inform() {// Member 클래스의 모든 필드	값들을 합쳐 반환
//		return "이름 : "+id + " / 과목 : " + subject + " / 점수 : " + score;
		return id +" "+ name +" "+ password +" "+ email +" "+ gender +" "+ age;
	}
}
