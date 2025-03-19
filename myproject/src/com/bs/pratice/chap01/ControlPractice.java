package com.bs.pratice.chap01;

import java.util.Scanner;

public class ControlPractice {

	private static final Scanner sc = new Scanner(System.in);

	// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를 종료번호를 누르면“ 프로그램이종료됩니다.”를 출력하세요.
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("입력 메뉴입니다.");
		case 2:
			System.out.println("수정 메뉴입니다.");

		case 3:
			System.out.println("조회 메뉴입니다.");

		case 4:
			System.out.println("삭제 메뉴입니다.");

		case 5:
			System.out.println("프로그램이 종료됩니다.");

		default:
			System.out.println("잘못입력");
		}
	}

	// 키보드로 정수를 입력받은 정수가 양수이면서 짝수일때만 “짝수다”를 출력하고 짝수가아니면“홀수다“를 출력하세요.
	// 양수가아니면 “양수만입력해주세요.”를 출력하세요
	public void practice2() {
		System.out.println("입력 : ");
		int a = sc.nextInt();
		if(a < 0) {
			System.out.println("양수만입력해주세요.");
		}
		if(a%2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
	}
	
	public void practice11() {
		System.out.println("입력 : ");
		int a = sc.nextInt();
		if(a<1000 || 9999<a) {
			System.out.println("자릿수 안맞음");
			return;
		}
		int[] test = new int[4];
		test[0]= a/1000;
		test[1] = (a / 100) % 10;
		test[2] = (a / 10) % 10;
		test[3] = a % 10;
		int cnt =0;
		for(int i=0;i<test.length;i++) {
			for(int j=i+1;j<test.length+1;j++) {
				if(j<5) {
					if(test[i]==test[j]) {
						cnt++;
					}
				}
			}
		}
		
		if(cnt==0) {
			System.out.println("중복값 없음");
		}else {
			System.out.println("중복값 없음");
		}
	}
}
