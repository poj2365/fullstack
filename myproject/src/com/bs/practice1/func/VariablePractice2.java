package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	private static final Scanner sc = new Scanner(System.in);
	
	//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	public void calc() {
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int b = sc.nextInt();
		System.out.println("더하기 결과 : "+(a+b));
		System.out.println("빼기 결과 : "+(a-b));
		System.out.println("곱하기 결과 : "+a*b);
		System.out.println("나누기 결과 : "+a/b);
	}
}
