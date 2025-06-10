package com.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {
	
	//Mybatis가 DB에 접근해서 sql을 실행하는 SqlSession 객체를 생성하기
	public static SqlSession getSession() {
		// SqlSession 객체 생성하기
		// 1. SqlSessionFactoryBuilder 클래스를 생성 -> default 생성자 이용
		//    - SqlSessionFactoryBuilder 클래스가 제공하는 build()메소드 호출
		//      -> 호출 시 mybatis-config.xml에 설정된 내용을 전달해야함. 
		//         InputStream으로 전달
		//    - build()메소드가 SqlSessionFactory 객체를 반환
		// 2. SqlSessionFactory 객체가 제공하는 openSession()메소드를 호출
		//    - openSession() 메소드가 SqlSession을 반환
		//    - openSession(boolean) -> 트랜잭션관리에 대한 설정 true(오토커밋)/false(직접커밋)
		SqlSession session = null;
		try(InputStream config = Resources.getResourceAsStream("mybatis-config.xml");){
			SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory sf = sfb.build(config);
			session=sf.openSession(false);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	
}
