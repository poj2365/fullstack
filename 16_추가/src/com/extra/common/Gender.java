package com.extra.common;

public enum Gender {
	A("중성"),M("남자"),F("여자");
	
	private String value;
	
	private Gender(String value) {
		this.value = value;
	}
	
	public String getGender() {
		return this.value;
	}
}
