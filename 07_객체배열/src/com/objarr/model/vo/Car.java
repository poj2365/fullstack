package com.objarr.model.vo;

public class Car {

	private String carType;
	private String carColor;
	private int km;
	private String carName;
	
	public Car() {
		
	}
	
	public Car(String carType, String carColor,int km,String carName) {
		this.carType=carType;
		this.carColor=carColor;
		this.km=km;
		this.carName=carName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}
