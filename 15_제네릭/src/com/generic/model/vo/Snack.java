package com.generic.model.vo;

public class Snack implements Comparable<Snack>{
	private String name;
	private int price;
	private String type;
	private String flavor;
	public Snack() {
		// TODO Auto-generated constructor stub
	}
	public Snack(String name, int price, String type, String flavor) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.flavor = flavor;
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
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	@Override
	public String toString() {
		return "Snack [name=" + name + ", price=" + price + ", type=" + type + ", flavor=" + flavor + "]";
	}
	
	@Override
	public int compareTo(Snack s) {
		return price-s.price;
	}
}
