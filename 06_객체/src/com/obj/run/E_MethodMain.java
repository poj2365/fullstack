package com.obj.run;

import com.obj.controller.FieldUseMethod;
import com.obj.controller.MyMethod;
import com.obj.model.vo.Product;

public class E_MethodMain {

	public static void main(String[] args) {
		// 메소드 이용하기
		MyMethod mymethod = new MyMethod();
		mymethod.test1();// 메소드 이용 -> 메소드 호출
		mymethod.test2("여러분 졸지말고 힘내세요!");
		mymethod.test2("우린 할수있다.!");
		int result = mymethod.test3();
		System.out.println(result);
		long result2= mymethod.test4(10, 10);
		System.out.println(result2);
		int num = 10;
		int [] number = {10,0,0};
		num = mymethod.test5(num);
		mymethod.test6(number);
		System.out.println("num : "+num);
		System.out.println("number[0] : "+number[0]);
		
//		Product p = new Product();
//		p.productName="맥북";
//		p.productPrice=300000;
//		p.productCategory="컴퓨터";
//		System.out.println(p.productName+" "+p.productPrice+" "+p.productCategory);
//		mymethod.test7(p);
//		System.out.println(p.productName+" "+p.productPrice+" "+p.productCategory);
//		mymethod.test8();
		
		// 필드를 이용하는 메소드
		FieldUseMethod fum = new FieldUseMethod(1, "유병승");
		String data = fum.infoObject();
		System.out.println(data);
//		fum.incrementNo();
		System.out.println(fum.infoObject());
		FieldUseMethod fum1 = new FieldUseMethod(2, "양지혁");
		System.out.println(fum1.infoObject());
		fum1.incrementByInputNum(10);
		System.out.println(fum1.infoObject());
//		fum1.name="test";
		System.out.println("이름 : "+fum1.name());
		System.out.println("번호 : "+fum1.no());

		
		// setter / getter 이용하기
		Product p = new Product();
		// 상품명 저장하기
		p.setProductName("핸드폰");
		System.out.println(p.getProductName());
	}

}
