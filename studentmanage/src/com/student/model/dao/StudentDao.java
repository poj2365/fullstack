package com.student.model.dao;

import java.util.List;

import com.student.model.vo.Student;

public interface StudentDao{
	boolean saveStudent(List<Student> student);
	List<Student> searchStudent();
	String searchStudentByNo(int studentNo);
	Student searchStudentByNoStudent(int studentNo);
	String searchStudentByGrade(int studentGrade);
	String searchStudentByName(String studentName);
	String updateStudent(Student studentInfo);
	String deleteStudent(Student resultNo);
}
