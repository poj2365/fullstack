package com.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShareDataServlet
 */
@WebServlet("/sharedata.do")
public class ShareDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShareDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//데이터 저장객체 활용하기
		//request -> 1회용 요청에 대한 처리가 끝나면 삭제
		request.setAttribute("request","requestData");
		//HttpSession -> 삭제할때까지 유지하는 데이터 / invalidate()메소드
		HttpSession session=request.getSession();
		session.setAttribute("session","sessionData");
		
		//ServletContext
		ServletContext context=request.getServletContext();
		context.setAttribute("context", "contextData");
		
		RequestDispatcher rd=request.getRequestDispatcher("/sharedatacheck.do");
		rd.forward(request, response);
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
