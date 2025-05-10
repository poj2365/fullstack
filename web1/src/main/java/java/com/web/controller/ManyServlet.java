package com.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/manydata.do")
public class ManyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ManyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//데이터 가져오기 
		request.setCharacterEncoding("UTF-8");
		
		//단일값
		String name=request.getParameter("name");
		String[] names=request.getParameterValues("name");
		System.out.println(Arrays.toString(names));
		int age=Integer.parseInt(request.getParameter("age"));
		//다수 데이터를 가져오기
		//getParameterValues()메소드를 이용 -> 반환형 String[]
		String[] hobby=request.getParameterValues("hobby");
		String hobby2=request.getParameter("hobby");
		System.out.println(hobby2);
		String gender=request.getParameter("gender");
		System.out.println(name+" "+age
				+" "+Arrays.toString(hobby)+" "+gender);
		
		//다른 형태로 클라이트가 보낸 데이터 가져오기
		//1. 클라이언트가 보낸 키값들 가져오기
		// getParameterNames() 메소드를 이용 -> 반환형 Enumeration객체
		Enumeration<String> keys=request.getParameterNames();
		List<String[]> values=new ArrayList();
		while(keys.hasMoreElements()) {
			String key=keys.nextElement();
			System.out.println(key);
			String[] val=request.getParameterValues(key);
			values.add(val);
		}
		values.forEach(v->System.out.println(Arrays.toString(v)));
		
		
		//클라이트가 전송한 데이터를 Map으로 가져오기
		//getParameterMap()메소드 이용 -> 반환형 Map<String,String[]>
		Map<String,String[]> param=request.getParameterMap();
		Set<String> paramKeys=param.keySet();
		Iterator<String> itKey=paramKeys.iterator();
		while(itKey.hasNext()) {
			String k=itKey.next();
			System.out.println(k+" : "+Arrays.toString(param.get(k)));
		}
		
		
		
		
		
		
		
		
		
		
	}

}





