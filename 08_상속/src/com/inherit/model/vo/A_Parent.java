package com.inherit.model.vo;

public class A_Parent {// 3/17
	private String data;
	int num;
	protected double weight;
	public char gender;
	
	public A_Parent() {
		
	}
	
	public A_Parent(String data) {
		this.data=data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data =data;
	}
	
	public void test() {
		System.out.println("Parent의 test메소드");
	}
}
