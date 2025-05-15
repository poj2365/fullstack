package com.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MakeCookieServlet
 */
@WebServlet("/makecookie")
public class MakeCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MakeCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿠키이용하기
		// 객체 방식으로 설정 -> key:value 방식으로 저장
		Cookie c = new Cookie("email","teacherdev09@gmail.com");
		// 클라이언트 컴퓨터에 저장되는 데이터
		// 저장공간에 제한이 있음, 유효기간을 설정
		c.setMaxAge(60*60*24);
		
		// 클라이언트에 저장
		response.addCookie(c);
		
		Cookie c2 = new Cookie("products", "1|21|32");
		c2.setMaxAge(60*60*24);
		response.addCookie(c2);
		
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
