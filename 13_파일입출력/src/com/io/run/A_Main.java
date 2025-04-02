package com.io.run;

import java.io.IOException;
import java.util.Scanner;

import com.io.controller.A_FileController;

public class A_Main {
	public static void main(String[] args) {
//		new A_FileController().fileTest();
		Scanner sc = new Scanner(System.in);
		System.out.print("폴더명을 입력해주세요 : ");
		String path = sc.next();
		System.out.print("파일명을 입력해주세요 : ");
		String fileName = sc.next();
		boolean result = new A_FileController().createMyfile(path, fileName);
		System.out.println(result?"성공":"실패");
	}
}
