package com.student.model.dao;

import com.student.model.vo.Student;

//학생을 저장관리하는 역할
public class StudentDao { // 3/13
	private static StudentDao dao;
	private Student s, s1, s2;

	private StudentDao() {
		
	}
	
	public static StudentDao studentDao() {
		if(dao==null) {
			dao = new StudentDao();
		}
		return dao;
	}
	
	public boolean saveStudent(Student input) {
		if (s == null) {
			this.s = input;
		} else if (s1 == null) {
			this.s1 = input;
		} else if (s2 == null) {
			this.s2 = input;
		} else {
			return false;
		}
		return true;
	}
	
	public String searchStudent() {
		String students = ""; 
		if(s != null) {
			students += s.infoStudent() + "\n";			
		}
		if(s1 !=null) {
			students += s1.infoStudent() + "\n";
		}
		if(s2 !=null) {
			students += s2.infoStudent();
		}
		return students;
	}

	public String searchStudentByNo(int studentNo) {
		if(s!=null && s.getStudentNo()==studentNo) {
			return s.infoStudent();
		}else if(s1!=null && s1.getStudentNo()==studentNo) {
			return s1.infoStudent();
		}else if(s2!=null && s2.getStudentNo()==studentNo) {
			return s2.infoStudent();
		}else {	
			String msg = "조회된 결과가 없습니다.";
			return msg;
		}		
	}
	
	public Student searchStudentByNoStudent(int studentNo) {
		if(s!=null && s.getStudentNo()==studentNo) {
			return s;
		}else if(s1!=null && s1.getStudentNo()==studentNo) {
			return s1;
		}else if(s2!=null && s2.getStudentNo()==studentNo) {
			return s2;
		}else {	
			return null;
		}		
	}

	public String searchStudentByGrade(int studentGrade) {
		String students = ""; 
		if(s!=null && s.getGrade()==studentGrade) {
			students += s.infoStudent() + "\n";		
		}
		if(s1!=null && s1.getGrade()==studentGrade) {
			students += s1.infoStudent() + "\n";		
		}
		if(s2!=null && s2.getGrade()==studentGrade) {
			students += s2.infoStudent();		
		}
		if(s==null && s1==null && s2==null){	
			students = "조회된 결과가 없습니다.";
		}
		return students;
	}

	public String searchStudentByName(String studentName) {
		String students = ""; 
		if(s!=null && s.getStudentName().equals(studentName)) {
			students += s.infoStudent() + "\n";		
		}
		if(s1!=null && s1.getStudentName().equals(studentName)) {
			students += s1.infoStudent() + "\n";		
		}
		if(s2!=null && s2.getStudentName().equals(studentName)) {
			students += s2.infoStudent();		
		}
		if(s==null && s1==null && s2==null){	
			students = "조회된 결과가 없습니다.";
		}
		return students;
	}

	public String updateStudent(int studentNo) {
		String students = ""; 
		if(s!=null && s.getStudentNo()==studentNo) {
			return s.infoStudent();
		}else if(s1!=null && s1.getStudentNo()==studentNo) {
			return s1.infoStudent();
		}else if(s2!=null && s2.getStudentNo()==studentNo) {
			return s2.infoStudent();
		}else {	
			students = "학생 데이터가 업습니다.";
			return students;
		}		
	}

	public String updateStudent(Student studentInfo, Student resultNo) {
		if(s!=null && resultNo.getStudentNo()==s.getStudentNo()) {
			s.setGrade(studentInfo.getGrade());
			s.setClassroom(studentInfo.getClassroom());
			s.setPhoneNum(studentInfo.getPhoneNum());
			s.setAddress(studentInfo.getAddress());			
			return s.infoStudent();
		}else if(s1!=null && resultNo.getStudentNo()==s1.getStudentNo()) {
			s1.setGrade(studentInfo.getGrade());
			s1.setClassroom(studentInfo.getClassroom());
			s1.setPhoneNum(studentInfo.getPhoneNum());
			s1.setAddress(studentInfo.getAddress());		
			return s1.infoStudent();
		}else if(s2!=null && resultNo.getStudentNo()==s2.getStudentNo()) {
			s2.setGrade(studentInfo.getGrade());
			s2.setClassroom(studentInfo.getClassroom());
			s2.setPhoneNum(studentInfo.getPhoneNum());
			s2.setAddress(studentInfo.getAddress());
			return s2.infoStudent();
		}else {
			String msg = "조회된 결과가 없습니다.";
			return msg;
		}

		
	}

	public String deleteStudent(Student resultNo) {
		String msg = "";
		if(s!=null && resultNo.getStudentNo()==s.getStudentNo()) {
			s = null;
			msg = "삭제가 완료되었습니다.";
			return msg;
		}else if(s1!=null && resultNo.getStudentNo()==s1.getStudentNo()) {
			s1 = null;	
			msg = "삭제가 완료되었습니다.";
			return msg;
		}else if(s2!=null && resultNo.getStudentNo()==s2.getStudentNo()) {
			s2 = null;
			msg = "삭제가 완료되었습니다.";
			return msg;
		}else {
			msg = "조회된 결과가 없습니다.";
			return msg;
		}

	}

	public boolean updateStudent2(Student student) { // 선생님 풀이
		if(s!=null && s.getStudentNo()==student.getStudentNo()) {
			changeData(s,student);
		}else if(s1!=null && s1.getStudentNo()==student.getStudentNo()) {
			changeData(s,student);
		}else if(s2!=null && s2.getStudentNo()==student.getStudentNo()) {
			changeData(s,student);
		}else {
			return false;
		}
		return true;
	}
	
	private void changeData(Student ori, Student update) {
		if(update.getGrade()!=0) {			
			ori.setGrade(update.getGrade());
		}
		ori.setClassroom(update.getClassroom());
		ori.setPhoneNum(update.getPhoneNum());
		ori.setAddress(update.getAddress());
	}

}
