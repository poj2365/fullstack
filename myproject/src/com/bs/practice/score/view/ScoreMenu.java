package com.bs.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.bs.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			switch (sc.nextInt()) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}

	public void saveScore() {
		int num = 0; // 학생 숫자를 나타낼 변수
		while (true) {
			System.out.println(num + "번 째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 점수 : ");
			int korean = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			int sum = korean + eng + math;
			double avg = sum/ 3.0;
			scr.saveScore(name, korean, eng, math, sum, math);
			num++;
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			String chk = sc.next();
			if (chk.equals("N") || chk.equals("n")) {
				return;
			} else {
				continue;
			}
		}
	}

	public void readScore() {
		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수
		
//		try (FileInputStream fis = new FileInputStream("score"); 
//				DataInputStream dis = new DataInputStream(fis);
		try(DataInputStream dis = scr.readScore()) {
				while(true) {
				String name = dis.readUTF();
				int kor = dis.readInt();
				int eng = dis.readInt();
				int math = dis.readInt();
				int sum = dis.readInt();
				double avg = dis.readDouble();
				count ++;
				sumAll += sum;
				}
		}catch (EOFException e) {
			// 읽은 회수, 전체 합계, 전체 평균 출력
			avgAll = sumAll/3.0;
			System.out.println("읽은 회수 : "+count+" 전체 합계 : "+sumAll+" 전체 평균 : "+avgAll);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
