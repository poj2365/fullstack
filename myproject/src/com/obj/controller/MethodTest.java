package com.obj.controller;

import java.util.Scanner;

public class MethodTest {
	private static final Scanner SC = new Scanner(System.in);

	// 1. 오늘 수업 너무 쉽다 출력하는기능
	public void msg() {
		System.out.println("오늘 수업 너무 쉽다.");
	}

	// 2. 1부터 10까지 출력하는 기능
	public void msg10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	// 3. 1부터 사용자가 원하는 수 전달받아서까지 출력하는 기능
	public int inputInt(int inputInt) {
		for (int i = 1; i <= inputInt; i++) {
			System.out.println(i);
		}
		return inputInt;
	}

	// 4. 1부터 5까지 더한수를 반환하는 기능
	public int plus() {
		return 1 + 2 + 3 + 4 + 5;
	}

	// 5. 사용자에게 5번 메세지를 입력받고 입력받은 메세지를 반환하는 기능
	public String inputMsg() {
		String result = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("메세지를 입력해주세요 : ");
			result += SC.nextLine() + " ";
		}
		return result;
	}

	// 6. 숫자두개, 연산자를 전달받아 계산한결과를 반환해주는 기능
	public int calc(int a, int b, String inputMsg) {
		int result = 0;
		if (inputMsg.equals("x")) {
			result = a * b;
		} else if (inputMsg.equals("+")) {
			result = a + b;
		} else if (inputMsg.equals("-")) {
			result = a - b;
		}
		return result;
	}

	// 7. 문자열을 전달받아 문자열에 중복값 있는지 확인 후 결과를 반환하는 기능
	public String msgChk(String msg) {
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			if (i + 1 < msg.length()) {
				if (msg.charAt(i) == msg.charAt(i + 1)) {
					result = "있음";
					System.out.println(result);
				}
			}
		}
		return result;
	}
}
