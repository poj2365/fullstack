package com.web.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseview")
public class ResponseViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ResponseViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("responseview실행");
		//setAttribute()로 저장된 데이터 가져오기
		//getAttribute()메소드 이용
		//request.getAttribute("key") -> value(Object)
		String email=(String)request.getAttribute("email");
		List<String> names=(List<String>)request.getAttribute("names");
			
		
		 response.setContentType("text/html;charset=utf-8");
		 PrintWriter out=response.getWriter();
		 out.append("<h2>responseview가 응답함</h2>");
		 out.append("<h3>email : "+email+"</h3>");
		 out.append("<ul>");
		 for(String n:names) {
			 out.append("<li>"+n+"</li>");
		 }
		 out.append("</ul>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
