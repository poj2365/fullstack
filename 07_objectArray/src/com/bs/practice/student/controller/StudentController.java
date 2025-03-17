package com.bs.practice.student.controller;

import com.bs.practice.student.model.vo.Student;

public class StudentController {

	// [문제 1] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오
	// Student 클래스를 작성하고 관리 클래스에서 Student객체를 다섯 개 생성하여 각 점수의 합, 평균, 시험 결과를 실행 클래스에서
	// 실행한다.

	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;

	public StudentController() {// 5개의 객체배열을 위의 샘플 데이터의 값으로 초기화 해주는 기본 생성자
        sArr[0] = new Student("김길동","자바", 100);
        sArr[1] = new Student("박길동","디비", 50);
        sArr[2] = new Student("이길동","화면", 85);
        sArr[3] = new Student("정길동", "서버", 60);
        sArr[4] = new Student("홍길동", "자바", 20);

	}

	public Student[] printStudent() {// 객체 배열에 있는 데이터 반환
//		Student[] students = new Student[5];
//		for (int i = 0; i < sArr.length; i++) {
//			students[i]= sArr[i];
//		}
//		return students;
		return sArr;
	}

	public int sumScore() {// 객체 배열의 점수를 합한 값 리턴
		int result = 0;
		for (int i = 0; i < sArr.length; i++) {
			result += sArr[i].getScore();
		}
		return result;

	}

	// double배열을 만들어 sumScore의 리턴 값을 0번째 인덱스에 저장하고 합의 평균을 1번째 인덱스에 저장 후 배열 리턴
	public double[] avgScore(int input) {
		double[] result = new double[2];
		result[0] = input;
		result[1] = input/5.0;
		return result;

	}
}
