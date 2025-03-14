package com.obj.run;

import java.util.Scanner;

import com.obj.model.vo.B_FieldTest;

public class B_FieldMain {
	public static void main(String[] args) {
		// ctrl+shift+o
		B_FieldTest ft;
		ft = new B_FieldTest();
		// 객체 필드 이용하기
		ft.num = 200;
//		ft.name="김경주";
//		ft.weight=-65.5
		System.out.println(ft.num);

		// new 연산자를 사용해서 클래스를 인스턴스로 생성하면
		// 생성된 인스턴스(객체)는 새로만들어짐
		new B_FieldTest().num = 200;
		System.out.println(new B_FieldTest().num);

		// heap 영역에 생성되는 필드는 기본 값을 가짐
		// int,byte,short,long = 0
		// float,double = 0.0
		// char ' ' String null
		// boolean false
		ft.height = 195.3;
		System.out.println(ft.height);
		System.out.println(ft.nickName);
		System.out.println(ft.age);
		System.out.println(ft.gender);

//		ft.AGE = 20;

		// static 필드 이용하기
		B_FieldTest.message = "우와 static 신기하다";
		System.out.println(B_FieldTest.message);

		System.out.println(B_FieldTest.ERROR_404);

//		System.out.println(B_FieldTest.numbers);
		System.out.println(ft.numbers);
		System.out.println(ft.product);
//		ft.numbers = new int[1];
		ft.numbers[0] = 100;

		System.out.println(ft.numbers[0]);

		ft.product.productName = "아파트";
		System.out.println(ft.product.productName);
		
		B_FieldTest ft2 = new B_FieldTest();
		System.out.println(ft2.product.productName);
		
	}

}
