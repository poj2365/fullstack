package com.obj.model.vo;

public class D_ConstructorTest {// 3/12
	
	public String data="test";
	
	// 생성자 선언하기
	// 접근제한자 클래스명() {} -> 기본 생성자
	// 접근제한자 클래스명(매개변수) {로직} - > 매개변수 생성자
	
	// 생성자는 여러개 선언할 수 있다.
	
	public D_ConstructorTest() {
//		System.out.println("기본생성자 호출");
		// 필드에 로직에 의한 기본 값을 설정할 수 있음
		if(C_InitialBlockTest.objCount==0) {
			data = "생성된 객체 없네";
		}else {
			data = "생성된 객체 있네";			
		}
	}
	
	// 매개변수 생성자
	public D_ConstructorTest(String inputData) {
		// 매개변수에 전달된 값을 필드에 저장
		this.data = inputData;
	}
	public int num;
	// 매개변수의 타입을 보고 판단 오버로딩
	public D_ConstructorTest(String data, int num) {
//		System.out.println(data);
//		System.out.println(num);
		// this 생성된 객체 주소를 저장하는 변수 -> 나 자기자신
		this.data=data;
		this.num=num;
	}
	
	public char gender;
	// 선언된 생성자 재사용하기
	// this() 생성자 이용
	// this() 반드시 생성자 코드 맨 위에 작성해야함.
	public D_ConstructorTest(String data, int num, char gender) {
		this(num); // 이미 선언된 생성자를 재사용
		this.gender = gender; // 선언되지 않았기 때문에 이렇게 사용
	}
	
	public D_ConstructorTest(int num) {

	}
	
}
