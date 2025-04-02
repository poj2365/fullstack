package com.bs.practice.list.library.controller;

import java.util.ArrayList;
import com.bs.practice.list.library.model.vo.Book;


public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	//초기 값을 넣어줄 기본 생성자
	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	//리스트에 값 저장 메소드
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	//모든 리스트를 출력하는 메소드
	public ArrayList selectList() {
		return bookList;
	}
	//키워드로 책을 검색하는 메소드
	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(new Book(
						bookList.get(i).getTitle(),bookList.get(i).getAuthor(),
						bookList.get(i).getCartegory(),bookList.get(i).getPrice()
						));
				return searchList;
			}
		}
		return searchList;
	}
	//책 제목과 저자 명으로 책을삭제하는 메소드
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) {
				removeBook = new Book(bookList.get(i).getTitle(), bookList.get(i).getAuthor(),
						bookList.get(i).getCartegory(),bookList.get(i).getPrice());
				bookList.remove(i);
				return removeBook;
			}
		}
		return removeBook;
	}
	//책 명 오름차순 정렬하는 메소드
	public int ascBook() {
		bookList.sort((o1,o2)->{
			Book prev = (Book) o1;
			Book next = (Book) o2;
			return prev.getTitle().compareTo(next.getTitle());		
		});
		return 1;
	}
}
