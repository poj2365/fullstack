package com.info.model.vo;

public class Teacher extends People{
	private String majorSubject;
	private String chargeSubject;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String majorSubject, String chargeSubject) {
		super();
		this.majorSubject = majorSubject;
		this.chargeSubject = chargeSubject;
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public String getChargeSubject() {
		return chargeSubject;
	}

	public void setChargeSubject(String chargeSubject) {
		this.chargeSubject = chargeSubject;
	}
	
	@Override
	public String toString() {
		return chargeSubject+" "+majorSubject;
	}
	
	
}
