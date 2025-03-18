package com.poly.model.vo;

public class A_Child extends A_Parent{// 3/18
	
	private int childAge;
	
	public A_Child() {
		// TODO Auto-generated constructor stub
	}

	public A_Child(int childAge) {
		super();
		this.childAge = childAge;
	}

	public int getChildAge() {
		return childAge;
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}

	@Override
	public String toString() {
		return "A_Child 클래스 childAge= " + childAge;
	}
	
	@Override
	public void dynamicTest() {
		System.out.println("자식 메소드야!");
	}
}
