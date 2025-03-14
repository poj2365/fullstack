package com.variable.controller;

public class D_CastingTest {
	public static void main(String[] args) {
		//형변환
		//연산할때 피연산자 타입이 동일해야한다.
		//자동형 변환하여 실행함.
		int num = 10;
		double num2 = 20.5;
		double result = num+num2;
		//int result2 = num+num2;
		System.out.println(result);
		
		//작은 크기의 자료형에서 큰 크기의 자료형 변수로 저장할 때
		//byte 크기로 보면 x
		float testNum = num;
		long lnum = 100L;
		testNum = lnum;
		
		char ch = 'A';
		num=ch;
		System.out.println(num);
		
		//강제형변환
		//(자료형)값
		int num3 = (int)result;
		System.out.println(num3);
		num3 = 66;
		System.out.println((char)num3);
		
		//평균값 계산
		int kor=43,eng=51,math=90,coding=5;
		System.out.println((double)(kor+eng+math+coding)/4);
		System.out.println((kor+eng+math+coding)/4.0);
		
		Object o = new String("test");
		((String)o).length();
		
	}
}
