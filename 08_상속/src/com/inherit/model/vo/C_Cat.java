package com.inherit.model.vo;

public class C_Cat extends C_Animal{
	
	@Override
	public void move() {
		System.out.println(getName()+ "이 우당탕탕 움직임");
	}
	@Override
	public void bark() {
		System.out.println(getName()+ "이 멍멍멍!!!");
	}

}
