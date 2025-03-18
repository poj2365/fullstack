package com.inter.common;

public interface A_BasicInter {
	// 상수, 추상 메소드를 선언
	public abstract void test();
//	public void test2() {
//		System.out.println("test2 실행");
//	} -> 불가능
	// 인터페이스내 선언된 메소드는 모두 추상 메소드로 처리함
	// 메소드 선언시 public absrerct 예약어는 생략이 가능
	double calc(int su, int su2);
	
	//static final
	int AGE = 19; // public static final
	
	default String printMsg(String msg) {
		return "나의 default 메소드 "+msg;
	}
	// 인터페이스에서도 default 를 통해서 구현부를 추가할 수 있다.
	
	static void staticTest() {
		System.out.println("난 static 메소드");
	}
	
}
