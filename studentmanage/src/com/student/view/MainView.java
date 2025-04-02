package com.student.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;
import static com.student.controller.StudentController.getStudentController;

// 프로그램에서 화면을 출력해주는 역할
public class MainView {// 3/13
	
	private static MainView view;
	
	private MainView() {
		
	}
	
	public static MainView mainView() {
		if(view==null) {
			view = new MainView();
		}
		return view;
	}
	
	private static final Scanner SCANNER = new Scanner(System.in);
	
	// 1. 메뉴 화면 출력
//	public void mainMenu(StudentController sc) {
	public void mainMenu() {
		// 컨트롤러에서 저장된 파일을 불러오는 메소드 실행
		while (true){
			System.out.println("==== 학생관리 프로그램 v0.2 ====");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 수정(학년, 반, 전화번호, 주소)");
			System.out.println("3. 학생 삭제");
			System.out.println("4. 전체 학생 조회");
			System.out.println("5. 학생번호로 조회");
			System.out.println("6. 학년으로 조회");
			System.out.println("7. 이름으로 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int choice = SCANNER.nextInt();
			switch (choice) {
			case 1:
				getStudentController().insertStudent();
				break;
			case 2:
				getStudentController().updateStudent();
				break;
			case 3:
				getStudentController().deleteStudent();
				break;
			case 4, 5, 6, 7:
				getStudentController().searchStudent(choice);
				break;
//			case 5:
//				getStudentController().searchStudentByNo();
//				break;
//			case 6:
//				getStudentController().searchStudentByGrade();
//				break;
//			case 7:
//				getStudentController().searchStudentByName();
//				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				// 자동으로 학생 데이터 저장하는 메소드 실행
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	
	// 2. 학생정보 등록화면
	// 학생번호, 이름, 학년, 반, 주소, 전화번호, 성별, 키, 몸무게
	public List<Student> insertStudentView() {
		System.out.println("===== 학생등록 =====");
		System.out.print("이름을 입력하세요 : ");
		String name = SCANNER.next();
		System.out.print("학년을 입력하세요 : ");
		int grade = SCANNER.nextInt();
		System.out.print("반을 입력하세요 : ");
		int classroom = SCANNER.nextInt();
		System.out.print("주소를 입력하세요 : ");
		SCANNER.nextLine();
		String address = SCANNER.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String phoneNum = SCANNER.nextLine();
		System.out.print("성별을 입력하세요 : ");
		char gender = SCANNER.next().charAt(0);
		System.out.print("키를 입력하세요 : ");
		double height = SCANNER.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight = SCANNER.nextDouble();
		
        List<Student> inputStudentList = new ArrayList<>();
        Student student = new Student();
        student.setStudentName(name);
        student.setGrade(grade);
        student.setClassroom(classroom);
        student.setAddress(address);
        student.setPhoneNum(phoneNum);
        student.setGender(gender);
        student.setHeight(height);
        student.setWeight(weight);
        inputStudentList.add(student);
		return inputStudentList;
	}
	
	public void printMessage(String msg) {
		System.out.println("===== 알림 메세지 =====");
		System.out.println(msg);
		System.out.println("====================");
	}
	
	public void printStudent(List<Student> sd) {
		System.out.println("===== 알림 메세지 =====");
		System.out.println("===== 학생조회결과 =====");
		System.out.println(sd.toString());
		System.out.println("====================");
	}
	
	public int searchStudentByNo() {
		System.out.print("학생 번호를 입력해주세요 : ");
		return SCANNER.nextInt();
	}

	public int searchStudentByGrade() {
		System.out.print("학년을 입력해주세요 : ");
		return SCANNER.nextInt();
	}

	public String searchStudentByName() {
		System.out.print("학생 이름을 입력해주세요 : ");
		return SCANNER.next();
	}
	
	public Student updateStudent() {
		Student updateStudent = new Student();
		System.out.print("정보를 수정할 학년을 입력해주세요 : ");
		updateStudent.setGrade(SCANNER.nextInt());
		System.out.print("정보를 수정할 반을 입력해주세요 : ");
		updateStudent.setClassroom(SCANNER.nextInt());
		System.out.print("정보를 수정할 전화번호를 입력해주세요 : ");
		updateStudent.setPhoneNum(SCANNER.next());
		SCANNER.nextLine();
		System.out.print("정보를 수정할 주소를 입력해주세요 : ");
		updateStudent.setAddress(SCANNER.nextLine());
		
		return updateStudent;
	}

	public Student inputUpdateData() {
		System.out.print("학생 번호를 입력해주세요 : ");
		int no = SCANNER.nextInt();
		Student updateStudent = new Student(no);
		System.out.print("정보를 수정할 학년을 입력해주세요 : ");
		updateStudent.setGrade(SCANNER.nextInt());
		System.out.print("정보를 수정할 반을 입력해주세요 : ");
		updateStudent.setClassroom(SCANNER.nextInt());
		System.out.print("정보를 수정할 전화번호를 입력해주세요 : ");
		updateStudent.setPhoneNum(SCANNER.next());
		SCANNER.nextLine();
		System.out.print("정보를 수정할 주소를 입력해주세요 : ");
		updateStudent.setAddress(SCANNER.nextLine());
		return updateStudent;
		
	}
}
