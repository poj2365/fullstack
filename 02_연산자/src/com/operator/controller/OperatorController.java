package com.operator.controller;

import java.util.Scanner;

public class OperatorController {
	final Scanner sc = new Scanner(System.in);
	
	// 기능 제공용 클래스 -> 메소드 선언
	public void singleOp() {
		// 단항 연산자 활용하기
		// 1. 부정연산자 -> boolean 값을 반전시키는 연산자
		// !변수명(boolean) 또는 !기능호출() 또는 !비교연산자
		System.out.println("=== 부정연산자 ===");
		boolean flag = true;
		System.out.println("flag : "+flag);
		System.out.println("!flag : "+!flag);
		
		String name = "유병승";
		System.out.println(!name.contains("병"));
		
		System.out.println(!(10<0));
		
		// 2. 증가, 감소 연산자
		// 변수에 저장된 값을 1증가 시키고 다시 변수에 저장하는 연산자
		// ++변수, --변수 -> 전위연산
		// 변수++, 변수-- -> 후위연산
		int number = 10;
		number++;// number = number + 1;
		System.out.println(number);
		
		number--;
		System.out.println(number);
		
		// 숫자 셀 때 -> 특정 기능이 수행되는 횟수를 기록할 때
		// 반복문 실행할 때 사용
		
		// 전위 연산 , 후위 연산 차이
		// 단독으로 사용했을 때는 차이가 없음
		// 다른 연산자와 같이 사용했을 때 전위 연산과 후위 연산과 차이가 발생
		number = 0;
		++number;
		++number;
		System.out.println(number);
		
		int result = number++;
		int result2 = ++number;
		System.out.println(result+" "+number);
		System.out.println(result2+" "+number);
		//number=4
		result= number++ +20; 
		result= ++number +20; 
		System.out.println(result+" "+number);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i : "+i);
		}
		
		
	}
	
	public void calcOp() {
		// 산술연산자
		// +, -, *, /, %(나머지)
		int su = 2;
		int su2 = 10;
		int result = su + su2;
		System.out.println("su+su2 : " + result);
		result = su-su2;
		System.out.println("su-su2 : " + result);
		result = su*su2;
		System.out.println("su*su2 : " + result);		
		double result1 = (double)su/su2;
		System.out.println("su/su2 : " + result1);
		
		result = (su+su2)*10/3-2;
		System.out.println(result);
		
		// 배수, 약수 -> 나머지 이용
		// x/4 -> 0, 1, 2, 3
		System.out.println(su%2);
		
		
	}
	
	public void calculator() {
		
		System.out.print("첫 번째 숫자를 입력해 주세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해 주세요 : ");
		int b = sc.nextInt();
		
		// 더하기
		System.out.println("더하기 : "+(a+b));
		// 빼기
		System.out.println("빼기 : "+(a-b));
		// 곱하기
		System.out.println("곱하기 : "+a*b);
		// 나누기
		System.out.println("나누기 : "+(double)a/b);
	}
	
	public void compareOp() {
		// 비교 연산자
		// 동등 비교 : ==(일치), !=(불일치)
		// 대소 비교(숫자) : <,>,<=,>=
		// 비교 연산의 결과는 boolean 형으로 반환 -> true, false
		// 조건문을 만들 때 사용
		// 1. 동등 비교
		// 숫자, 문자(char)
		int num = 13;
		int num1 = 19;
		int num2 = 13;
		
		System.out.println(num==num1);
		System.out.println(num==num2);
		
		double height = 180.5;
		double height1 = 174.5;
		double height2 = 180.5;
		
		System.out.println(height==height1);
		System.out.println(height==height2);
		
		char ch = 'A';
		char ch1 = 'a';
		char ch2 = 'A';
		System.out.println(ch==ch1);
		System.out.println(ch==ch2);
		
		System.out.println(ch==65);
		
		System.out.println("-----------------------");
		// 문자열 동등 비교
		String name = sc.next();
		String name1 = new String("유병승");
		System.out.println(name=="유병승");
		System.out.println(name==name1);
		// 문자열 동등 비교 메소드 사용
		// equals()
		System.out.println(name.equals("유병승"));
		System.out.println(name.equals(name1));
		
		// !=
		System.out.println("num!=num1 : " + (num!=num1));
		// 문자열은?
		System.out.println(!name.equals(name1));
		
		// 대소 비교하기
		System.out.println("num<num1 : "+(num<num1));
		System.out.println("num>num1 : "+(num>num1));
		
		System.out.println("num<=num1 : "+(num<=num2));
		System.out.println("height>height1 : "+(height>=height1));
		
		//char형 대소 비교
		System.out.println("ch<ch1 : "+(ch<ch1));
		System.out.println('A'>'Z');
		System.out.println(ch<'a');
		
		//문자열 대소비교 -> X
		//System.out.println(name<name1);
	}
	
	public void logicOp() {
		// 논리 연산자
		// boolean 값을 연결해주는 연사자
		// 그리고, 또는
		// 그리고 : &&(AND) 두개의 피연산자 모두 true일 경우 true를 반환
		// 또는 : ||(OR) 두개의 피연산자 중 한개라도 true일 경우 true를 반환
		// id : admin pw : 1234 를 확인하기
		String id = "admin";
		String password = "1234";
		System.out.println(id.equals("admin") && password.equals("1234"));
		
		// 성별이 여자 또는 남자인 경우 true 아니면 false
		char gender = '남';
		System.out.println(gender=='여' || gender=='남');
		
		// 성별이 여자이거나 성인인 경우 true /false
		int age = 20;
		System.out.println(gender=='여' || age >= 20);
	
		// 숫자의 범위를 표시할 때
		// 입력 값이 1~10까지 수인지 확인
		int su = 5;
		System.out.println(su > 1 && su < 20);
		
		//나이를 입력 받고 청소년이면 true / false
		// 문자 한개를 입력받고 그 문자가 대문자인지 확인하는 기능
		System.out.print("나이를 입력해주세요 : ");
		int age2 = sc.nextInt();
		System.out.println((9 < age2 && age2 < 19)?"청소년":"청소년이 아닙니다.");
		
		System.out.print("알파벳을 입력해주세요 : ");
		char alpha = sc.next().charAt(0); 
		System.out.println(('A' <= alpha && alpha <= 'Z')?"대문자":"대문자아님");
		
		// 논리 연산자 여러개 사용하기
		// 남자 또는 여자 이고 나이가 20살인 사람이니?
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		System.out.println((gender =='남' || gender =='여') && age2 == 20);
		
	}
	public void complexOp() {
		// 복합대입 연산자
		// +=, -=, /=, *=
		// 값을 누적, 값을 차감
		
		int total = 3000;
		total += 100;
		System.out.println(total);
		total -= 1800;
		System.out.println(total);
		
		//문자열 적용하기
		String msg = "";
		msg += "오늘은 수요일입니다.";
		msg += "2일만 나오면 쉬어요~";
		System.out.println(msg);
		
		String html="";
		html+="<html>";
		html+="<head>";
		html+="<title>나의 첫 페이지</title>";
		html+="</head>";
		html+="<body>";
		html+="<h1>나의 첫 페이지입니다.</h1>";
		html+="</body>";
		html+="</html>";
		System.out.println(html);
		
	}
	
	public void thirdOp() {
		// 삼항 연산자
		// 조건식(true,false를 가지는 것)?true 일 경우 실행할 내용 : false 일 경우 실행할 내용
		// 키가 180보다 크면 키가 크네요, 작으면 키가 작네요
		System.out.print("당신의 키를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.println(height>= 180?"키가 크네요" : "키가 작네요");
		
		//점수를 입력 받아서 60점 이상인 경우 합격 아니면 불합격
		System.out.print("당신의 점수를 입력하세요 : ");
		int score = sc.nextInt();
		System.out.println(score>60?"합격":"불합격");
	}
	
	public void bitOp() {
		// 비트 연산자 활용
		// 저장소에 있는 bit 끼리 연산처리하는 것
		// ~A : 모든 비트 값을 반전시키는 것
		// A&B(AND) : 두 비트값이 모두 1일 때 1, 아니면 0 반환
		// A|B(OR) : 두 비트값 중 한개가 1일때 1, 아니면 0 반환
		// A^B(XOR) : 두 비트값이 다를때 1, 아니면 0 반환
		// A>>2, A<<2
		int a = 10;
		int b = 22;
		String bit = "";
		for (int i = 0; i < 32; i++) {
			bit += 0;
		}
		String bitData = bit+Integer.toBinaryString(a);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a비트값 "+a);
		
		bitData = bit+Integer.toBinaryString(b);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> b비트값 "+b);
		
		bitData = bit+Integer.toBinaryString(a&b);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a&b비트값 "+(a&b));

		bitData = bit+Integer.toBinaryString(a|b);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a|b비트값 "+(a|b));
		
		bitData = bit+Integer.toBinaryString(a^b);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a^b비트값 "+(a^b));

		bitData = bit+Integer.toBinaryString(~a);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> ~a비트값 "+(~a));
		
		bitData = bit+Integer.toBinaryString(a<<1);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a<<1비트값 "+(a<<1));

		bitData = bit+Integer.toBinaryString(a>>1);
		bitData = bitData.substring(bitData.length()-32);
		System.out.println(bitData+"-> a>>1비트값 "+(a>>1));
	}
	
	
	// 연산자 실습
	public void checkLogic() {
		System.out.print("주소를 입력해주세요 : ");
		String address = sc.nextLine();
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.println((address.equals("서울")|| address.equals("인천")) && (29 < age && age < 40));
	}
	
	public void calcPoint() {
		System.out.print("수학 점수를 입력해주세요 : ");
		int total = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		total += sc.nextInt();
		System.out.print("국어 점수를 입력해주세요 : ");
		total += sc.nextInt();
		System.out.print("코딩 점수를 입력해주세요 : ");
		total += sc.nextInt();
		
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+(double)total/4);
	}
	
	public void inputMsg() {
		System.out.print("첫번째 메세지를 입력해주세요 : ");
		String inputMsg = sc.nextLine()+"\n";
		System.out.print("두번째 메세지를 입력해주세요 : ");
		inputMsg += sc.nextLine()+"\n";
		System.out.print("세번째 메세지를 입력해주세요 : ");
		inputMsg += sc.nextLine()+"\n";
		System.out.print("네번째 메세지를 입력해주세요 : ");
		inputMsg += sc.nextLine()+"\n";
		
		System.out.println(inputMsg);
	}
	
	public void loginCheck() {
		System.out.print("아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요: ");
		String pw = sc.nextLine();
		
		System.out.println(id.equals("user01") && pw.equals("1234")?"로그인 성공":"로그인 실패");
	}
	
}
