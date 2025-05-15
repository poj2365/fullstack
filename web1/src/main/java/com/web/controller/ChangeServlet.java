package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangeServlet
 */
@WebServlet(name="changeServlet", urlPatterns="/changeservlet.do")
public class ChangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("changeservlet실행");
		
		//서버에서 생성한 데이터 저장하기
		//setAttribute()메소드를 이용해서 특정 값을 저장할 수 있음
		//저장하는 방식은 key:value형식
		//request.setAttribute("key",Object)
		request.setAttribute("email","teacherdev09@gamil.com");
		request.setAttribute("names", 
				List.of("김희범","오상진","황민익","박서영","한창규"));
		
		
		
		
		
		//getRequestDispatcher()메소드의 인수는
		// Servlet 매핑주소를 설정
		RequestDispatcher rd=request.getRequestDispatcher("/responseview");
		rd.forward(request, response);
		
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
