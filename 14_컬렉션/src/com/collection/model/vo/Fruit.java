package com.collection.model.vo;

import java.util.Objects;

public class Fruit {
	private String name;
	private String region;
	private int stock;
	private int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Fruit(String name, String region, int stock, int price) {
		super();
		this.name = name;
		this.region = region;
		this.stock = stock;
		this.price = price;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Fruit [name=" + name + ", region=" + region + ", stock=" + stock + ", price=" + price + "]";
	}

	


}
