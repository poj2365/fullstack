package com.bs.pratice.chap01;

import java.util.Calendar;
import java.util.Scanner;

public class ControlPractice {

	private static final Scanner sc = new Scanner(System.in);

	// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를 종료번호를 누르면“ 프로그램이종료됩니다.”를 출력하세요.
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("입력 메뉴입니다.");
		case 2:
			System.out.println("수정 메뉴입니다.");

		case 3:
			System.out.println("조회 메뉴입니다.");

		case 4:
			System.out.println("삭제 메뉴입니다.");

		case 5:
			System.out.println("프로그램이 종료됩니다.");

		default:
			System.out.println("잘못입력");
		}
	}

	// 키보드로 정수를 입력받은 정수가 양수이면서 짝수일때만 “짝수다”를 출력하고 짝수가아니면“홀수다“를 출력하세요.
	// 양수가아니면 “양수만입력해주세요.”를 출력하세요
	public void practice2() {
		System.out.println("입력 : ");
		int a = sc.nextInt();
		if(a < 0) {
			System.out.println("양수만입력해주세요.");
		}
		if(a%2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
	}
	
//	국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//	합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요. 
//	(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//	합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//	불합격인 경우에는 “불합격입니다.”를 출력하세요.
	 public void practice3(){
		 System.out.println("국어 입력 : ");
		 int korean = sc.nextInt();
		 System.out.println("영어 입력 : ");
		 int eng = sc.nextInt();
		 System.out.println("수학 입력 : ");
		 int math = sc.nextInt();
		 
		 int sum = korean+eng+math;
		 double avg = (double)sum/3.0;
		 
		 if((korean >= 40 ||eng >= 40 ||math >= 40 ) && avg >= 60) {
			 System.out.println("축하합니다. 합격입니다.");
		 }else {
			 System.out.println("불합격입니다.");
		 }
	 }
	//수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
	 public void practice4(){
			Calendar c =Calendar.getInstance();
			int month=c.get((Calendar.MONTH))+1;
			System.out.println(month+"월");
			switch(month) {
			case 3, 4, 5:
				System.out.println("Spring 배우자..");
			break;
			case 6, 7, 8:
				System.out.println("여름 바다 여행 -> Spring 배우자..");
			break;
			case 9, 10, 11:
				System.out.println("가을 동화");
			break;
			case 12, 1, 2:
				System.out.println("겨울연가");
			break;
			}
			
	 }
	 
//	 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”,
//	 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
//	 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
	 public void practice5(){
		 String id = "myId";
		 String pw = "myPassword12";
		System.out.println("입력 : ");
		String s = sc.next();
		if(s.equals(id) && s.equals(pw)) {
			System.out.println("로그인 성공");
		}else if(!s.equals(id)){
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	 }
	 
//	 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요. 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//	 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
//	 비회원은 게시글 조회만 가능합니다.
	 public void practice6(){
			System.out.println("입력 : ");
			String s = sc.next();
			if(s.equals("관리자")) {
				System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			}else if(s.equals("회원")) {
				System.out.println("게시글 작성, 댓글 작성 ,게시글 조회");
			}else if (s.equals("비회원")) {
				System.out.println("게시글 조회");
			}
	 }

	 
//	 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//	 저체중/정상체중/과체중/비만을 출력하세요. BMI = 몸무게 / (키(m) * 키(m))
//	 BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//	 BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//	 BMI가 30이상일 경우 고도 비만
	 public void practice7(){
	 System.out.println("키 입력 : ");
	 double height = sc.nextDouble();
	 System.out.println("몸무게 입력 : ");
	 double weight = sc.nextDouble();
	 double bmi = ((height/100) * (height/100)) /weight;
	 System.out.println(height/100);
	 System.out.println(bmi);
	 if(bmi <18.5) {
		 System.out.println("저체중");
	 }else if (18.5<bmi || bmi<23 ) {
		 System.out.println("정상체충");
	 }else if (23<bmi || bmi<25 ) {
		 System.out.println("과체충");
	 }else if (25<bmi || bmi<30) {
		 System.out.println("비만");
	 }else if (bmi>30) {
		 System.out.println("고도비만");
	 }
	 }
	 
	public void practice11() {
		System.out.println("입력 : ");
		int a = sc.nextInt();
		if(a<1000 || 9999<a) {
			System.out.println("자릿수 안맞음");
			return;
		}
		int[] test = new int[4];
		test[0]= a/1000;
		test[1] = (a / 100) % 10;
		test[2] = (a / 10) % 10;
		test[3] = a % 10;
		int cnt =0;
		for(int i=0;i<test.length;i++) {
			for(int j=i+1;j<test.length;j++) {
				if(i+1<test.length) {
					if(test[i]==test[j]) {
						cnt++;
					}
				}
			}
		}
		
		if(cnt==0) {
			System.out.println("중복값 없음");
		}else {
			System.out.println("중복값 있음");
		}
	}
}
