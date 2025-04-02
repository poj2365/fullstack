package com.collection.model.vo;

import java.util.Objects;

public class Food {
	private String name;
	private int price;
	private String type;
	private int rating;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Food(String name, int price, String type, int rating) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.rating = rating;
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



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", type=" + type + ", rating=" + rating + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==this) return true;
		else if (o instanceof Food) {
			Food f =(Food) o;
			if(this.name.equals(f.name) && this.price==f.price && this.type.equals(f.type)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() { //equals()를 오버라이드하면, hashCode()도 같이 오버라이드하는 게 원칙
		return Objects.hash(name,price,type);
	}
}
