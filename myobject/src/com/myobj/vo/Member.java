package com.myobj.vo;

public class Member {// 3/11
	// 우리는 커뮤니티사이트를 만들기 위해
//	회원가입을 받으려고한다. 회원에 대한
//	정보를 저장할 객체를 만드세요!
//	 아이디, 비밀번호, 이메일, 나이, 취미의 정보가 
//	필요하다 * 객체를 생성해서 직접접근해서 데이터를 저장 2개
//	admin 1234 admin@admin.com 55 운동,코딩
//	user01 1111 user01@user01.com 33 코딩
//	minhyuk 12345 minhyuk@minhyuk.com 21 코딩,러닝,편식
//	생성 후 출력하기

//	public String[] id = new String[3];
//	public String[] pw= new String[3];
//	public String[] email= new String[3];
//	public int[] age= new int[3];
//	public String[] hobby= new String[3];

	public String id;
	public String pw;
	public String email;
	public int age;
	public String[] hobby;

	// 3/12 생성자
	// 매개변수 생성자를 만들기전에 기본생성자를 생성해줘야 에러 안남
	public Member() {// 기본생성자

	}

	public Member(String id, String pw, String email, int age, String[] hobby) {
		this.id = id;
		if(pw.length()>=8) {// 유효성 검사
			this.pw=pw;
		}
//		if(pw.length()<8) {
//			throw new IllegalArgumentException("비밀번호는 8글자 이상 입력하세요");
//		}
		this.email = email;
		this.age = age;
		this.hobby = hobby;
	}

	public Member(String id, String pw) {
//		this.id = id;
//		this.pw = pw;
		this(id,pw,"없음",0,null);
	}

	public Member(String id, String pw, String[] hobby) {
//		this.id = id;
//		this.pw = pw;
//		this.hobby = hobby;
		this(id,pw,"없음",0,hobby);
	}

}
