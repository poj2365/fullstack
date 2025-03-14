package com.obj.model.vo;

public class A_SubMain {
	public static void main(String[] args) {

		A_DefaultTest dt = new A_DefaultTest();

		B_FieldTest ft = new B_FieldTest();
		ft.num = 200;
		ft.name = "한창규";
//		ft.weight = 65.5
		System.out.println(B_FieldTest.ERROR_404);
	
	}
}
