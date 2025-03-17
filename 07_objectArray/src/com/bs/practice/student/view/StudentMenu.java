package com.bs.practice.student.view;

import com.bs.practice.student.controller.StudentController;
import com.bs.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	
	//	학생정보와 성적, 결과 출력하는 기본생성자
	public void StudentMenu() {

		Student[] sd = ssm.printStudent();
		System.out.println("==========학생 정보 출력==========");
		for(int i=0;i<sd.length;i++) {
			System.out.println(sd[i].inform());
		}
		System.out.println();
		System.out.println("==========학생 성적 출력==========");
		int sumScore = ssm.sumScore();
		System.out.println("학생 점수 합계 : "+sumScore);
		double[] avgScore = ssm.avgScore(sumScore);
		System.out.println("학생 점수 평균 : "+avgScore[1]);
	
		System.out.println();
		System.out.println("==========성적 결과 출력==========");
		for(int i=0;i<sd.length;i++) {
			if(ssm.CUT_LINE > sd[i].getScore()) {				
				System.out.println(sd[i].getName()+"학생은 재시험 대상입니다.");
			}else {
				System.out.println(sd[i].getName()+"학생은 통과입니다.");
			}
		}
	}
}
