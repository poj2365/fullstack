package com.bs.practice.list.library.model.vo;


import java.util.Objects;

public class Book{
	private String title; // 도서명
	private String author; // 저자
	private String cartegory; // 카테고리
	private int price; // 가격
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, String cartegory, int price) {
		super();
		this.title = title;
		this.author = author;
		this.cartegory = cartegory;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCartegory() {
		return cartegory;
	}

	public void setCartegory(String cartegory) {
		this.cartegory = cartegory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", cartegory=" + cartegory + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, cartegory, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(cartegory, other.cartegory)
				&& price == other.price && Objects.equals(title, other.title);
	}






	
}
