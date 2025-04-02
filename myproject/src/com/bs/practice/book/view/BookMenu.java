package com.bs.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.bs.practice.book.controller.BookController;
import com.bs.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public BookMenu() {
		bc.makeFile();
		Book[] bArr = bc.fileRead();
	}

	public void mainMenu() {
		while (true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void fileSave() {
		sc.nextLine();
		System.out.print("도서명 : ");
		String name = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		Calendar c;
		c = Calendar.getInstance();
		StringTokenizer st = new StringTokenizer(date,"-");
		while(st.hasMoreTokens()) {
			c.set(Calendar.YEAR,Integer.parseInt(st.nextToken()));
			c.set(Calendar.MONTH,Integer.parseInt(st.nextToken()));
			c.set(Calendar.DAY_OF_MONTH,Integer.parseInt(st.nextToken()));
		}
		Book[] bArr = new Book[10];
		for(int i=0;i<bArr.length;i++) {
		bArr[i] = new Book();
		bArr[i].setTitle(name);
		bArr[i].setAuthor(author);
		bArr[i].setPrice(price);
		bArr[i].setDate(c);
		bArr[i].setDiscount(discount);
		}
		bc.fileSave(bArr);
		
	}

	public void fileRead() {
		bc.fileRead();	
	}
}
