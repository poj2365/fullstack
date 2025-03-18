package com.inter.run;

import com.inter.controller.A_InterfaceController;
import com.inter.controller.B_PrinterService;
import com.inter.controller.C_InterController;
import com.inter.model.vo.CannonPrinter;
import com.inter.model.vo.LGPrinter;
import com.inter.model.vo.SamsungPrinter;

public class Main {
	public static void main(String[] args) {
//		new A_InterfaceController().basicInterface();
//		new B_PrinterService().execPrint();
//		new B_PrinterService(new LGPrinter()).execPrint();
//		new B_PrinterService(new SamsungPrinter()).execPrint();
//		new B_PrinterService(new CannonPrinter()).execPrint();
		new C_InterController().extraInterTest();
	}
}
