package com.objarr.model.vo;

public class Food {// 3/14 객체배열
	
	private String name;
	private int price;
	private String type;

	public Food() {
		
	}
	public Food(String name, int price, String type) {
		this.name=name;
		this.price=price;
		this.type= type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
