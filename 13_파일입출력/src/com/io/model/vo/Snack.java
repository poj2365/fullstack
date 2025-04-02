package com.io.model.vo;

public class Snack {
	private String name;
	private int price;
	private String maker;
	
	public Snack() {
		// TODO Auto-generated constructor stub
	}
	
	public Snack(String name, int price, String maker) {
		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
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

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return name + ","+ price + "," + maker + "\n";
	}
	
	
}
