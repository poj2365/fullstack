package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	//키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요
	public void uniCode() {
		System.out.print("문자 : ");
		char uniCode = sc.next().charAt(0);
		System.out.println(uniCode+" unicode : "+(int)uniCode);
		
	}
	
}
