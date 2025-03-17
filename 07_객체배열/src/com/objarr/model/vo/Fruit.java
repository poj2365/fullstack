package com.objarr.model.vo;

public class Fruit {
	private String name;
	private double weight;
	private String color;
	private int price;
	
	public Fruit() {
		
	}
	
	public Fruit(String name, double weight, String color, int price) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String infoFruit() {
		return name + " " + weight + " " + color + " " + price;
	}
	
}
