package com.obj.run;

import com.obj.model.vo.D_ConstructorTest;

public class D_ConstructorMain {// 3/12
	public static void main(String[] args) {
		D_ConstructorTest ct = new D_ConstructorTest();
		D_ConstructorTest ct2;
		ct2 = new D_ConstructorTest("매개변수값");
		System.out.println(ct.data);
		System.out.println(ct2.data);
		D_ConstructorTest ct3 
		= new D_ConstructorTest("새로운 값");
		System.out.println(ct3.data);
		D_ConstructorTest ct4
		= new D_ConstructorTest("12",10);
		
		D_ConstructorTest ct5 = new D_ConstructorTest("점심",6500,'여');
		System.out.println(ct5.data+" "+ct5.num+" "+ct5.gender);
	}
}
