package com.extra.model.vo;

public record Animal(String name,int age, double weight) {
	
	
	@Override
	public String toString() {
		return name + ","+age+","+weight; 
	}
	
	
}
