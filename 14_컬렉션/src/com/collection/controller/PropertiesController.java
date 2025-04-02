package com.collection.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesController {
	public static void main(String[] args) {
		//Properties클래스 활용하기
		//key:value형식으로 데이터를 관리하는 클래스
		//특정파일과 연동해서 데이터를 관리할 수 있음.
		//프로젝트 환경설정내용, 사용정보 등을 관리할때 사용
		
		//Properties클래스를 생성
		//클래스가 제공하는 메소드를 이용해서 활용
		Properties props=new Properties();
		//데이터 저장하기 -> key:value형식으로 저장
		//put()메소드를이용 -> Object값
		props.put("manager","유병승");
		//setProperty메소드이용 -> String 값
		props.setProperty("email", "teacherdev09@gmail.com");
		
		//데이터 가져오기
		//get() -> Object값
		Object o=props.get("manager");
		System.out.println(o);
		//getProperty() -> String 값 
		String email=props.getProperty("email");
		System.out.println(email);
		
		
		//파일에 저장하기
		//store(FileWriter,comment)메소드 이용
		try(FileWriter fw=new FileWriter("test.properties")){
			props.store(fw, "mytest");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//properties파일 불러오기
		//load(FileReader) => Properties객체를 반환
		try(FileReader fr=new FileReader("test.properties")){
			Properties prop2=new Properties();
			System.out.println(prop2);
			prop2.load(fr);
			System.out.println(prop2);
			String manager=prop2.getProperty("manager");
			System.out.println(manager);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr
				=new FileReader("mysetting.properties")){
			props.load(fr);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(props);
		
		//xml파일로 저장하기
		//storeToXml()메소드를 이용
//		try(FileOutputStream fw=new FileOutputStream("test.xml")){
//			props.storeToXML(fw, null);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		Properties xmlProps=new Properties();
		try(FileInputStream fis=new FileInputStream("test.xml")){
			xmlProps.loadFromXML(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(xmlProps);
	}
}




