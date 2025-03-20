package com.bs.practice.chap02_abstractNInterface.model.vo;

public interface Phone extends CellPhone {
	public static final char[] NUMBERPAD = {'1', '2','3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	public String makeCall(); // 전화 걸기
	public String takeCall(); // 전화 받기
	
}
