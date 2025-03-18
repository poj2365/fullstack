package com.poly.model.vo;

public class A_Parent {// 3/18
	private String parentDate;
	
	public A_Parent() {
		// TODO Auto-generated constructor stub
	}

	public A_Parent(String parentDate) {
		super();
		this.parentDate = parentDate;
	}

	public String getParentDate() {
		return parentDate;
	}

	public void setParentDate(String parentDate) {
		this.parentDate = parentDate;
	}
	
	@Override
	public String toString() {
		return "Parent 클래스 : "+parentDate;
	}
	
	public void dynamicTest() {
		System.out.println("부모 메소드야!");
	}
}
