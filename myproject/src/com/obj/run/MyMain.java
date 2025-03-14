package com.obj.run;

import java.util.Scanner;

import com.obj.controller.MethodTest;

public class MyMain {
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		// 1. 오늘 수업 너무 쉽다 출력하는기능
		mt.msg();
		
		/// 2. 1부터 10까지 출력하는 기능
		mt.msg10();
		
		// 3. 1부터 사용자가 원하는 수 전달받아서까지 출력하는 기능
		System.out.print("원하는 수 입력해주세요 : ");
		mt.inputInt(SC.nextInt());
		
		// 4. 1부터 5까지 더한수를 반환하는 기능
		int plus = mt.plus();
		System.out.println(plus);
		
		// 5. 사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능
		String msg = mt.inputMsg();
		System.out.println(msg);
		
		// 6. 숫자두개, 연산자를 전달받아 계산한결과를 반환해주는 기능
		System.out.print("원하는 수 입력해주세요 : ");
		int a = SC.nextInt();
		System.out.print("원하는 수 입력해주세요 : ");
		int b = SC.nextInt();
		System.out.print("연산자 입력해주세요 : ");
		String operator = SC.next();
		int result1 = mt.calc(a, b, operator);
		System.out.println(result1);
		
		SC.nextLine();
		// 7. 문자열을 전달받아 문자열에 중복값 있는지 확인 후 결과를 반환하는 기능
		System.out.print("문자열 입력해주세요 : ");
		String resultMsg = mt.msgChk(SC.nextLine());
		System.out.println(resultMsg);
		
	}
}
