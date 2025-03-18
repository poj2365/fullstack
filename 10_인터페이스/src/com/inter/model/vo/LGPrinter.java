package com.inter.model.vo;

import com.inter.common.B_Printable;

public class LGPrinter implements B_Printable{
	
	public void lgPrint() {
		System.out.println("엘지 프린터 인쇄중...");
	}

	@Override
	public void print() {
		lgPrint();		
	}
}
