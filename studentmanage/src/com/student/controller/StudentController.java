package com.student.controller;

import com.student.model.dao.StudentArrDao;
import com.student.model.dao.StudentDao;
import com.student.model.dao.StudentDaoImpl;
import com.student.model.vo.Student;
import com.student.run.Main;
import com.student.view.MainView;
import static com.student.view.MainView.*;
//import static com.student.model.dao.StudentDao.studentDao;
//import static com.student.model.dao.StudentArrDao.StudentArrDao;

import java.util.List;

// 프로그램에서 서비스를 진행시키는 역할
public class StudentController {// 3/13

//	private StudentDao dao = new StudentDao();
//	private MainView view = new MainView();
	// StackOverFlowError Controller -> MainView 호출 -> Mainview 멤버 변수로 선언되어 있어서 Controller 호출 -> 반복  
	private static StudentController controller;
	private static StudentDao studentdao = new StudentDaoImpl();
	
	// 생성자의 접근제한자를 private
	private StudentController() {
		
	}
	
	public static StudentController getStudentController() {
		if(controller==null) {
			controller = new StudentController();
		}
		return controller;
	}
	
	
	public void menu() {
		mainView().mainMenu();
	}

	public void insertStudent() {
		// 1. 학생정보 -> 학생정보입력 화면 출력
		List<Student> student = mainView().insertStudentView();
		// - 입력한 정보 확인하기
		// 2. 데이터 저장소에 저장 -> StudentDao 클래스를 이용해서 데이터를 저장
		// boolean result = new StudentDao().saveStudent(student);
		boolean result = studentdao.saveStudent(student);

		// 3. 서비스 실행 결과 출력 -> 화면 메시지출력 화면
		String msg = result ? "회원 등록 성공" : "회원 등록 실패";
		mainView().printMessage(msg);
	}

	public void updateStudent() {// 수정
		// 내 풀이
		int studentNo = mainView().searchStudentByNo();
		Student resultNo = studentdao.searchStudentByNoStudent(studentNo); // 수정할 학생의 번호
		if(resultNo == null) {
			String msg = "조회된 결과가 없습니다";
			mainView().printStudent(msg);
			return;
		}
		Student studentInfo = mainView().updateStudent();// 수정할 내용
		String result = StudentArrDao().updateStudent(studentInfo);
		mainView().printStudent(result);
	}

	public void deleteStudent() {// 삭제
		int studentNo = mainView().searchStudentByNo();
		Student resultNo = StudentArrDao().searchStudentByNoStudent(studentNo);
		if(resultNo == null) {
			String msg = "조회된 결과가 없습니다";
			mainView().printStudent(msg);
			return;
		}
		String result = StudentArrDao().deleteStudent(resultNo);
		mainView().printStudent(result);
	}

	public void searchStudent(int choice) {
		// 1. StudentDao필드에 저장된 학생들을 가져오기
		List<Student> sd = studentdao.searchStudent();
		mainView().printStudent(sd);
	}

	public void searchStudentByNo() {
		int studentNo = mainView().searchStudentByNo();
		String result = StudentArrDao().searchStudentByNo(studentNo);
		mainView().printStudent(result);
	}

	public void searchStudentByGrade() {
		int studentGrade = mainView().searchStudentByGrade();
		String result = StudentArrDao().searchStudentByGrade(studentGrade);
		mainView().printStudent(result);
	}

	public void searchStudentByName() {
		String studentName = mainView().searchStudentByName();
		String result = StudentArrDao().searchStudentByName(studentName);
		mainView().printStudent(result);
	}
}
