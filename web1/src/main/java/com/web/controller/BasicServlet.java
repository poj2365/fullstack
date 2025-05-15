package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿 만들기
//1. HttpServlet클래스를 상속받음
//2. HttpServlet클래스의 메소드를 재정의
//  - HTTP로 요청한 내용을 처리하는 메소드
//   1) doGet() : GET방식으로 보낸 요청을 처리하는 메소드
//   2) doPost() : POST방식으로 보낸 요청을 처리하는 메소드

// 서블릿 등록하기
// 방법
// 2가지 : web.xml에 등록 / 어노테이션을 이용하여 등록
// 등록된 서블릿은 url주소와 연결을 하기

public class BasicServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		//get방식으로 요청 내용을 처리하는 메소드
		System.out.println("GET방식으로 요청!");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		
		System.out.println("POST방식으로 요청");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 클라이언트의 요청을 받았을 때 실행되는 메소드
		// 요청한 메소드에 따라 doGet / doPost를 호출
		System.out.println("서비스 메소드 호출");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		// 서블릿을 heap 영역에서 삭제할 때 실행
		System.out.println("서블릿 삭제");
		super.destroy();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		// 서블릿(객체) 생성시 호출되는 메소드
		System.out.println("서블릿 객체 생성");
		super.init(config);
	}
	
	
}






