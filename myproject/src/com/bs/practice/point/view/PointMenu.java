package com.bs.practice.point.view;

import java.util.Scanner;

import com.bs.practice.point.controller.CircleController;
import com.bs.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
		
	public void mainMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			switch(sc.nextInt()) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default :
				System.out.println("잘못입력하셧습니다.");
			}
		}
	}
	
	public void circleMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			switch(sc.nextInt()) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
				break;
			case 9:
				return;
			default :
				System.out.println("잘못입력하셧습니다.");
			}
		}
	}
	public void rectangleMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사격형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			switch(sc.nextInt()) {
			case 1:
				calcPerimeter();
				break;
			case 2:
				calcRectArea();
				break;
			case 9:
				return;
			default :
				System.out.println("잘못입력하셧습니다.");
			}
		}
	}
	public void calcCircum() {// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int raduis = sc.nextInt();
		String result = cc.calcCircum(x, y, raduis);
		System.out.println(result);
	}
	public void calcCircleArea() {// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		String result = cc.calcArea(x, y, radius);
		System.out.println(result);
	}
	public void calcPerimeter() {// 데이터를 RectangleController(rc) calcPerimeter()의 매개변수로 보내 반환값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		String result = rc.calcPerimeter(x, y, height, width);
		System.out.println(result);
	}
	public void calcRectArea() {// 데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		String result = rc.calcArea(x, y, height, width);
		System.out.println(result);
	}

}
