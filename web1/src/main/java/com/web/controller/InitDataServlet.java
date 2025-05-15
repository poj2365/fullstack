package com.web.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitDataServlet
 */
//@WebServlet(
//		urlPatterns = { "/initdata.do" }, 
//		initParams = { 
//				@WebInitParam(name = "uploadPath", value = "/upload/test")
//		})
public class InitDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 초기값 설정 데이터 불러오기
		String upload = getInitParameter("uploadPath");
		System.out.println(upload);
		String webPath = request.getServletContext().getRealPath(upload);
		
		// 전역설정 가져오기
		String env = request.getServletContext().getInitParameter("initdata");
		System.out.println(env);
		String path = InitDataServlet.class.getResource(env).getPath();
		Properties props = new Properties();
		props.load(new FileReader(path));
		System.out.println(props);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
