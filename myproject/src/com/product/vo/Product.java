package com.product.vo;

public class Product {
	public int productNo;
	public String productType;
	public String productName;
	public int productPrice;
	public double productDiscount;
	public int productStock;
	
	public Product() {// 기본생성자
		
	}

	public Product(String productType,String productName,int productPrice) {//매개변수 생성자
		this.productNo++;
		this.productType = productType;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public Product(String productType,String productName,int productPrice,double productDiscount) {//매개변수 생성자
		this(productType,productName,productPrice);
		this.productNo++;
		this.productDiscount = productDiscount;
		
	}
	
	public Product(String productName,int productPrice,double productDiscount,int productStock) {//매개변수 생성자
		this.productNo++;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productStock = productStock;
	}
	
}
