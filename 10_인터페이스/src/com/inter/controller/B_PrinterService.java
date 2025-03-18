package com.inter.controller;

import com.inter.common.B_Printable;
import com.inter.model.vo.LGPrinter;
import com.inter.model.vo.SamsungPrinter;

public class B_PrinterService {

//	private SamsungPrinter printer = new SamsungPrinter();
//	private LGPrinter printer = new LGPrinter();
	private B_Printable printer;
	
	public B_PrinterService(B_Printable printer) {
		this.printer = printer;
	}
	
	public void execPrint() {
//		printer.samPrint();
//		printer.lgPrint();
		printer.print();
		
	}
	
}
