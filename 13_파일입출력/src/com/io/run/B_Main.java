package com.io.run;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.io.controller.B_IOStreamController;
import com.io.model.vo.Snack;

public class B_Main {
	public static void main(String[] args) {
//		new B_IOStreamController().fileSave();
//		new B_IOStreamController().fileLoad();
//		new B_IOStreamController().stringSaveFile();
//		new B_IOStreamController().stringFileLoad();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("파일명을 입력해주세요 : ");
//		String name = sc.next();
//		System.out.print("파일에 저장할 데이터를 입력해주세요 : ");
//		String content = sc.next();
////		new B_IOStreamController().saveFile(name, content);
//		new B_IOStreamController().fileSaveStr(name, content);
//		
//		System.out.print("파일명을 입력해주세요 : ");
//		String fileName = sc.next();
////		new B_IOStreamController().loadFile(fileName);
//		new B_IOStreamController().fileLoadStr(fileName);
		
		Snack[] snacks = new Snack[] {
				new Snack("바나나킥",1700,"오리온"),
				new Snack("레이칩",4980,"외국꺼"),
				new Snack("짱구",1300,"삼양"),
				new Snack("맛동산",2300,"해태"),
				new Snack("초코파이",3000,"오리온")
		};
		
//		new B_IOStreamController().saveSnack("snack.bs", snacks);
		Snack[] result = new B_IOStreamController().loadSnack1("snack.bs");
//		System.out.println(Arrays.toString(result));
		for(Snack s : result) {
			System.out.println(s.toString().replace("\n", ""));
		}
		
		
	}
}
