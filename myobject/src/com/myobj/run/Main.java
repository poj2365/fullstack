package com.myobj.run;

import java.util.Arrays;
import java.util.Scanner;

import com.myobj.vo.Member;

public class Main {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Member member, member1, member2;
//		for (int i = 0; i < member.id.length; i++) {
//			System.out.print("id 입력 : ");
//			member.id[i] = sc.next();
//			System.out.print("pw 입력 : ");
//			member.pw[i] = sc.next();
//			System.out.print("email 입력 : ");
//			member.email[i] = sc.next();
//			System.out.print("age 입력 : ");
//			member.age[i] = sc.nextInt();
//			System.out.print("hobby 입력 : ");
//			member.hobby[i] = sc.next();
//			System.out.println("\n id : " + member.id[i] 
//					+ "\n pw: " + member.pw[i] 
//					+ "\n email : " + member.email[i]
//					+ "\n age : " + member.age[i] 
//					+ "\n hobby : " + member.hobby[i]);
//		}

		member = new Member();
		member1 = new Member();
		member2 = new Member();

		member.id = "admin";
		member.pw = "1234";
		member.email = "admin@admin.com";
		member.age = 55;
		member.hobby = new String[] { "운동", "코딩" };

		member1.id = "user01";
		member1.pw = "1111";
		member1.email = "user01@user01.com";
		member1.age = 33;
		member1.hobby = new String[] { "코딩" };

		member2.id = "minhyuk";
		member2.pw = "12345";
		member2.email = "minhyuk@minhyuk.com";
		member2.age = 21;
		member2.hobby = new String[] { "코딩", "러닝", "편식" };

//		System.out.println("\n id : " + member.id + "\n pw : " + member.pw + "\n email : " + member.email + "\n age : "
//				+ member.age + "\n hobby : " + Arrays.toString(member.hobby));

//		System.out.println("\n id : " + member1.id + "\n pw : " + member1.pw + "\n email : " + member1.email
//				+ "\n age : " + member1.age + "\n hobby : " + Arrays.toString(member1.hobby));

//		System.out.println("\n id : " + member2.id + "\n pw : " + member2.pw + "\n email : " + member2.email
//				+ "\n age : " + member2.age + "\n hobby : " + Arrays.toString(member2.hobby));

		// 3/12 생성자
		// Member 클래스에 생성자를 선언 후
		// 생성자를 이용해서 객체 생성 후 출력하기
		// 1. 기본생성자 선언
		// 2. 전체값을 설정하는 생성자 선언
		// 3. 아이디 비밀번호만 설정하는 생성자
		// 4. 아이디 비밀번호 취미만 설정하는 생성자

		Member mem = new Member();
		Member mem1 = new Member(member.id, member.pw, member.email, member.age, member.hobby);
		Member mem2 = new Member(member.id, member.pw);
		Member mem3 = new Member(member.id, member.pw, member.hobby);

		Member mem4 = new Member(member1.id, member1.pw, member1.email, member1.age, member1.hobby);
		Member mem5 = new Member(member1.id, member1.pw);
		Member mem6 = new Member(member1.id, member1.pw, member1.hobby);

		Member mem7 = new Member(member2.id, member2.pw, member2.email, member2.age, member2.hobby);
		Member mem8 = new Member(member2.id, member2.pw);
		Member mem9 = new Member(member2.id, member2.pw, member2.hobby);
		
		System.out.println("\n id : " + mem1.id + "\n pw : " + mem1.pw + "\n email : " + mem1.email + "\n age : "
				+ mem1.age + "\n hobby : " + Arrays.toString(mem1.hobby));

		System.out.println("\n id : " + mem4.id + "\n pw : " + mem4.pw + "\n email : " + mem4.email + "\n age : "
				+ mem4.age + "\n hobby : " + Arrays.toString(mem4.hobby));
		
		System.out.println("\n id : " + mem7.id + "\n pw : " + mem7.pw + "\n email : " + mem5.email + "\n age : "
				+ mem7.age + "\n hobby : " + (mem8.hobby!=null?String.join(",", mem8.hobby):mem8.hobby));

		System.out.println("\n id : " + mem7.id + "\n pw : " + mem7.pw + "\n email : " + mem5.email + "\n age : "
				+ mem7.age + "\n hobby : " + Arrays.toString(mem8.hobby));
		printMember(mem1);
	}
	
	public static void printMember(Member m) {
		System.out.println("\n id : " + m.id + "\n pw : " + m.pw + "\n email : " + m.email + "\n age : "
				+ m.age + "\n hobby : " + Arrays.toString(m.hobby));
	}
}
