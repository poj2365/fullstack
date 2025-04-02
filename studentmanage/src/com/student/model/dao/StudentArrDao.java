package com.student.model.dao;

import com.student.model.vo.Student;

//학생을 저장관리하는 역할
public class StudentArrDao { // 3/13
	private static StudentArrDao dao;
//	private Student s, s1, s2;
	private Student[] s = new Student[3];
	private Student[] students = new Student[3];

	private StudentArrDao() {

	}

	public static StudentArrDao StudentArrDao() {
		if (dao == null) {
			dao = new StudentArrDao();
		}
		return dao;
	}

	public boolean saveStudent(Student input) {
		Student[] chkStu = searchStudent();
		for (int i = 0; i < chkStu.length; i++) {
			if (chkStu[i].getStudentName().equals(input.getStudentName())
					&& chkStu[i].getPhoneNum().equals(input.getPhoneNum())) {
				System.out.println("중복 학생이 존재합니다.");
				return false;
			}

		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = input;
				return true;
			}
		}
		return false;
	}

	public Student[] searchStudent() {

		// 버전1
//		String result = "";
//		for (Student s : students) {
//			if (s != null) {
//				result+= s.infoStudent()+"\n";
//			}
//		}
//		return result;
		// 만약 반환값이 배열이라면
		int count = 0;
		for (Student s : students) {
			if (s != null) {
				count++;
			}
		}
		Student[] resultStudent = new Student[count];
		int index = 0;
		for (Student s : students) {
			if (s != null) {
				resultStudent[count++] = s;
			}
		}
		return resultStudent;
	}

	public String searchStudentByNo(int studentNo) {
		String result = "";
		for (Student s : students) {
			if (s != null && s.getStudentNo() == studentNo) {
//				result += s.infoStudent()+"\n";
//				break;
				return s.infoStudent();
			}
		}
		return result;
	}

	public Student searchStudentByNoStudent(int studentNo) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && s[i].getStudentNo() == studentNo) {
				return s[i];
			}
		}
		return null;
	}

	public String searchStudentByGrade(int studentGrade) {
		int cnt = 0;
		String students = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && s[i].getGrade() == studentGrade) {
				students += s[i].infoStudent() + "\n";
			}
			if (s[i] == null) {
				cnt++;
			}
		}
		if (cnt == s.length) {
			students = "조회된 결과가 없습니다.";
		}
		return students;
	}

	public String searchStudentByName(String studentName) {
		int cnt = 0;
		String students = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && s[i].getStudentName().equals(studentName)) {
				students += s[i].infoStudent() + "\n";
			}
			if (s[i] == null) {
				cnt++;
			}
		}
		if (cnt == s.length) {
			students = "조회된 결과가 없습니다.";
		}
		return students;
	}

	public String updateStudent(Student studentInfo) {
		String result = "";
		for (Student s : students) {
			if (s != null && s.getStudentNo() == studentInfo.getStudentNo()) {
				s.setGrade(studentInfo.getGrade());
				s.setClassroom(studentInfo.getClassroom());
				s.setPhoneNum(studentInfo.getPhoneNum());
				s.setAddress(studentInfo.getAddress());
				result = "회원 수정 성공";
				return result;
			}
		}
		result = "회원 수정 실패";
		return result;
	}

	public String deleteStudent(Student resultNo) {
		int cnt = 0;
		String msg = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null && resultNo.getStudentNo() == s[i].getStudentNo()) {
				s[i] = null;
				msg = "삭제가 완료되었습니다.";
				return msg;
			}
			if (s[i] == null) {
				cnt++;
			}
		}
		if (cnt == s.length) {
			msg = "조회된 결과가 없습니다.";
		}
		return msg;

	}

	private void changeData(Student ori, Student update) {
		if (update.getGrade() != 0) {
			ori.setGrade(update.getGrade());
		}
		ori.setClassroom(update.getClassroom());
		ori.setPhoneNum(update.getPhoneNum());
		ori.setAddress(update.getAddress());
	}

}
