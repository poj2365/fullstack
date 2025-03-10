package com.bs.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	private static final Scanner sc = new Scanner(System.in);
	
	 //키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
	 public void practice1(){
		 System.out.print("숫자를 입력하세요 : ");
		 int inputInt = sc.nextInt();
		 if(inputInt < 0) {
			 System.out.println("양수가 아니다");	 
		 }else if(inputInt > 0) {
			 System.out.println("양수다");
		 }
	 }
	 
	 // 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
	 // 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
	 public void practice2(){
		 System.out.print("숫자를 입력하세요 : ");
		 int inputInt = sc.nextInt();
		 if(inputInt <= 0) {
			 if(inputInt == 0) {				 
				 System.out.println("0이다");	 				 
			 }else {
				 System.out.println("음수다");	 				 
			 }
		 }else if(inputInt > 0) {
			 System.out.println("양수다");
		 }
	 }
	 
	 // 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
	 public void practice3(){
		 System.out.print("숫자를 입력하세요 : ");
		 int inputInt = sc.nextInt();
		 if(inputInt % 2 == 0) {
			 System.out.println("짝수다");
		 }else {
			 System.out.println("홀수다");
		 }
	 }
	 
	 // 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
	 // 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	 public void practice4(){
		 System.out.print("인원수를 입력하세요 : ");
		 int inputInt = sc.nextInt();
		 System.out.print("사탕 개수를 입력하세요 : ");
		 int candy = sc.nextInt();
		 System.out.println("인원 수 : "+inputInt);
		 System.out.println("사탕 개수 : "+candy);
		 System.out.println("1인당 사탕 개수 : "+(candy/inputInt));
		 System.out.println("남는 사탕 개수 : "+(candy%inputInt));
	 }
	 
	 //키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
	 public void practice5(){
		 System.out.print("이름을 입력하세요 : ");
		 String inputText = sc.next();
		 System.out.print("학년 입력하세요 : ");
		 int grade = sc.nextInt();
		 System.out.print("반 입력하세요 : ");
		 int classroom = sc.nextInt();
		 System.out.print("반 번호 입력하세요 : ");
		 int classroomNum = sc.nextInt();
		 System.out.print("성별 입력하세요 : ");
		 char gender = sc.next().charAt(0);
		 String gender1 = "";
		 if(gender == 'M') {
			 gender1 = "남학생";
		 }else {
			 gender1 = "여학생";
		 }
		 System.out.print("성적 입력하세요 : ");
		 double score = sc.nextDouble();
		 System.out.println("이름 : "+inputText);
		 System.out.println("학년 : "+grade);
		 System.out.println("반 : "+classroom);
		 System.out.println("반 번호 : "+classroomNum);
		 System.out.println("성별 : "+gender);
		 System.out.println("성적 : "+score);
		 System.out.println(grade+"학년 "+classroom+"반 "+classroomNum+"번호 "+inputText+" "+gender1+"의 성적은 "+score+"이다.");
		 
	 }
	 
	 //나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
	 public void practice6(){
		 System.out.print("나이를 입력하세요 : ");
		 int age = sc.nextInt();
		 if(age <= 13) {
			 System.out.println("어린이");
		 }else if (13 < age && age <= 19) {
			 System.out.println("청소년");
		 }else {
			 System.out.println("성인");
		 }
	 }
	 // 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요. 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
	 // 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요
	 public void practice7(){
		 System.out.print("국어 점수를 입력하세요 : ");
		 int korean = sc.nextInt();
		 System.out.print("영어 점수를 입력하세요 : ");
		 int eng = sc.nextInt();
		 System.out.print("수학 점수를 입력하세요 : ");
		 int math = sc.nextInt();
		 int sum = korean+eng+math;
		 double avg = sum/3.0;
		 if(korean >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			 System.out.println("합격");
		 }else { 
			 System.out.println("불합격");
		 }
	 }
	 
	 //주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
	 public void practice8(){
		 System.out.print("주민번호를 입력하세요 : ");
		 String inputText = sc.nextLine();
		 System.out.println(inputText);
		 if(inputText.charAt(8)=='1') {
			 System.out.println("남자");
		 }else if(inputText.charAt(8)=='2') { 
			 System.out.println("여자");
		 }else {
			 System.out.println("잘못입력함");
		 }
		 
	 }
	 //키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요. 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
	 //아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)
	 public void practice9(){
		 System.out.print("숫자를 입력하세요 : ");
		 int num1 = sc.nextInt();
		 System.out.print("숫자를 입력하세요 : ");
		 int num2 = sc.nextInt();
		 System.out.print("숫자를 입력하세요 : ");
		 int num3 = sc.nextInt();
		 if(num3 <= num1 || num3 > num2) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
		 
	 }
	 
	 // 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
	 public void practice10(){
		 System.out.print("숫자를 입력하세요 : ");
		 int num1 = sc.nextInt();
		 System.out.print("숫자를 입력하세요 : ");
		 int num2 = sc.nextInt();
		 System.out.print("숫자를 입력하세요 : ");
		 int num3 = sc.nextInt();
		 if(num1==num2 && num1==num3&& num2==num3) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }
	 }
	 //A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 
	 //미만이면 “3000 미만”을 출력하세요. (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
	 public void practice11(){
		 System.out.print("A 사원의 연봉을 입력하세요 : ");
		 int num1 = sc.nextInt();
		 System.out.print("B 사원의 연봉을 입력하세요 : ");
		 int num2 = sc.nextInt();
		 System.out.print("C 사원의 연봉을 입력하세요 : ");
		 int num3 = sc.nextInt();
		 int a = (int)(num1*0.4)+num1;
		 int c = (int)(num3*0.15)+num3;
		 if(a > 3000) {
			 System.out.println("");
		 }
		 System.out.println();
		 
		 
	 }
}
