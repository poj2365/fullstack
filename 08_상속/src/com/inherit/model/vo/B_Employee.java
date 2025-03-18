package com.inherit.model.vo;

import java.util.Arrays;

public class B_Employee extends B_Person{
	
//	private String name;
//	private int age;
//	private char gender;
	private int year;
	private String jobName;
	private String departmentName;
	
	
	
	public B_Employee() {
	}

	public B_Employee(String name, int age, char gender, int year, String jobName, String departmentName) {
		super(name,age,gender);
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
		this.year = year;
		this.jobName = jobName;
		this.departmentName = departmentName;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String infoEmp() {
		return infoPerson()+" "+year + " "+jobName + " "+  departmentName;
	}
	
}
