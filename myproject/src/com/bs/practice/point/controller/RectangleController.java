package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		int result = height * width;
		return "면적(너비 * 높이) : "+String.valueOf(result);
	}

	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		int result = (height + width)*2;
		return "둘레(2 * (너비 + 높이)) :"+String.valueOf(result);
	}
}
