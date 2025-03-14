package com.product.controller;

import java.util.Arrays;

import com.product.vo.Product;

public class ProductController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(); // 기본생성자
		// 매개변수 생성자
		Product p1 = new Product("컴퓨터", "maxbook", 200);
		Product p2 = new Product("핸드폰", "갤럭시노트", 120, 0.2);
		Product p3 = new Product("마스크", 10, 0.5, 100);

		System.out.println("\n productNo : " + p3.productNo + 
				"\n productType : " + p3.productType + 
				"\n productName : "	+ p3.productName + 
				"\n productPrice : " + p3.productPrice + 
				"\n productDiscount : " + p3.productDiscount
				+ "\n productStock : " + p3.productStock);

	}

}
