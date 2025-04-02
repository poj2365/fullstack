package com.extra.common;

import com.extra.model.vo.Student;

public enum StudentController {
	controller;
	
	private MainView view = MainView.view;
	
	public void mainMenu() {
//		System.out.println("메인 메뉴 실행");
	view.mainMenu();
	}
	
	public void insertStudent() {
//		System.out.println("학생등록 개발중...");
	Student s= view.insertStudent();
	}
	
}
