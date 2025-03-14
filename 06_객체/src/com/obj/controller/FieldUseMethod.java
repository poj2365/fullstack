package com.obj.controller;

public class FieldUseMethod {// 3/12 메소드
	private int no;
	private String name;
	
	public FieldUseMethod(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public String infoObject() {
		return this.no+ " "+this.name;
	}
	
	private void incrementNo() {
		this.no++;
	}

	public void incrementByInputNum(int no) {
		if(no>0) {
			this.no+=no;
		}else {
			incrementNo();
		}
	}
	
	public String name() {
		return this.name;
	}
	public int no() {
		return this.no;
	}
	
}
