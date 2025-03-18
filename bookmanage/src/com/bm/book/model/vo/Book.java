package com.bm.book.model.vo;

public class Book {
	private static int bookIndex = 0;
	private String book_no;
	private String bookName;
	private String publisher;
	private int price;
	private double sale;
	private String category;
	
	{
		book_no = "BOOK_"+bookIndex;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String book_no, String bookName, String publisher, int price, double sale, String category) {
		this.book_no = book_no;
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
		this.sale = sale;
		this.category = category;
	}

	public String getBook_no() {
		return book_no;
	}

	public void setBook_no(String book_no) {
		this.book_no = book_no;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String infoBook() {
		return book_no + " " + bookName+ " " + publisher+ " " + price+ " " + sale+ " " + category;
	}
}
