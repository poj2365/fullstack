package com.collection.model.vo;

import java.util.Objects;

public class Snack {
	private String name;
	private int price;
	private String type;
	private String taste;
	
	public Snack() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Snack(String name, int price, String type, String taste) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.taste = taste;
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



	public String getTaste() {
		return taste;
	}



	public void setTaste(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Snack [name=" + name + ", price=" + price + ", type=" + type + ", taste=" + taste + "]";
	}

}
