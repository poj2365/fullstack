package com.extra.common;

import java.util.Scanner;

import com.extra.model.vo.Student;

public enum MainView {
	view;
	
	private Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		System.out.println("메인메뉴");
	}
	
	public Student insertStudent() {
		System.out.println("학생 등록");
		System.out.println("이름 : ");
		String name = sc.nextLine();
		return Student.builder().name(name).build();
	}
}
