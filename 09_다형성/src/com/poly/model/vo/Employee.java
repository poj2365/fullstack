package com.poly.model.vo;

public class Employee extends A_Person{
	private int salary;
	private String jobName;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(String name, int age, char gender, int salary, String jobName) {
	super(name, age, gender);
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

@Override
public String toString() {
	return "Employee [salary=" + salary + ", jobName=" + jobName + "]";
}


}
