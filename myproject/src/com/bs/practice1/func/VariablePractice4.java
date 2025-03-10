package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	//영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	public void eng() {
		System.out.print("문자열을 입력해주세요 : ");
		String a = sc.next();
		System.out.println("첫번째 문자 : "+a.charAt(0)+"\n두번째 문자 : "+a.charAt(1)+"\n세번째 문자 : "+a.charAt(2));
	}
}
