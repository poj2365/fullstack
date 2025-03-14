package com.obj.model.vo;

public class Product {
	
	private String productName;
	private int productPrice;	
	private String productCategory;
	
	// getter 메소드 선언
	public String getProductName() {
		return productName;
	}
	// setter 매소드 선언
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


}
