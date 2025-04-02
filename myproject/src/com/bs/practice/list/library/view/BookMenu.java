package com.bs.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.bs.practice.list.library.controller.BookController;
import com.bs.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	
	//사용자가 직접 메인 메뉴를 선택할 수 있음. 종료 전까지 반복실행. 각 메뉴를 누를 시 해당 메소드로 이동. 
	public void mainMenu() {
		while(true) {
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		int key = sc.nextInt();
		switch(key) {
		case 1:
			insertBook();
			break;
		case 2:
			selectList();
			break;
		case 3:
			searchBook();
			break;
		case 4:
			deleteBook();
			break;
		case 5:
			ascBook();
			break;
		case 9:
			System.out.println("프로그램 종료합니다");
			return;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		}
	}
	//도서 추가를 위해 정보를 받는메소드
	public void insertBook() {
		sc.nextLine();
		System.out.print("1. 도서명 입력 : ");
		String title = sc.nextLine();
		System.out.print("2. 저자명 입력 : ");
		String author = sc.nextLine();
		System.out.print("3. 장르 (1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
		int category = sc.nextInt();
		System.out.print("4. 가격 입력 : ");
		int price = sc.nextInt();
		String categoryStr = "";
		if(category==1) {
			categoryStr="인문";
		}else if(category==2) {
			categoryStr="자연과학";
		}else if(category==3) {
			categoryStr="의료";
		}else if(category==4) {
			categoryStr="기타";
		}
		Book book = new Book(title,author,categoryStr,price);
		bc.insertBook(book);
		
	}
	//전체 도서 목록 출력 성공을알리는 메소드
	public void selectList() {
		ArrayList<Book> bookList = new ArrayList();
		bookList = bc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i=0;i<bookList.size();i++) {
				System.out.println("------------------------------------------");
				System.out.println(bookList.get(i).getTitle());
				System.out.println(bookList.get(i).getAuthor());
				System.out.println(bookList.get(i).getCartegory());
				System.out.println(bookList.get(i).getPrice());
			}
		}
	}
	
	//특정 도서 검색 결과를 보여주는메소드
	public void searchBook() {
		sc.nextLine();
		System.out.print("검색할 도서명 입력 : ");
		String title = sc.nextLine();
		ArrayList searchList = new ArrayList();
		searchList = bc.searchBook(title);
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i=0;i<searchList.size();i++) {
				System.out.println("------------------------------------------");
				System.out.println(((Book)(searchList.get(i))).getTitle());
				System.out.println(((Book)(searchList.get(i))).getAuthor());
				System.out.println(((Book)(searchList.get(i))).getCartegory());
				System.out.println(((Book)(searchList.get(i))).getPrice());
			}
		}
		
	}
	
	//특정 도서 삭제 성공을 알리는메소드
	public void deleteBook() {
		sc.nextLine();
		System.out.print("삭제할 도서명 입력 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 입력 : ");
		String author = sc.nextLine();
		Book remove = new Book();
		remove = bc.deleteBook(title, author);
		if(remove==null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
	}
	
	//책 명 오름차순 정렬 성공을알리는 메소드
	public void ascBook() {
		int result = bc.ascBook();
	}

}
