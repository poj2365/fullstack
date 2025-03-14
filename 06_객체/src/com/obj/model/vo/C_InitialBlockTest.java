package com.obj.model.vo;

public class C_InitialBlockTest {// 3/11
	// 초기화 블록 이용하기
	// 클래스를 객체로 만들때 실행할 로직이
	// 필요할때 사용하는 구문
	public static int objCount=0;
	public String data;
	{//인스턴스 초기화 블록
		System.out.println("초기화 블록 실행");
		// 연산자, 조건문, 반복문, 변수선언
		String name ="test";
		if(name.equals("test")) {
			System.out.println("우와 초기화 블록");
		}
		// 객체 생성 수를 파악하기
		C_InitialBlockTest.objCount++;
		if(C_InitialBlockTest.objCount%2==0) {
			data="mydata";
		}else {
			data="쉬시";			
		}
	}
	
	// static 초기화 블록
	static {
		System.out.println("static 초기화 블록 실행");
//		data="staticdata"; 필드 사용 불가능 생성 순서가 느림
	// 클래스가 생성될 때 한번 생성됨
	}
	
}
