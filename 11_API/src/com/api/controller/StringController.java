package com.api.controller;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringController {
	public static void main(String[] args) {
		// 자바에서 문자열을 처리하는 클래스
		// 3가지 : String StringBuffer, StringBuilder
		// String : 기본자료형처럼 사용하는 클래스 대입연산 가능
		// StringBuffer / StringBulieder : 대입연산 불가능
		// 클래스가 제공하는 메소드를 이용해서 문자열을 저장, 관리

		String data = "유병승";
		StringBuffer sb = new StringBuffer("유병승");
		System.out.println(data.hashCode());
		data += "김";
		System.out.println(data.hashCode());
		System.out.println(sb.hashCode());
		sb.append("김");
		System.out.println(sb.hashCode());
		System.out.println(data);
		System.out.println(sb);

		// String은 변경하지 않는 문자열을 저장할 때
		// StringBuffer, StringBuilder 자주 변경되는 문자열을 저장할 떄

		// String이 제공하는 유용한 메소드에 대해 알아보자
		// 1. 문자열을 합치는 기능 : concat() -> += 연산자와 동일한 기능
		String result = data.concat("이제 쉬는 시간");
		System.out.println(data + " : " + result);

		// 2. 문자열에 특정문자가 포함되어있는지 확인하는 메소드
		// contains("문자열") : boolean
		boolean result2 = data.contains("유");
		System.out.println(result2);
		String test = "풀스택 11기";
		if (test.contains(" ")) {
			System.out.println("공백 있음");
		} else {
			System.out.println("공백 없음");
		}

		// 3. 문자열에서 특정문자의 인덱스 번호를 찾는 기능
		// indexOf("문자열") : int
		int index = test.indexOf("11");
		System.out.println(test);
		System.out.println(index);
		// 찾는 값이 없는 경우 -1 반환
		index = test.indexOf("11");
		System.out.println(index);
		if (test.indexOf("유") == -1) {

		}
		if (!test.contains("유")) {

		}
		// 이런식으로 활용 가능
		// lastIndexOf : 마지막글자(오른쪽)부터 탐색
		test = "병승병승하하하병승";
		System.out.println(test.indexOf("병승")); // -> 0
		System.out.println(test.lastIndexOf("병승")); // -> 7

		// 응용
		// indexOf("문자열", 시작 인덱스 번호)
		System.out.println(test.indexOf("병승", 2)); // 병승병 012 -> 2
		System.out.println(test.indexOf("병승", 3)); // 병승병/ 시작 /승하하하병승 0123 -> 7
		System.out.println(test.indexOf("병승", test.indexOf("병승") + 1));

		// 4. 문자열을 특정 문자를 기준으로 배열로 변경하는 메소드
		// split("특정문자") : String[]
		test = "java,oracle,jdbc,html/css,javascript";
		String[] language = test.split(",");
		System.out.println(Arrays.toString(language));

		test = "유병승,19,경기도시흥시\n한창규,31,서울시신림동";
		String[] persons = test.split("\n");
		for (String p : persons) {
			String[] person = p.split(",");
			String name = person[0];
			int age = Integer.parseInt(person[1]);
			String address = person[2];
		}

		// 5. 문자열의 특정문자를 원하는 문자로 변경하는 메소드
		// replace("특정문자", "변경문자") : String
		test = "나는 코딩이 안 맞나봐~ 안!안!안!";
		result = test.replace("안", "잘");
		System.out.println(result);

		// 6. 문자열 배열을 문자열로 변경해주는 메소드 -> static
		// join("특정문자", 대상 배열) : String
		String[] hobby = { "운동", "코딩", "독서" };
		result = String.join(">", hobby);
		System.out.println(result);

		// 7. 문자열을 자르는 기능 -> 문자열에서 원하는 문구만 가져오는 메소드
		// subString(시작 인덱스 [, 끝 인덱스])
		test = "오늘 수업 끝";
		result = test.substring(0, test.length() - 1);
		System.out.println(result + "열심히 하자");
		result = test.substring(test.length() - 1);
		System.out.println(result);

		// 응용
		result = test.substring(test.indexOf("수"), test.indexOf("수") + 2);
		System.out.println(result);

		test = "profile.png";
		result = test.substring(test.indexOf("."));
		System.out.println(result);

		// 8. 영문자를 대문자, 소문자로 변경해주는 메소드
		// toUpperCase / toLowerCase : String
		test = "abcdEFGhijk";
		System.out.println(test);
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		Scanner sc = new Scanner(System.in);
		System.out.println("계속 하시겠습니까?(y/n)?");
		test = sc.next().toLowerCase();
		if (test.equals("y")) {
			System.out.println("진행시켜");
		}

		// 9. 문자열의 공백을 제거해주는 기능
		// trim() : String
		test = "            이제 곧 점심시간 뭐 드세요?            ";
		System.out.println(test);
		System.out.println(test.trim());

		// 10. 기본타입을 문자열로 변경해주는 메소드 -> static
		// valueOf()
		int num = 100;
//		test =(String)num;
		test = String.valueOf(num);
		System.out.println(test);
		double height = 180.5;
		test = String.valueOf(height);
		System.out.println(test);

		// 11. 문자열의 시작문자, 끝문자를 확인하는 메소드
		// startsWith / endsWith : boolean
		test = "점심 시간";
		System.out.println(test.startsWith("점"));
		System.out.println(test.endsWith("!"));

		// 12. 문자열을 byte 배열로 변환해주는 메소드
		// getBytes() : byte[]
		// getbytes(문자열 인코딩)
		test = "이제 문자열 메소드 거의 끝나가요";
		byte[] barr = test.getBytes(Charset.forName("UTF-8"));
		for (byte b : barr) {
			System.out.println(b);
		}
		result = new String(barr);
		System.out.println(result);

		// 13. isBlank(), isEmpty()
		test = " ";
		System.out.println(test.isBlank());
		System.out.println(test.isEmpty());

		// 14. 문자열에 있는 패턴 값 설정하는 메소드
		// formatted()
		test = "안녕 난 %s야 반가워 %d살이야".formatted("유병승", 19);
		System.out.println(test);

		// 문자열 작성할때 개행, 들여쓰기를 유지하면서 문자열 만들기
		test = """
				<html>
				<head>
					<title>나의 홈페이지</title>
				</head>
				<body>
					<h1>%s의 메인 페이지</h1>
				</body>
				</html>
				""".formatted("유병승");
		System.out.println(test);
		
		// StringBuffer / StringBuilder
		StringBuffer sb1 = new StringBuffer("여러분");
		System.out.println(sb1);
		
		// 제공하는 메소드를 이용해서 값을 저장/수정/삭제할 수 있다.
		// 1. 문자열 추가하기 : append("문자") 메소드
		sb1.append("식곤증 안돼!");
		System.out.println(sb1);
		
		// 2. 문자열을 원하는 위치에 추가하기 : insert( 추가할 위치 [index], 추가할 문자 ) 메소드
		sb1.insert(sb1.indexOf(""), "!!!");
		System.out.println(sb1);
		
		// 3. 문자열 삭제하기 : delete (시작인덱스, 끝인덱스)
		sb1.delete(sb1.indexOf("!!!"), 3);
		System.out.println(sb1);
		
		// 한 문자만 삭제하기 : deleteCharAt(인덱스)
		sb1.deleteCharAt(sb1.length()-1);
		System.out.println(sb1);
		
		// 4. 문자열 수정하기 : setCharAt(인덱스 번호, 문자)
		sb1.setCharAt(sb1.length()-2, ' ');
		System.out.println(sb1);
		
		// StringBuffer / StringBuilder
		// 문자열 다루는 메소드
		// 문자열 길이 : length()
		System.out.println(sb1.length());
		//특정문자의 인덱스 번호를 알려주는 메소드
		System.out.println(sb1.indexOf("식곤증"));
		System.out.println(sb1.lastIndexOf("돼"));
		// 문자열을 잘라나는 메소드 : subString()
		System.out.println(sb1.substring(3,7));
		
		// 문자열 바꾸는 메소드 : replace(시작 인덱스, 끝 인덱스, 바꿀 문자열);
		sb1.replace(7, sb1.length(), "안돼!!!");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		
		// String 과 StringBuffer / StringBuilder 호환
		test = new String(sb1);
		sb1 = new StringBuffer(test);
		System.out.println(test);
		System.out.println(sb1);
		
		// StringTokenizer 클래스 이용하기
//		test="유병승,양지혁,박서영,박세웅,황민익";
		test="java,oracle,jdbc,javascript/jquery,servlet";
		StringTokenizer st = new StringTokenizer(test, ",/");
		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//			System.out.println(st.nextToken().length()); 
			// java.util.NoSuchElementException 발생
			String name = st.nextToken();
			System.out.println(name);
			System.out.println(name.length());
			
		}

	
	}
}
