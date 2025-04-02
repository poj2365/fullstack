package com.info.model.vo;

import java.util.Arrays;

public class Driver extends People{
	private String area;
	private int year;
	
	public Driver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+" "+area+" "+year;
	}
	
	@Override
	public boolean equals(Object driver) {
		if(this==driver) {
			return true;
		}
		Driver d =(Driver)driver;
		if(super.equals(d) && this.area==d.area && this.year == d.year) {
			return true;
		}
		return false;
	}
	
	public Driver(String area, int year) {
		super();
		this.area = area;
		this.year = year;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
