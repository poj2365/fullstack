package com.bs.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker; // 제조사 정보
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public abstract String printInformation();
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
}
