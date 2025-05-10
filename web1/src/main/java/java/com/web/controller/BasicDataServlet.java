package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicDataServlet
 */
@WebServlet("/basicdata.do")
public class BasicDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasicDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HttpServletRequest 객체를 이용해서 전달된 데이터 가져오기
		// 단일값을 가져오기 -> getParameter() 메소드를 이용
		// getParameter("key(==name속성값)") -> 반환형 String
		String sampleData = request.getParameter("sample");
		System.out.println(sampleData);
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(sampleData);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 방식으로 한글 데이터를 전송하면 한글이 깨짐
		// setCharacterEncoding() 메소드를 이용
		// parameter 값을 가져올때 일치하는 key가 없으면
		// null 값을 반환함
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String data = request.getParameter("sample");
		int mydata = Integer.parseInt(request.getParameter("mydata"));
		System.out.println(data);
		System.out.println(mydata+10);

		PrintWriter pw = response.getWriter();
		pw.println(data);
		pw.println(mydata+10);
	}

}
