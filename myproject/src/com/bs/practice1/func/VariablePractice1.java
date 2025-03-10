package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	// 1.이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
	// 키 180.5cm인 20살 남자 아무개님 반갑습니다^^
	public void register() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.println("키 "+height+"cm인 "+age+"살 "+gender+" "+name+"님 반갑습니다.^^");
	}

}
