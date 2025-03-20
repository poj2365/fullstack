package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.exception.common.exception.ServerException;

public class ExceptionController {

	public void uncheckedException() {
		// 발생한 예외 클래스를 처리하지 않아도 되는 예외
		// RuntimeException 클래스를 상속받아 구현된 예외 클래스들
		// NullPointerException, ArraysIndexOutOfBoundsException ...
		String name = null;
		try {
			name.length();
		} catch (NullPointerException e) {
			System.err.println(e + " 에러 발생");
		}

		String strsu = "1000원";

		try {
			int su = Integer.parseInt(strsu);
		} catch (NumberFormatException e) {
			System.err.println(e + " 에러 발생");
		}

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력 : ");
			int su = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println(e + " 에러 발생");
		}

		try {
			int[] number = new int[5];
			number[5] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e + " 에러 발생");
		}

		// 예외 클래스가 발생했을때 직접처리하기
		// try~catch 구문
		// try {
		// 예외가 발생할 가능성이 있는 코드
		// }catch (예외 클래스명 변수명){
		//
		// }

		try {
			name.length();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("이거 실행되니?");

		int[] number = new int[3];
		try {
			number[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			int[] temp = new int[number.length + 3];
			System.arraycopy(number, 0, temp, 0, number.length);
			temp[number.length] = 100;
			number = temp;
		}
		System.out.println(Arrays.toString(number));

		Scanner sc = new Scanner(System.in);

		int su = 0;
		boolean flag = false;
		do {
			try {
				System.out.print("숫자 입력 : ");
				su = sc.nextInt();
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력 해주세요 !!!");
				flag = true;
				sc.nextLine();
			}
		} while (flag);
	}
	
	public void exceptionHandle() {
		// 예외처리구문
		// 1. try 문의 영역은 별도의 영역임 내부에 선언된 변수는 try 문 내부에서만 사용이 가능
		//    catch 문의 영역도 마찬가지
		// 2. try 문 안에 작성된 코드는 예외 발생 전까지만 실행,
		//    예외 발생 코드 아래에 있는 코드들은 실행하지 않는다.
		// 3. catch 문은 발생한 예외와 일치하는 예외 클래스가 선언되어 있어야 실행
		// 	  catch 문은 여러개 선언할 수 있다.
		// 4. 예외 클래스도 상속관계가 있음
		//    부모 예외 클래스는 발생한 자식 예외 클래스를 처리할 수 있다.
		// 5. catch 문에 선언된 예외 클래스 변수에는 다양한 예외 관련 정보를 저장한 객체가 저장된
		//    예외 메세지, stacktrace정보(실행 메소드들)
		
		String name = null;
		int[] intArr = new int[3];
		String test = "test";
		try {
			System.out.println("exception 발생 전");
			Object o = 10;
			String s= (String)o;
			name.length();
			intArr[3]=100;
			System.out.println(test);
			System.out.println("exception 발생 후");
		}catch (ClassCastException | NullPointerException e){
			System.out.println(test);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("저장공간이 부족합니다.");
		}catch (RuntimeException e) {
			StackTraceElement[] trace = e.getStackTrace();
			for(StackTraceElement s :trace) {
				System.out.println(s.getMethodName());
			}
			e.printStackTrace();
			
//			if(e.getClass().getName().equals("ClassCastException")) {
//				System.out.println(e.getMessage()+" 에러발생");
//				System.out.println(e.getMessage());
//				System.out.println(e.getClass().getName());
//			}
//			if(e instanceof ClassCastException) {
//				System.out.println(e.getMessage()+" 에러발생");
//				System.out.println(e.getMessage());
//				System.out.println(e.getClass().getName());
//			}
//			if(e instanceof NullPointerException) {
//				System.out.println(e+" 에러발생");
//				System.out.println(e.getMessage());
//				System.out.println(e.getClass().getName());
//			}
		}

		System.out.println(test);
		
		// 예외 처리에서 무조건 실행할 구문이 있는 경우
		// finally { }
		Object o = "test";
		try {
			Integer i =(Integer)o;
			String s = (String)o;
		}catch (ClassCastException e) {
			System.out.println("에러 발생 처리");
			return;
		}finally {
			System.out.println("BS");
		}
	}

	public void throwExceptionTest(Object o) {
		if(o instanceof String) {
			System.out.println("문자열 처리");
		}else if(o instanceof Integer) {
			System.out.println("숫자 처리");
		}else {
//			throw new IllegalArgumentException("문자열, 숫자만 처리가 가능합니다 :(");
			throw new ServerException("서버에러임");
		}
	}
	
	// 나만의 Exception 만들기
	// 기존에 있는 Exception 클래스를 상속받아서 구현
	public void checkedExceptionTest() throws FileNotFoundException, EOFException{
		// 반드시 예외처리 구문을 작성해야하는 예외들
		// IOEcxption, 자식들 (FileNotFounException, SQLException, EOFException)
		try {
			throw new IOException("메롱");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// throws를 이용해서 예외처리하기
		throw new FileNotFoundException("파일 없어!");
	}
}
