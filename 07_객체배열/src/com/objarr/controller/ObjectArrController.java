package com.objarr.controller;

import java.util.Scanner;

import com.objarr.model.vo.Car;
import com.objarr.model.vo.Food;

public class ObjectArrController { // 3/14 객체 배열

	private static final Scanner SC = new Scanner(System.in);

	public void basicObjectArray() {
		// 객체배열 선언하기
		Food[] foods;
		foods = new Food[3]; // Food f1,f2,f3 Food 객체를 생성한게 아니라 Food를 저장할 저장소 3개를 생성

//		foods[0].setName("구내식당"); nullpointer 에러 발생
		// 객체 배열의 각 저장소에 객체를 생성 후 활용해야함.
		foods[0] = new Food();
		foods[0] = new Food("쌀국수", 11000, "아시아");
		System.out.println(foods[0]);
		System.out.println(foods[1]);

		// 객체 배열에 저장된 객체 활용하기
		foods[0].setName("짜장면");
//		foods[0].name="짜장면"; 직접 접근 불가능
		System.out.println(foods[0].getName());
//		System.out.println(foods[1].getName());

		// 반복문을 이용해서 데이터 조회하기
		for (int i = 0; i < foods.length; i++) {
			if (foods[i] != null) {
				System.out.println(foods[i].getName());
			}
		}

		// 반복문을 이용해서 foods에
		// 초밥, 15000, 일식
		// 김치찌개, 9000, 한식
		// 구내식당, 6500, 한식
		// 저장하고 출력해보기
//		foods[0] = new Food("초밥", 15000, "일식");
//		foods[1] = new Food("김치찌개", 9000, "한식");
//		foods[2] = new Food("구내식당", 6500, "한식");
//		for(int i=0;i<foods.length;i++) {
//			System.out.println(foods[i].getName()+" "+foods[i].getPrice()+" "+foods[i].getType());
//		}
		// 입력 받아서 출력하기
		String result = "";
		for (int i = 0; i < foods.length; i++) {
			foods[i] = new Food(); // 객체 생성해줘야 에러 안남
			System.out.print("음식 입력 : ");
			foods[i].setName(SC.next());
			System.out.print("가격 입력 : ");
			foods[i].setPrice(SC.nextInt());
			System.out.print("타입 입력 : ");
			foods[i].setType(SC.next());
			result += foods[i].getName() + " " + foods[i].getPrice() + " " + foods[i].getType() + " ";
		}
		System.out.println(result);
	}
	
	public void carObjectArr() {
		String result = "";
		Car[] car;
		car = new Car[5];
		for (int i = 0; i < car.length; i++) {
			car[i] = new Car(); // 객체 생성해줘야 에러 안남
			System.out.print("차종 입력 : ");
			car[i].setCarType(SC.next());
			System.out.print("색상 입력 : ");
			car[i].setCarColor(SC.next());
			System.out.print("km 입력 : ");
			car[i].setKm(SC.nextInt());
			System.out.print("이름 입력 : ");
			car[i].setCarName(SC.next());
			result += car[i].getCarType() + " " + car[i].getCarColor() +" "+ car[i].getKm()+" " + car[i].getCarName() + " ";
		}
		System.out.println(result);
	}
}
