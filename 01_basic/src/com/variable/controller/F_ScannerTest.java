package com.variable.controller;

import java.util.Scanner;

public class F_ScannerTest {
	public static void main(String[] args) {
		// 사용자가 키보드로 입력한 데이터 가져오기
		// Scanner 클래스를 이용해서 입력받기
		// 1. Scanner 클래스 import 하기
		// import java.util.Scanner;
		// 2. Scanner 클래스 생성하기
		// Scanner sc = new Scanner(System.in)
		Scanner sc = new Scanner(System.in);
		// 3. 생성된 Scanner가 제공하는 기능(메소드)을 이용해서 사용자가 입력한 데이터를 가져옴
		// nextInt() : 사용자가 입력한 값을 int 형으로 가져오는 기능
		// nextDouble() : 사용자가 입력한 값을 double 형으로 가져오는 기능
		// next() : 사용자가 입력한 값을 String 형으로 가져오는 기능
		// 띄어쓰기를 기준으로 앞에 값을 가져옴
		// ex) 경기도 시흥시 -> 경기도
		// nextLine() : 사용자가 입력한 값을 String 형으로 가져오는 기능
		// 개행을 기준으로 전체 값을 다 가져옴
		// ex) 경기도 시흥시 -> 경기도 시흥시
		// 단일 문자 가져오기 -> char 형으로 데이터 가져오기
		// next()/nextLine() .charAt(0); -> 이런식으로 한글자 가져오면 됨		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		System.out.println("입력한 키 : "+height);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("입력한 이름 : "+name);
		
		sc.nextLine();// 버퍼 비워주기
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.println("입력한 주소 : "+address);
		
		System.out.print("등급 : ");
		char grade = sc.next().charAt(0);
		System.out.println(grade);
	}
}
