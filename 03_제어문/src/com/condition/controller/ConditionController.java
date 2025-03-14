package com.condition.controller;

import java.util.Calendar;
import java.util.Scanner;

public class ConditionController {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public void ifTest() {
		// 기본 if 활용하기
		// if(조건식 true/false){ 조건식이 true일 경우 실행할 로직}
		// {} 내부에는 변수 선언, 기능 호출(메소드 호출), 연산자, 조건문, 반복문 모두 사용 가능
		if(100>10) {
			System.out.println("100은 10보다 크다.");
		}
		System.out.println("if문 밖에 출력문");
		
		// 입력 받은 수가 200이면 우와 목요일이다. 출력하기
		System.out.print("입력 : ");
		int su = sc.nextInt();
		if(su == 200) {
			System.out.println("우와 목요일이다.");
		}
		
		// 입력 받은 수가 100~200 사이면 정상데이터를 출력하고 입력값에 100을 더하기(누적)
		if(100 <= su && su <= 200) {
			System.out.println("정상 데이터");
			// if문 외부에 선언된 변수를 if{} 내부에서 사용 가능
			su += 100;
			// if문 내부에서 변수를 선언할 수 있음
			// if문 내부에서 선언한 변수는 if문의 {} 안에서만 사용 가능
			String name = "유병승";
			System.out.println(name);
		}
		System.out.println("입력 값 : "+su);
		
	}
	
	public void checkNumber() {
		System.out.print("수를 입력해주세요 : ");
		int su = sc.nextInt();
		if(su % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}
	}
	
	public void testName() {
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		if(name.equals("이예찬")) {
			System.out.println("코딩천재");
		}
	}
	
	public void ifElseTest() {
		// if~else문 활용하기
		// if(조건문){ true일 경우 실행할 로직}
		// else { false일 경우 실행할 로직}
		// 어떤 수가 음수인지 양수인지 판단하는 기능
		System.out.print("수 : ");
		int su = sc.nextInt();
		if(su>0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		// else 문만 사용하기 -> 불가능
//		else {
//		}
		
		// 사용자가 입력한 값이 짝수면 입력 값에 100을 더하고 홀수면 100을 빼는 기능
		System.out.print("수를 입력해주세요 : ");
		su = sc.nextInt();
		if(su % 2 == 0) {
			System.out.println("짝수");
			su += 100;
		}else {
			System.out.println("홀수");
			su -= 100;
		}
		System.out.println("입력 값 : "+su);
	}
	
	// 사용자가 성년이면 회원정보를 입력받고 출력
	// 이름, 나이, 성별, 키 -> 입력한 회원정보 : 000님 00살 0 000.00cm
	// 미성년이면 회원가입이 불가능합니다.
	public void enrollMember() {
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		if (age < 20) {
			System.out.println("미성년일 경우 회원가입이 불가능합니다.");
		}else {
			System.out.println("-------------회원가입---------------");
			System.out.print("이름 : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			if(gender != '남' && gender != '여') {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.println("---------------------------------");
			System.out.print("입력한 회원 정보 : "+name+"님 "+age+"살 "+gender+" "+height+"cm");
		}
	}
	
	public void ifelseifelseTest() {
		// if~ else if ~ else 구문 활용하기
		// 계절별 메세지를 출력하는 구문
		Calendar c =Calendar.getInstance();
		int month=c.get((Calendar.MONTH))+1;
		System.out.println(month+"월");
		if(3 <= month && month <= 5) {
			System.out.println("Spring 배우자..");
		}else if (6 <= month && month <= 8) {
			System.out.println("여름 바다 여행 -> Spring 배우자..");
		}else if (9 <= month && month <= 11) {
			System.out.println("가을 동화");
		}else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울연가");
		}
	
		// 초중고를 구별하는 기능
		// 나이를 입력받아 초등학생, 중학생, 고등학생 나누기
		// 어디에 속하는 학생인지 출력하는 기능
	
		// 메뉴 기능을 구현하기
		// 메뉴를 출력하고 선택된 메뉴의 금액을 출력해주는 기능
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("술추천");
			System.out.println("1. 소주");
			System.out.println("2. 맥주");
			System.out.println("3. 위스키");
			System.out.println("4. 막걸리");
			System.out.println("5. 와인");
			System.out.print("입력 : ");
			int menu = sc.nextInt();
			String name="";
			if(menu == 1) {
				name = "참이슬 후레시";
			}else if (menu == 2) {
				name = "블랑";
			}else if (menu == 3) {
				name = "발렌타인 21년산";
			}else if(menu == 4) {
				name = "밤먹걸리";
			}else if (menu == 5) {
				name = "와인";
			}else {
				System.out.println("잘못입력함");
			}
			System.out.println(name);
		}else {
			System.out.println("미성년입니다.");
		}
	}
	
	public void switchTest() {
		// switch문 활용하기
		// 정해진 값에 대해 분기처리할 경우 사용하는 조건문
		// 동등 비교해서 조건문을 사용할 경우 편리함
		//switch(대상값 (int, char, String)) { case 값 : break;}
		System.out.println("=== 점심 메뉴 추천 ===");
		System.out.println("1. 구내식당");
		System.out.println("2. 돈까스");
		System.out.println("3. 마라탕");
		System.out.print("입력 : ");
		int choice = sc.nextInt();
		switch (choice) {
			case 1 : 
				System.out.println("길건너 갑을 구매식당"); 
				break;
			case 2 :
				System.out.println("마리오 3관 12층, 13층 돈까스집");
				break;
			case 3 : 
				System.out.println("왼쪽으로 쭉~~ 롯데리아 옆 마라탕집");
				break;
			default:
				System.out.println("잘못된 선택입니다.");

		}
		System.out.print("원하는 메뉴 입력 : ");
		String menu = sc.next();
		switch(menu) {
			case "구내식당":
				System.out.println("길건너 갑을 구매식당"); 
				break;
			case "돈까스" : 	
				System.out.println("마리오 3관 12층, 13층 돈까스집");
				break;
			case "마라탕" : 
				System.out.println("왼쪽으로 쭉~~ 롯데리아 옆 마라탕집");
				break;
			default:
				System.out.println("잘못된 선택입니다.");
		}
		char ch = 'a';
		switch(ch) {
			case 'a' : break;
			case 'b' : break;
			case 'c' : break;
		}
		//double은 불가능
//		double height = 180.5;
//		switch (height) {
//		}
//		switch (a<10) { <- Java 에선 불가능 자바스크립트에선 가능
//		}
		
		//switch문 ()안에 다른 연산이나 기능 호출하기
		//switch(menu.length()) {
		switch(menu.charAt(0)) {
			case '구': break;
			case '돈': break;
		}
		
		switch(choice%3) {
		case 0: break;
		case 1: break;
		case 2: break;
		}
		
		//break문 생략하기
		switch(menu) {
			case "구내식당" : 
				System.out.println("구내");
			case "돈까스" : 
				System.out.println("돈");
			case "마라탕" : 
				System.out.println("마라");
		}
		
		int month=3;
		switch(month) {
			case 1: case 2: case 12: 
				System.out.println("겨울");
				break;
			case 3, 4, 5:
				System.out.println("봄");
				break;
		}
		
		//프로그램의 메뉴를 구성 실제로 사용할 땐
		System.out.println("=== 식당 주문 프로그램 ===");
		System.out.println("1. 주문조회");
		System.out.println("2. 주문등록");
		System.out.println("3. 주문수정");
		System.out.println("입력 : ");
//		int orderNum = sc.nextInt();
//		switch(orderNum) {
//			case 1 :
//				new OrderController().orderSearch();
//				break;
//			case 2 :
//				new OrderController().insertOrder();
//				break;
//			case 3 :
//				new OrderController().updateOrder();
//				break;
//			default : 
//				System.out.println("선택한 메뉴는 없습니다!");
//		}
//		
	}
	
	public void menu() {
		System.out.println("=== 실습내용 보기 ===");
		System.out.println("1. if문 예제");
		System.out.println("2. ifelse문 예제");
		System.out.println("3. ifelseif문 예제");
		System.out.println("4. switch문 예제");
		System.out.print("입력 : ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1 :
				ifTest();
				break;
			case 2 :
				ifElseTest();
				break;				
			case 3 :
				ifelseifelseTest();
				break;
			case 4 :
				switchTest();
				break;
		}
	}
	
	// 간단한 주문프로그램
	// 분식집 주문 프로그램 
	//1. 떡볶이(5000), 2. 순대(4000), 3. 튀김(3000)
	//4. 김밥(4500) 5. 라면(4000)
	//  갯수를 입력받기
	// 선택한 메뉴와 결제 금액을 출력해주는 주문프로그램
	// 주문하신 메뉴는 000이고, 결제 금액은 0000원 입니다.
	// 1 ~ 5가 아닌 번호를 입력하면 잘못선택하셨습니다. 다시 선택하세요
	public void myMenu2(){
		System.out.println("=== BS 분식 ===");
		System.out.println("1. 떡볶이(5000)");
		System.out.println("2. 순대(4000)");
		System.out.println("3. 튀김(3000)");
		System.out.println("4. 김밥(4500)");
		System.out.println("5. 라면(4000)");
		System.out.print("입력 : ");
		int menu = sc.nextInt();
		String menuName = null;
		int price = 0;
		if(1<=menu && menu <=5) {
			// 정상적인 메뉴 선택
			System.out.print("갯수 : ");
			int count = sc.nextInt();
			switch(menu) {
				case 1 :
					menuName = "떡볶이";
					price = 5000*count;
					break;
				case 2 :
					menuName = "순대";
					price = 4000*count;
					break;
				case 3 :
					menuName = "튀김";
					price = 3000*count;
					break;
				case 4 :
					menuName = "김밥";
					price = 4500*count;
					break;
				case 5 :
					menuName = "라면";
					price = 4000*count;
					break;
			}
			System.out.printf("주문하신 메뉴는 %s이고, 결제 금액은 %d원 입니다."
					,menuName,price);
		}else {
			// 비정상적인 메뉴 선택
			System.out.println("잘못선택하셨습니다. 다시 선택하세요!");
		}
	
	}
	
	public void myMenu() {// 내 풀이
		int su;
		System.out.println("-- 분식집 주문 프로그램 ---");
		System.out.println("1. 떡볶이(5000)");
		System.out.println("2. 순대(4000)");
		System.out.println("3. 튀김(3000)");
		System.out.println("4. 김밥(4500)");
		System.out.println("5. 라면(4000)");
		System.out.print("입력 : ");
		String choice = sc.nextLine();
		switch(choice) {
			case "1", "떡볶이":
				System.out.print("구매하실 수량을 입력해주세요 : ");
				int choice2 = sc.nextInt();
				su = 5000;
				if(choice.equals("1")) {
					choice = "떡볶이";
				}
				System.out.println("주문하신 메뉴는 "+choice+"이고, 결제 금액은 "+su*choice2+"원 입니다.");
				break;
			case "2", "순대":
				System.out.print("구매하실 수량을 입력해주세요 : ");
				int choice3 = sc.nextInt();
				su = 4000;
				if(choice.equals("2")) {
					choice = "순대";
				}
				System.out.println("주문하신 메뉴는 "+choice+"이고, 결제 금액은 "+su*choice3+"원 입니다.");
				break;
			case "3", "튀김":
				System.out.print("구매하실 수량을 입력해주세요 : ");
				int choice4 = sc.nextInt();
				su = 3000;
				if(choice.equals("3")) {
					choice = "튀김";
				}
				System.out.println("주문하신 메뉴는 "+choice+"이고, 결제 금액은 "+su*choice4+"원 입니다.");
				break;
			case "4", "김밥":
				System.out.print("구매하실 수량을 입력해주세요 : ");
				int choice5 = sc.nextInt();
				su = 4500;
				if(choice.equals("4")) {
					choice = "김밥";
				}
				System.out.println("주문하신 메뉴는 "+choice+"이고, 결제 금액은 "+su*choice5+"원 입니다.");
				break;
			case "5", "라면":
				System.out.print("구매하실 수량을 입력해주세요 : ");
				int choice6 = sc.nextInt();
				su = 4000;
				if(choice.equals("5")) {
					choice = "라면";
				}
				System.out.println("주문하신 메뉴는 "+choice+"이고, 결제 금액은 "+su*choice6+"원 입니다.");
				break;
			default : 
				System.out.println("잘못된 선택입니다.");
		}
	}
}
