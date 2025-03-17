package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;

public class CircleController {
	
//	public static double pi = 3.141592;
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(x);
		c.setRadius(radius);
		double result = radius * radius * Math.PI;
		return "면적(PI * 반지름 * 반지름) : "+String.valueOf(result);
	}

	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(x);
		c.setRadius(radius);
		double result = Math.PI * radius * 2;
		return "둘레(PI * 반지름 * 2) : "+String.valueOf(result);
	}
	
}
