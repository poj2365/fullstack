package com.info.model.vo;

public class Employee extends People{
	private String document;
	private String phoneNo;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+document+" "+phoneNo;
	}
	
	@Override
	public boolean equals(Object employee) {
		if(this==employee) {
			return true;
		}
		Employee e =(Employee)employee;
		if(super.equals(e) && this.document==e.document && this.phoneNo == e.phoneNo) {
			return true;
		}
		return false;
	}

	public Employee(String document, String phoneNo) {
		super();
		this.document = document;
		this.phoneNo = phoneNo;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
