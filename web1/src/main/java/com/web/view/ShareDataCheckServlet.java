package com.web.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShareDataCheckServlet
 */
@WebServlet("/sharedatacheck.do")
public class ShareDataCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShareDataCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//저장된 데이터 가져오기
		String requestData=(String)request.getAttribute("request");
		HttpSession session=request.getSession();
		String sessionData=(String)session.getAttribute("session");
		ServletContext context=request.getServletContext();
		String contextData=(String)context.getAttribute("context");
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.write("<h3>requestData : "+requestData+"</h3>");
		out.write("<h3>sessionData : "+sessionData+"</h3>");
		out.write("<h3>contextData : "+contextData+"</h3>");
		
		out.write("<button onclick=\"location.replace('/basicweb/sharedatacheck.do');\">재요청하기</button>");
		out.write("<button onclick=\"location.replace('/basicweb/sessiondel.do');\">세션삭제</button>");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
