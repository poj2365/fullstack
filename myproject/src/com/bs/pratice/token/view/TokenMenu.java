package com.bs.pratice.token.view;

import java.util.Scanner;

import com.bs.pratice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public TokenMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		while (true) {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		switch (sc.nextInt()) {
		case 1: 
			tokenMenu();
			break;
		case 2: 
			inputMenu();
			break;
		case 3: 
			System.out.println("프래그램을 종료합니다.");
			return;
		default:
			System.out.println("잘못입력하셨습니다 다시 입력하세요.");
		}
		}
	}
	
	private void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 갯수 : "+str.length());
		String result = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : "+result);
		System.out.println("토큰 처리 후 갯수 : "+result.length());
		System.out.println("모두 대문자로 변환 : "+result.toUpperCase());
		
	}

	public void inputMenu() {
		System.out.print("문자열을 입력하세요");
		String str = sc.next();
		tc.firstCap(str);
		System.out.print("첫 글자 대문자");
		String str1 = sc.next();
		System.out.print("찾을 문자를 하나 입력하세요");
		char search = sc.next().charAt(0);
		String result = tc.findChar(str1, search);
		System.out.println(search+" 문자가 들어간 개수 : "+result);
	}
	
}
