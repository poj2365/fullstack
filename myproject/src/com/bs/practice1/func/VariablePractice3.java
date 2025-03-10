package com.bs.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요. 계산 공식 ) 면적 : 가로 * 세로
	//둘레 : (가로 + 세로) * 2
	public void calc() {
		System.out.print("가로 값을 입력해주세요 : ");
		double a = sc.nextDouble();
		System.out.print("세로 값 입력해주세요 : ");
		double b = sc.nextDouble();
		System.out.println("면적(가로 * 세로) : "+a*b+"\n둘레((가로 + 세로) * 2) : "+(a*b)*2);
	}

}
