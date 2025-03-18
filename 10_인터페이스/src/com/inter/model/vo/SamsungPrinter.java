package com.inter.model.vo;

import com.inter.common.B_Printable;

public class SamsungPrinter implements B_Printable{
	
	public void samPrint() {
		System.out.println("삼성프린트 인쇄중...");
	}
	
	@Override
	public void print() {
		samPrint();
	}
}
