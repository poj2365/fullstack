package com.student.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.student.model.vo.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean saveStudent(List<Student> student) {
		List<Student> chkStu = searchStudent();
		if (chkStu != null) {
			for (int i = 0; i < chkStu.size(); i++) {
				if (chkStu.get(i).getStudentName().equals(student.get(i).getStudentName())
						&& chkStu.get(i).getPhoneNum().equals(student.get(i).getPhoneNum())) {
					System.out.println("중복 학생이 존재합니다.");
					return false;
				}
			}
		}
		try (FileOutputStream fos = new FileOutputStream("StudentManage.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(student);
			return true;
		}catch(IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> searchStudent() {
		try (FileInputStream fis = new FileInputStream("StudentManage.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			List<Student> s = (List<Student>) ois.readObject();
//			System.out.println(s.toString());
			System.out.println(Arrays.toString(s.toArray()));
			return s;
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String searchStudentByNo(int studentNo) {
		return null;
	}

	@Override
	public Student searchStudentByNoStudent(int studentNo) {
		
		
		return null;
	}

	@Override
	public String searchStudentByGrade(int studentGrade) {
		return null;
	}

	@Override
	public String searchStudentByName(String studentName) {
		return null;
	}

	@Override
	public String updateStudent(Student studentInfo) {
		return null;
	}

	@Override
	public String deleteStudent(Student resultNo) {
		return null;
	}



}
