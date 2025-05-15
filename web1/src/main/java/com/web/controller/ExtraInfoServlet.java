package com.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExtraInfoServlet
 */
@WebServlet("/extrainfo.do")
public class ExtraInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExtraInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 헤더 정보 확인하기
		// HttpHeader에 저장된 정보를 가져옴
		// getHeader("key")
		// 이전페이지 정보 가져오기
		String prevPage = request.getHeader("Referer");
		System.out.println(prevPage);
		String accept = request.getHeader("Accept");
		System.out.println(accept);
		String userAgent = request.getHeader("User-agent");
		System.out.println(userAgent);
		String cookie = request.getHeader("cookie");
		System.out.println(cookie);
		//request.getCookies();
		
		// 요청주소 확인하기
		String url = request.getRequestURL().toString();
		String uri = request.getRequestURI();
		System.out.println(url);
		System.out.println(uri);
		
		// contextPath 정보 가져오기
		System.out.println(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
