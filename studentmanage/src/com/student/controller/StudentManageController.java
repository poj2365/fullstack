package com.student.controller;

import static com.student.view.MainView.mainView;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;

public class StudentManageController {
	private final StudentDao studentDao;
	
	public StudentManageController(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void insertStudent(Student inputStudent) {
		studentDao.saveStudent(inputStudent);
	}
}
