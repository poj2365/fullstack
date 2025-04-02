package com.generic.model.vo;


public class Employee extends Person{
	private int salary;
	private String jobName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, char gender, int salary, String jobName) {
		this.salary = salary;
		this.jobName = jobName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	
}
