package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요. 이 때 총점과 평균은 정수형으로 처리하세요.
	public void score() {
		System.out.print("국어 : ");
		double korean = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		System.out.println("총점 : "+(int)(korean+eng+math)+"\n평균 : "+(int)(korean+eng+math)/3);
	}
}
