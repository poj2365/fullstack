package com.extra.controller;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.extra.common.Gender;
import com.extra.model.vo.Student;

public class ReflectionController {
	public static void main(String[] args) {
		//리플렉션활용하기
		//런타임시 클래스내용을 확인, 조작할 수 있는 기능
		// Class, Field, Method 클래스를 이용해서 처리
		Student s=Student.builder()
				.name("유병승")
				.age(19)
				.gender(Gender.M)
				.address("경기도 시흥시")
				.build();
		Class studentClass=s.getClass();
		String path=studentClass.getResource("/").getPath();
		System.out.println(path);
		System.out.println(studentClass.getName());
		
		//클래스에 선언된 메소드, 필드, 어노테이션
		//메소드 확인하기
		Method[] methods=studentClass.getDeclaredMethods();
		for(var method:methods) {
			String name=method.getName();
//			System.out.println(name);
//			int modifier=method.getModifiers();
//			System.out.println(modifier);
//			Class returnType=method.getReturnType();
//			System.out.println(returnType.getName());
			
			//메소드 실행하기
			//invoke(객체[,매개변수])메소드로 실행
			if(name.contains("get")) {
				try {
					Object o=method.invoke(s);
					System.out.println(o);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		try {
//			Method m=studentClass.getDeclaredMethod("setName",String.class);
//			m.invoke(s, "이제 곧 점심시간");
			//private 메소드 호출하기
			Method m=studentClass.getDeclaredMethod("testRelection");
			m.setAccessible(true);//접근제한자가 private일때 접근하기!
			m.invoke(s);
			
		}catch(NoSuchMethodException | 
				InvocationTargetException | 
				IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println(s.getName());
		
		//필드 조작하기
		Field[] fields=studentClass.getDeclaredFields();
		for(var field : fields) {
			System.out.println(field.getName());
			String name=field.getName();
			try {
				field.setAccessible(true);
				//필드값 가져오기
				System.out.println(field.get(s));
				
			}catch(IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
		// 생성자 이용하기
		try {
			Constructor cons = studentClass.getDeclaredConstructor(String.class);
			Object obj = cons.newInstance("점심 먹자");
			System.out.println(obj+" "+obj.getClass().getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		try {
			Class tempClass = Class.forName("com.extra.model.vo.Student");
			Object o = tempClass.getDeclaredConstructor(String.class).newInstance("우와 내가 직접 인스턴스 만듬");
			System.out.println(o);
			Annotation[] anno = tempClass.getAnnotations();
			for(Annotation a : anno) {
				System.out.println(a);
			}
		} catch (ClassNotFoundException 
				| InstantiationException 
				| IllegalAccessException 
				| IllegalArgumentException 
				| InvocationTargetException 
				| NoSuchMethodException 
				| SecurityException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
