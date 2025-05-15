package com.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ExtraSessionServlet
 */
@WebServlet("/extrasession")
public class ExtraSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExtraSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 발급된 세션이 있으면 그 세션을 가져오고 없으면 새로 생성해서 반환
//		HttpSession session = request.getSession();
		// getSession(boolean)
		// true(default) : 매개변수 없는 메소드와 동일
		// false : 발급된 세션이 있으면 세션을 가져오고 없으면 null 값을 반환
		
//		HttpSession session = request.getSession(false);
		HttpSession session = request.getSession(true);
		System.out.println(session);
		
		// session 객체의 유효기간을 설정
		// 초로 기간을 설정
		session.setMaxInactiveInterval(30);
		
		response.sendRedirect(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
