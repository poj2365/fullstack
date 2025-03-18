package com.bm.book.view;

import java.util.Scanner;

import com.bm.book.controller.BookController;
import com.bm.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	public BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("----- 도서 관리 프로그램 -----");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 수정");
		System.out.println("3. 도서 삭제");
		System.out.println("4. 전체 도서 조회");
		System.out.println("5. 카테고리별 도서 조회");
		System.out.println("6. 도서명으로 도서 조회");
		System.out.println("7. 가격대별 도서 조회");
		System.out.print("메뉴 입력 : ");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			insertBook();
			break;
		case 2:
			updateBook();
			break;
		case 3:
			deleteBook();
			break;
		case 4:
			searchBook();
			break;
		case 5:
			searchCategory();
			break;
		case 6:
			searchName();
			break;
		case 7:
			searchPrice();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		}
	}
	
	private void insertBook() {
			System.out.print("도서명 : ");
			String name = sc.next();
			System.out.print("출판사 : ");
			String publisher = sc.next();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			System.out.print("할인율 : ");
			double sale = sc.nextDouble();
			System.out.print("카테고리 : ");
			String category = sc.next();
//			String b = bc.searchBook();
//			int cnt =0;
//			for(int i=0;i<b.length;i++) {
//				if(b[i]!=null) {
//					cnt++;
//				}
//			}
//			if (cnt == 3) {
//				System.out.println("책을 담을 공간이 없습니다.");
//				return;
//			} else {
				bc.insertBook(name, publisher, price, sale, category);
//			}
	}
	private void updateBook() {
//		Book[] b = bc.searchBook();
//		int cnt =0;
//		for(int i=0;i<b.length;i++) {
//			if(b[i]!=null) {
//				cnt++;
//			}
//		}
//		if (cnt == 3) {
//			System.out.println("책을 담을 공간이 없습니다.");
//			return;
//		} else {
			System.out.print("수정할 도서명 : ");
			String name = sc.next();
			System.out.print("출판사 : ");
			String publisher = sc.next();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			System.out.print("할인율 : ");
			double sale = sc.nextDouble();
			bc.updateBook(name, price, publisher, sale);
//		}
	}

	private void deleteBook() {
		System.out.print("삭제할 도서명 : ");
		String name = sc.next();
		bc.deleteBook(name);
	}
	private void searchBook() {
//		Book[] b = bc.searchBook();
//		for(int i=0;i<b.length;i++) {
//			if(b[i]!=null) {
//				b[i].infoBook();
//			}
//		}
		System.out.println(bc.searchBook());
	}
	private void searchCategory() {
		System.out.print("검색할 카테고리 : ");
		String category = sc.next();
		String search = bc.searchCategory(category);
		System.out.println(search);
	}
	private void searchName() {
		System.out.print("검색할 도서명 : ");
		String name = sc.next();
		String search =bc.searchName(name);
		System.out.println(search);
	}	
	private void searchPrice() {
		System.out.print("가격대를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("가격대를 입력해주세요 : ");
		int b = sc.nextInt();
		String searchPrice = bc.serchPrice(a,b);
		System.out.println(searchPrice);
	}
}
