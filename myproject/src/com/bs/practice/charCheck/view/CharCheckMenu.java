package com.bs.practice.charCheck.view;

import java.util.Scanner;

import com.bs.practice.charCheck.cotroller.CharCheckController;
import com.bs.practice.charCheck.exception.CharCheckException;

public class CharCheckMenu{
	public void menu() {
		CharCheckController ccc = new CharCheckController();
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.nextLine();
		try {
			int count = ccc.countAlpha(input);
			System.out.println(input+"에 포함된 영문자 개수 : " + count);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
	}
}
