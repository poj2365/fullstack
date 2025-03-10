package com.my.controller;

import java.util.Scanner;

public class MyScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, address, email;
		int age, grade, scClass, classNum;
		double height;
		char gender;

		// 1. 입력한 값을 입력 받고 바로 출력
		
		  System.out.print("이름을 입력해 주세요 : "); 
		  name = sc.next();
		  System.out.println("입력한 이름 : "+name);
		  
		  System.out.print("나이를 입력해 주세요 : "); 
		  age = sc.nextInt();
		  System.out.println("입력한 나이 : " + age + "살");
		  
		  System.out.print("성별을 입력해 주세요 : "); 
		  gender = sc.next().charAt(0);
		  System.out.println("입력한 성별 : "+gender);
		  
		  System.out.print("학년을 입력해 주세요 : ");
		  grade = sc.nextInt();
		  System.out.println("입력한 학년 : " + grade + "학년");
			
		  System.out.print("반을 입력해 주세요 : "); 
		  scClass = sc.nextInt();
		  System.out.println("입력한 반 : " + scClass + "반");
		  
		  System.out.print("번호을 입력해 주세요 : "); 
		  classNum = sc.nextInt();
		  System.out.println("입력한 번호 : "+classNum);
		  
		  System.out.print("키를 입력해 주세요 : "); 
		  height = sc.nextDouble();
		  System.out.println("입력한 키 : " + height + "cm");
		  
		  sc.nextLine(); 
		  System.out.print("주소을 입력해 주세요 : "); 
		  address = sc.nextLine();
		  System.out.println("입력한 주소 : "+address);
		  
		  System.out.print("이메일을 입력해 주세요 : "); 
		  email = sc.nextLine();
		  System.out.println("입력한 이메일 : "+email);
		 
		  String format="%3s\t%2d\t%1c\t%d\t%d\t%.1f\t%20s\t%s";
		  System.out.printf(format, name, age, gender, grade, scClass, classNum, height, address, email);

		// 2. 입력한 값을 다 입력받은 후 한번에 모두 출력하기

//		System.out.print("이름을 입력해 주세요 : ");
//		name = sc.next();
//
//		System.out.print("나이를 입력해 주세요 : ");
//		age = sc.nextInt();
//
//		System.out.print("학년을 입력해 주세요 : ");
//		grade = sc.nextInt();
//
//		System.out.print("성별을 입력해 주세요 : ");
//		gender = sc.next().charAt(0);
//
//		System.out.print("반을 입력해 주세요 : ");
//		scClass = sc.nextInt();
//
//		System.out.print("번호을 입력해 주세요 : ");
//		classNum = sc.nextInt();
//
//		System.out.print("키를 입력해 주세요 : ");
//		height = sc.nextDouble();
//
//		sc.nextLine();
//		System.out.print("주소을 입력해 주세요 : ");
//		address = sc.nextLine();
//
//		System.out.print("이메일을 입력해 주세요 : ");
//		email = sc.nextLine();

		System.out.println("\n----------------------------------------------------");
		System.out.println("입력한 이름 : " + name + "\n입력한 나이 : " + age + "살\n입력한 학년 : " + grade + "학년\n입력한 성별 : " + gender+"입력한 반 : " 
							+ scClass + "반\n입력한 번호 : " + classNum + "\n입력한 키 : " + height + "cm\n입력한 주소 : " + address+"\n입력한 이메일 : " + email);

	}
}
