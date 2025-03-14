package com.obj.model.vo;

public class B_FieldTest {
	// 필드선언
	// 접근제한자 [예약어] 자료형 변수명
	// 필드는 클래스를 생성(객체화)했을때 사용할 수 있는 저장공간

	// 접근제한자 -> 생성된 객체에서 직접 접근 허용여부를 설정
	// public : 프로젝트 내 어디서나 가능
	// default : 같은 패키지 내, 클래스 내에서 가능
	// private : 클래스 내에서 가능
	public int num;
	String name;
	private double weight;

	public void test() {
		this.num = 200;
		this.name = "장명수";
		this.weight = 65.5;
	}

	// 필드에 기본값 설정하기
	public double height = 180.5;
	public String nickName = "bs";
	public int age = 19;
	public char gender;

	// 필드 final 예약어 이용하기
	// 상수처리, 변경되지 않는 변수
	public final int AGE = 20;
//	{
//		AGE=19;
//	}
//	public B_FieldTest() {
//		AGE=20;
//	}

	// static 예약어 사용하기
	// 프로그램 시작과 동시에 영역을 생성
	// 클래스의 인스턴스와 상관없이 사용할 수 있는 영역
	public static String message;

	public static final String ERROR_404 = "페이지를 찾을 수 없습니다";
	public static final String ERROR_505 = "서버 내부 오류입니다. 관리자에게 문의하세요.";

	// 참조형 자료형 선언하기 -> 주소값 -> 생성해서 사용
	// 배열, 객체
	public int[] numbers = new int[5];
	public Product product = new Product();

}
