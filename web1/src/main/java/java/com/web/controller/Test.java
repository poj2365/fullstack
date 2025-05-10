package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException{
		System.out.println("우와 나의 서블릿이 동작했어");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>우와 나의 서블릿이 동작했어</h1>");
	}
	
	
	
}
