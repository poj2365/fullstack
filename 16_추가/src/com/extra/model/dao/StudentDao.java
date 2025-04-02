package com.extra.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.extra.common.Gender;
import com.extra.model.vo.Student;

public class StudentDao {
	private static List<Student> students = new ArrayList<>();
	
	static {
		String[] address= {
				"경기도 시흥시", "서울특별시", "강원도 강릉시", "제주특별자치도","경기도 군포시","경기도 안양시","대구광역시"
		};
		for(int i=0;i<100;i++) {
			students.add(Student.builder()
					.name("test"+i)
					.age((int)(Math.random()*50)+10)
					.gender(i%2==0?Gender.M:Gender.F)
					.address(address[(int)(Math.random()*address.length)])
					.height(Math.random()*40+150)
					.build());
			
		}
	}
	

	public static List<Student> getStudents() {
		return StudentDao.students;
	}
}
