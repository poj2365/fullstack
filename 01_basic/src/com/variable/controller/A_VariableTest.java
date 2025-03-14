package com.variable.controller;

import java.security.CryptoPrimitive;

public class A_VariableTest {
	public static void main(String[] args) {
		//변수선언
		//자료형 변수명;
		
		//진위형
		//boolean
		boolean isCompleted;
		//저장값 : true, false
		isCompleted = true;
		//isCompleted = 1; 이런식으로 하면 안됨
		isCompleted = false;
		
		//단일문자
		//char
		char alpha;
		//저장값 : '단일문자'
		alpha = 'a';
		alpha = '1';
		alpha = 1;
		
		//문자열
		//단어, 문장을 저장할 때 사용
		//String
		String name;
		//저장값 : "문구"
		name = "유병승";
		System.out.println(name);
		name = "유";
		
		//정수형 변수선언
		//byte, short, int, long
		byte bnum;
		short snum;
		int inum;
		long lnum;
		bnum = 100;
		snum = 32123;
		inum = 2147483647;
		lnum = 2147483648L;
		
		//실수형
		//float, double
		float fnum;
		fnum = 180.5f;
		double dnum;
		dnum = 65.5;
		
		//변수 활용하기
		//변수에 저장된 값 가져오기
		//변수명을 활용해서 가져 올 수 있다
		System.out.println(isCompleted);

		System.out.println(name);
		
		//변수명은 저장될 데이터를 알아볼 수 있게 설정
		int a;
		int b;
		String c;
		
		//같은 지역 내에서 동일한 변수명은 사용할 수 없다.
		// {} 내부
		//double name;
		
		// 한번에 같은 자료형의 변수를 여러개 선언할 수 있다.
		String nickName,nickName2,nickName3,nickName4;
		nickName = "차은우";
		nickName2 = "코딩황제";
		nickName3 = "몰라";
		System.out.println(nickName);
		System.out.println(nickName2);
		System.out.println(nickName3);
		
		//지역 변수는 반드시 초기화 후 사용해야한다.
		//System.out.println(nickName4);
		nickName4 = "장원영";
		System.out.println(nickName4);
		
		// 초기화 숫자 : 0, 문자열 : "", 문자: ' '
		
		//변수명 명명규칙
//		1.대소문자가 구분되며 길이 제한이 없다.
		int Age;
		int aGe;
		int asdlsajdlsajdljdlkjdlasdlaknfklanfdlknflknfldnfldknfklnalnfadnfkldanfldknflkndflkandfldkanfalknfldanfldnflnkdaflkandlfndalknfalnfalknf;
//		2. 예약어를 사용하면 안 된다.
//		double public;
//		3. 숫자로 시작하면 안 된다.
//		String 1name;
		String name1;
//		String 2name;
		String name2;
//		4. 특수문자는 ‘_’ 와 ‘$’만 허용한다.
		float _basicNum;
		double $test$Num;
//		5. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다. 첫 시작 글자는 소문자로 하는 것이 관례이다.
		
		//변수명에 한글 사용 가능할까?
//		int 숫자; 가능은 한데 안쓰는게 나음
		
		// 변수 선언과 동시에 초기화하기
		int inum2 = 100;
		System.out.println(inum2);
		
		//상수 활용하기
		//상수는 변경할 수 없는 변수
		inum2= 200;
		System.out.println(inum2);
		final int MEMBER_AGE;
		MEMBER_AGE = 19;
		System.out.println(MEMBER_AGE);
		//MEMBER_AGE = 20;
		
		final int ERROR404 = 404, ERROR500 = 500;
		final String ERROR404_MESSAGE = "페이지가 없습니다.";
		
	}//main() 닫힘
	double name;
	
}
