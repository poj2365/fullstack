package com.repeat.controller;

import java.nio.file.spi.FileSystemProvider;
import java.util.Random;
import java.util.Scanner;

public class RepeatController {

	private static final Scanner sc = new Scanner(System.in);

	public void basicFor() {
		// 기본 for문 활용하기
		// 지정된 코드(명령어)를 원하는 만큼 반복실행하는 명령어
		// for(초기식; 조건식; 증강식){ 반복할 명령어(로직)}
		// 초기식 : 변수 선언 -> 반복하는 횟수를 저장하는 변수
		// 조건식 : 반복할지를 결정하는 조건 -> true일 경우 반복 / false일 경우 중단
		// 일반적으로 초기식에 선언된 변수를 가지고 조건문을 선언함
		// 증강식 : 초기식에 선언된 변수를 변경하는 연산을 설정
		// 일반적으로는 ++, -- 연산을 이용
		// 100번 출력
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
		for (int i = 1; i <= 100; i++) {
			System.out.println("hello");
		}
		// 본인 이름 5번 출력하기
		// 반복문 이용해서 처리
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " 박서준");
		}

		// 1~10까지 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 100부터 1까지 출력하기
		for (int i = 100; 1 <= i; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 규칙적으로 증가하는 숫자에 대한 로직을 작성할때 사용
		String alpha = "abcdefghijk";
		for (int i = 0; i < alpha.length(); i++) {
			System.out.print(alpha.charAt(i) + " ");
		}

		// 반복문의 {} 내부에 연산자, 조건문, 변수선언 모두 가능
		int su2 = 100;
		String temp = "안녕";
		for (int i = 1; i <= 4; i++) {
//			String temp = "안녕";
			System.out.println(temp);
			if (su2 > 10) {
				temp += "호";
			}
			System.out.println(temp);
		}

		// 1부터 100까지의 수 중에 짝수만 출력하기
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.println("짝수 : "+i);
//			}
//		}
//		for(int i=2;i <= 100; i+=2) {
//			System.out.println(i+" ");
//		}
		for (int i = 1; i <= 50; i++) {
			System.out.println(i * 2);
		}

	}

	// 반 친구들의 이름을 5명 입력받고 출력하는 기능 구현
	// 입력받자마자 출력, 입력 받은 학생 한번에 출력
	public void inputStudent() {
		String totalName = "";
		for (int i = 1; i <= 5; i++) {
			System.out.print("반 친구들의 이름을 입력해주세요 : ");
			String name = sc.nextLine();
			System.out.println(name);
			if (i != 1) {
				totalName += ", ";
			}
			totalName += name;

		}
		System.out.println(totalName);
	}

	public void for2() {
		// for문 응용하기

		// 1. for문의 초기식, 조건식, 증감식을 반드시 작성해야 하나?
		// for(초기식;조건식;증감식)
		int i = 1;
		for (; i < 5; i++) {
			System.out.println(i);
		}
		// 증감식을 생략하기 -> 무한루프
//		for(;i<10;) {
//			System.out.println(i);
//		}
		System.out.println("test");
		for (;;) {
			System.out.println("무한루프 " + i);
			if (i++ > 10) {
				break;
			}
		}

		for (int j = 0, su = 10; j < 10; j++, su += 10) {
			System.out.println(j + " " + su);
		}

		// 동적으로 반복횟수를 설정하기
		// 10 -> for (int i=1;i<=10;i++)
		// 20 -> for (int i=1;i<=20;i++)
		// 5 -> for (int i=1;i<=5;i++)
		System.out.print("몇번 : ");
		int inputSu = sc.nextInt();
		for (int j = 1; j < inputSu; j++) {
			System.out.println(j);
		}
	}

	// 사용자에게 숫자 5개를 입력받고 숫자의 총합을 출력하는 기능
	// 버전 업 원하는 만큼 입력받고 합계출력
	// public void sumNumber()
	public void sumNumber() {
		System.out.print("숫자 1 : ");
		int a = sc.nextInt();
		System.out.print("숫자 2 : ");
		int b = sc.nextInt();
		System.out.print("숫자 3 : ");
		int c = sc.nextInt();
		System.out.print("숫자 4 : ");
		int d = sc.nextInt();
		System.out.print("숫자 5 : ");
		int e = sc.nextInt();

		int sum = a + b + c + d + e;
		System.out.println("숫자의 총합 : " + sum);

		System.out.println("숫자 입력 : ");
		int j = sc.nextInt();
		sum = 0;
		for (int i = 1; i <= j; i++) {
			System.out.print("숫자 " + i + " : ");
			int k = sc.nextInt();
			sum += k;
		}
		System.out.println("숫자의 총합 : " + sum);
	}

	// 사용자에게 메세지를 입력받고 출력하는 기능
	// 1. 메세지를 5개 입력받고 출력하는 기능
	// 2. 사용자가 exit입력할때까지 입력받고 출력 기능

	// 입력받은 문자열에 공백이 있는지 확인하는 기능
	// 입력받은 문자열에 대문자가 있는지
	public void msg() {
		String total = "";
		for (int i = 1; i <= 5; i++) {// 1. 메세지를 5개 입력받고 출력하는 기능
			System.out.print(i + " 메세지를 입력해주세요 : ");
			String msg = sc.nextLine();
			if (i == 1) {
				total += msg;
			} else {
				total += "," + msg;
			}
		}
		System.out.println("메세지 출력 : " + total);

		// 2. 사용자가 exit입력할때까지 입력받고 출력 기능
		for (;;) { // 내 풀이
			System.out.print("메세지를 입력해주세요 : ");
			String msg = sc.nextLine();
			total += msg;
			if (msg.equals("exit")) {
				System.out.println("반복 종료");
				System.out.println(total);
				break;
			}
		}

		String messge = "";
		for (String temp = ""; !temp.equals("exit");) {
			System.out.print("메세지 : ");
			temp = sc.nextLine();
			if (!temp.equals("exit"))
				messge += temp + "\n";
		}
		System.out.println(messge);
	}

	// 입력받은 문자열에 공백이 있는지 확인하는 기능
	public void checkBlank() {
		// 내 풀이
		System.out.print("메세지를 입력해주세요 : ");
		String msg = sc.nextLine();
		for (int i = 0; i < msg.length(); i++) {
			System.out.println(msg.charAt(i));
			if (msg.charAt(i) == ' ') {
				System.out.println(msg + " 메세지에 공백 발견 : ");
				break;
			}
		}
		// 강사님 풀이
		System.out.print("메세지를 입력해주세요 : ");
		String inputData = sc.nextLine();
		String result = "없다";
		for (int i = 0; i < inputData.length(); i++) {
			System.out.println(inputData.charAt(i));
			char checkCh = inputData.charAt(i);
			if (checkCh == ' ') {
				result = "있다";
			}
		}
		System.out.println(result);

		System.out.print("메세지를 입력해주세요 : ");
		String msg2 = sc.nextLine();
		for (int i = 0; i < msg2.length(); i++) { // 입력받은 문자열에 대문자가 있는지 확인하는 기능
			System.out.println(msg.charAt(i));
			if ('A' < msg.charAt(i) && msg.charAt(i) < 'Z') {
				System.out.println("메세지에 대문자 발견");
				break;
			}
		}
	}

	// 중첩 반복문
	// for문 안에 for문이 있는 구문
	public void forInFor() {
		// 중첩 반복문 이용하기
		for (int i = 2; i < 10; i++) {
			System.out.println(i);
			for (int j = 1; j < 10; j++) {
//				System.out.print(j+" ");
				System.out.print(i + "x" + j + "=" + i * j + " ");
			}
			System.out.println();
		}

		// 문자열의 중복값을 확인하는 기능 만들기
		System.out.print("문자 : ");
		String inputCheck = sc.nextLine();
		for (int i = 0; i < inputCheck.length(); i++) {
			if (i + 1 < inputCheck.length()) {
				if (inputCheck.charAt(i) == inputCheck.charAt(i + 1)) {
					System.out.println("중복 값 발견 : " + inputCheck.charAt(i) + " - " + inputCheck.charAt(i + 1));
				}
			}
		}

		System.out.print("문자 : ");
		String inputChk = sc.nextLine();
		String result = "중복값 없음";
		for (int i = 0; i < inputChk.length(); i++) {
			int cnt = 0;
			char target = inputChk.charAt(i);
			for (int j = 0; j < inputChk.length(); j++) {
				if (i != j && inputChk.charAt(i) == inputChk.charAt(j)) {
//					System.out.println("중복 값 발견 : " + inputChk.charAt(i) + " - " + inputChk.charAt(j));
					result = "중복값 있음";
					cnt++;
				}
			}
			if (cnt > 0) {
				System.out.println("중복되는 문자열 : " + target + " 중복된 횟수 : " + cnt);
			}
		}
		System.out.println(result);

	}

	public void whileTest() {
		// while문 활용하기
		// 반복문을 구현하는 방법 중 하나
		// while(조건식) { 로직 [증감식 / 분기문 ]}
		// 의도적인 무한루프를 실행할 때
		int n = 1;
		while (n <= 10) {
			System.err.println(n);
			n++;
		}

		// 사용자가 끝이라고 입력할 때까지 반복하기
		String msg = "", totalMsg = "";
		while (!msg.equals("끝")) {
			System.out.print("메세지 : ");
			msg = sc.nextLine();
			totalMsg += msg.equals("끝") ? "" : msg;
		}
		System.out.println(totalMsg);

		// 3의 배수의 숫자만 입력받기
		int su = 1;
		while (su % 3 != 0) {
			System.out.println("수 입력 :");
			su = sc.nextInt();
			if (su % 3 != 0) {
				System.out.println("3의 배수를 입력하세요!");
			}
		}

		// 무한루프
		while (true) {
			System.out.println("무한");
			if (su++ > 100) {
				break;
			}
		}

		// 메뉴 프로그램 작동시키기
		int choice = 0;
		while (choice != 9) {
			System.out.println("==== 점심 메뉴 ====");
			System.out.println("1. 마라샹궈");
			System.out.println("2. 돈까스");
			System.out.println("3. 구내식당");
			System.out.println("4. 일본식라멘");
			System.out.println("5. 마제소바");
			System.out.println("9. 종료");
			choice = sc.nextInt();
		}

		// do~while 구문 이용하기
		int num = 10;
		do {
			System.out.println("실행되니?");
			num++;
		} while (num > 10);
	}

	// 주문받는 프로그램 만들기
	// 1. 아메리카노 3000
	// 2. 카페라떼 4500
	// 3. 자바칩프라프치노 6000
	// 4. 자몽허니블랙티 6000
	// 5. 아이스티 5000
	// 0. 주문종료
	// 원하는 메뉴를 모두 주문받고(음료갯수포함) 주문받은
	// 결과(메뉴, 갯수)와 총 금액을 출력해주는 기능을 구현
	public void myMenu() {
		int totalPrice = 0;
		int menu = 0;
		int cnt = 0;
		String totalMenu = "";
		do {
			System.out.println("=== BS 카페 ===");
			System.out.println("1. 아메리카노 3000");
			System.out.println("2. 카페라떼 4500");
			System.out.println("3. 자바칩프라프치노 6000");
			System.out.println("4. 자몽허니블랙티 6000");
			System.out.println("5. 아이스티 5000");
			System.out.println("0. 주문종료");
			System.out.print("메뉴 선택: ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.print("아메리카노의 갯수를 입력해주세요 : ");
				cnt = sc.nextInt();
				totalMenu += "아메리카노 " + cnt + "개\n";
				totalPrice += 3000 * cnt;
				break;
			case 2:
				System.out.print("카페라떼의 갯수를 입력해주세요 : ");
				cnt = sc.nextInt();
				totalMenu += "카페라떼 " + cnt + "개\n";
				totalPrice += 4500 * cnt;
				break;
			case 3:
				System.out.print("자바칩프라프치노의 갯수를 입력해주세요 : ");
				cnt = sc.nextInt();
				totalMenu += "자바칩프라프치노 " + cnt + "개\n";
				totalPrice += 6000 * cnt;
				break;
			case 4:
				System.out.print("자몽허니블랙티의 갯수를 입력해주세요 : ");
				cnt = sc.nextInt();
				totalMenu += "자몽허니블랙티 " + cnt + "개\n";
				totalPrice += 6000 * cnt;
				break;
			case 5:
				System.out.print("아이스티의 갯수를 입력해주세요 : ");
				cnt = sc.nextInt();
				totalMenu += "아이스티 " + cnt + "개\n";
				totalPrice += 5000 * cnt;
				break;
			case 0:
				break;
			default:
				System.out.println("없는 메뉴입니다.");
			}
		} while (menu != 0);
		System.out.println("=== 주문 내역 ===");
		System.out.println("주문한 메뉴\n" + totalMenu + "총 금액 : " + totalPrice);

	}

	public void breakCountinueTest() {
		// 분기문 활용하기
		// 실행되는 로직을 중단하거나 특정코드를 생략하고 진행하는 로직을 구성할 때 사용
		// 중단 : break;
		// 생략 : continue;
		// 조건문과 같이 사용
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i > 5) {
				break;
			}
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		// 중첩반복문에서 break문 활용
		t: // 여기서부터
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j == 5)
					break t;// 여기까지 전체 종료
				System.out.println(i + "X" + j + " " + i * j);
			}
		}
	}

	// 자바에서 랜덤값 가져오기
	// 1. Math.random() 메소드 이용하기
	// 2. Random 클래스에서 제공하는 기능을 이용하기
	// 0 ~ 1 사이의 임의의 수를 출력
	public void randomTest() {
		System.out.println(Math.random());
		// 정수형으로 출력하려면
		System.out.println((int) (Math.random() * 10));
		// 0~4까지 랜덤
		System.out.println((int) (Math.random() * 5));
		// 1~5까지 랜덤
		System.out.println((int) (Math.random() * 5) + 1);

		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			System.out.print(random + " ");
		}

		// Random 클래스 이용
		Random rnd = new Random();
		// nextInt(), nextDouble()
		for (int i = 0; i < 5; i++) {
//			System.out.println(rnd.nextInt());
			System.out.println(rnd.nextInt(45)+1);
		}

	}
	
//	1. 가위바위보게임
//	 설명
//	 - 사용자에게 가위, 바위, 보 중 한개를 입력하도록하고(입력방식은 숫자)
//	 - 컴퓨터가 랜덤값으로 세개중 하나의 데이터를 대입
//	 - 컴퓨터의 값과 사용자의 값을 비교하여 다음의 결과출력
//	   같으면 비겼습니다. 출력 후 다시 사용자와 컴퓨터가 선택할 수 있도록 로직구성
//	   컴퓨터가 사용자에게 이기면 컴퓨터가 이겼습니다. 출력
//	   사용자가 컴퓨터에게 이기면 사용자가 있겼습니다. 출력

//
//	-  승자가 나왔으면 다시 하겠습니다 출력
//	    다시하면 위에 로직 다시 실행
//	    종료하면 프로그램 종료
//	- 추가 : 만일 위 내용을 쉽게 처리 했으면 프로그램 종료시 지금까지 전적을 출력
//	       컴퓨터 승 00번, 사용자 승 00번
	
	public void rps() {
		for (;;) {
			String inputText= "";
			int cnt = 0;
			String chk = "";
			System.out.println("----- 가위바위보 게임 -----");
			System.out.println("가위, 바위, 보 중에 한개를 입력해주세요");
			System.out.println("1. 가위\n2. 바위\n3. 보");
			System.out.print("입력 : ");
			int inputInt = sc.nextInt();
			if (inputInt!= 1 && inputInt!= 2 && inputInt!=3) {
				System.out.println("잘못된 입력입니다.");
			}
			int randomValue = (int) (Math.random() * 2)+1;
			if(randomValue==1) {
				System.out.println("가위");
			}else if(randomValue==2) {
				System.out.println("바위");
			}else if(randomValue==3) {
				System.out.println("보");
			}
			
			if(inputInt == randomValue) {
				System.out.println("비겼습니다.");

				continue;
			}else if(inputInt==1 && randomValue==3) {
				System.out.println("사용자가 이겼습니다.");
				System.out.println("다시 하시겠습니까?");
				System.out.print("입력(네/아니오) : ");
				inputText = sc.next();
				if(inputText.equals("네")) {
					continue;
				}else if(inputText.equals("아니오")) {
					break;
				}else {
					System.out.println("잘못입력하셧습니다.");
				}
			}else if (inputInt==1 && randomValue==2) {
				System.out.println("컴퓨터가 이겼습니다.");
				System.out.println("다시 하시겠습니까?");
				System.out.print("입력(네/아니오) : ");
				inputText = sc.next();
				if(inputText.equals("네")) {
					continue;
				}else if(inputText.equals("아니오")) {
					break;
				}else {
					System.out.println("잘못입력하셧습니다.");
				}
			}else if(inputInt==2 && randomValue==1) {
				System.out.println("사용자가 이겼습니다.");
				System.out.println("다시 하시겠습니까?");
				System.out.print("입력(네/아니오) : ");
				inputText = sc.next();
				if(inputText.equals("네")) {
					continue;
				}else if(inputText.equals("아니오")) {
					break;
				}else {
					System.out.println("잘못입력하셧습니다.");
				}
			}else if (inputInt==2 && randomValue==3) {
				System.out.println("컴퓨터가 이겼습니다.");
				System.out.println("다시 하시겠습니까?");
				System.out.print("입력(네/아니오) : ");
				inputText = sc.next();
				if(inputText.equals("네")) {
					continue;
				}else if(inputText.equals("아니오")) {
					break;
				}else {
					System.out.println("잘못입력하셧습니다.");
				}
			}else if(inputInt==3 && randomValue==2) {
				System.out.println("사용자가 이겼습니다.");
				System.out.println("다시 하시겠습니까?");
				System.out.print("입력(네/아니오) : ");
				inputText = sc.next();
				if(inputText.equals("네")) {
					continue;
				}else if(inputText.equals("아니오")) {
					break;
				}else {
					System.out.println("잘못입력하셧습니다.");
				}
			}else if (inputInt==3 && randomValue==1) {
				System.out.println("컴퓨터가 이겼습니다.");
				System.out.println("다시 하시겠습니까?");
				System.out.print("입력(네/아니오) : ");
				inputText = sc.next();
				if(inputText.equals("네")) {
					continue;
				}else if(inputText.equals("아니오")) {
					break;
				}else {
					System.out.println("잘못입력하셧습니다.");
				}
			}
		}

	}

}
