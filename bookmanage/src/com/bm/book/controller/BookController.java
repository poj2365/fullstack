package com.bm.book.controller;

import com.bm.book.model.vo.Book;

public class BookController {
	
	private Book[] b = new Book[3];

	public void insertBook(String bookName, String publisher, int price, double sale, String category) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				b[i] = new Book();
				b[i].setBookName(bookName);
				b[i].setPublisher(publisher);
				b[i].setPrice(price);
				b[i].setSale(sale);
				b[i].setCategory(category);
				return;
			}
		}
	}

	public Book[] searchBook() {
//		int count = 0;
//		for (int i = 0; i < b.length; i++) {
//			if(b[i]!=null) {
//				count++;
//			}
//		}
		return b;
	}

	public void updateBook(String name ,int price, String publisher, double sale) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null) {
				if(b[i].getBookName().equals(name)) {
					b[i].setPublisher(publisher);
					b[i].setPrice(price);
					b[i].setSale(sale);
					return;
				}
			}
		}
	}

	public void deleteBook(String name) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null) {
				if(b[i].getBookName().equals(name)) {
					b[i] = null;
					return;
				}
			}
		}
	}

	public String searchCategory(String category) {
		String result = "";
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null) {
				if(b[i].getCategory().equals(category)) {
					result += b[i].infoBook();
				}
			}
		}
		return result;
	}

	public String searchName(String name) {
		String result = "";
		for (int i = 0; i < b.length; i++) {
			if (b[i] != null) {
				if(b[i].getBookName().equals(name)) {
					result += b[i].infoBook();
				}
			}
		}		
		return result;
	}

	public String serchPrice(int a, int b2) {
		String result = "";
		for (int i = 0; i < b.length; i++) {
			if(a<b[i].getPrice() || b[i].getPrice()<b2) {
				result += b[i].infoBook();
			}
		}
		return result;
	}
	
}
