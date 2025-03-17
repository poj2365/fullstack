package com.bs.hw.person.view;

import java.util.Scanner;

import com.bs.hw.person.controller.PersonController;
import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {

			int[] count = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + count[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + count[1] + "명입니다.");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			switch (sc.nextInt()) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {
		int[] count = pc.personCount();
		if (count[0] == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		} else {
			System.out.println("1. 학생 추가");
		}
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		switch (sc.nextInt()) {
		case 1:
			if (count[0] == 3) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			} else {
				insertStudent();
				break;
			}
		case 2:
			if (count[0] == 0) {
				System.out.println("현재 저장된 학생은 " + count[0] + "명입니다. 메인 메뉴로 돌아갑니다.");
			} else {
				printStudent();
				break;
			}
		case 9:
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}

	public void employeeMenu() {
		int[] count = pc.personCount();
		if (count[1] == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		} else {
			System.out.println("1. 사원 추가");
		}
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		switch (sc.nextInt()) {
		case 1:
			if (count[1] == 10) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			} else {
				insertEmployee();
				break;
			}
		case 2:
			if (count[1] == 0) {
				System.out.println("현재 저장된 사원은 " + count[1] + "명입니다. 메인 메뉴로 돌아갑니다.");
			} else {
				printEmployee();
				break;
			}
		case 9:
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}

	public void insertStudent() {
		while (true) {

			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();
			int[] count = pc.personCount();
			if (count[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			} else {
				pc.insertStudent(name, age, height, weight, grade, major);
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char chk = sc.next().charAt(0);
				if (chk == 'n' || chk == 'N') {
					return;
				} else {
					continue;
				}
			}
		}
	}

	public void printStudent() {
		Student[] s = pc.printStudent();
		for (int i = 0; i < s.length; i++) {
			String result = s[i].toString();
			System.out.println(result);
		}
	}

	public void insertEmployee() {
		while (true) {
			System.out.print("사원 이름 : ");
			String name = sc.next();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			System.out.print("사원 부서 : ");
			String dept = sc.next();
			int[] count = pc.personCount();
			if (count[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				return;
			} else {
				pc.insertEmployee(name, age, height, weight, salary, dept);
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char chk = sc.next().charAt(0);
				if (chk == 'n' || chk == 'N') {
					return;
				} else {
					continue;
				}
			}
		}
	}

	public void printEmployee() {
		Employee[] e = pc.printEmployee();
		for (int i = 0; i < e.length; i++) {
			String result = e[i].toString();
			System.out.println(result);
		}
	}
}
