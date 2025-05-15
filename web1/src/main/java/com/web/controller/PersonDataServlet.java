package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.dto.Person;

@WebServlet(name = "personData", urlPatterns = "/persondata.do")
public class PersonDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name=request.getParameter("name");
//		int age=Integer.parseInt("age");
		int age=Integer.parseInt(request.getParameter("age"));
		double height=Double.parseDouble(request.getParameter("height"));
		String[] animals=request.getParameterValues("animals");
		String color=request.getParameter("color");
		String lunch=request.getParameter("lunch");
		String info=request.getParameter("info");
		
//		System.out.println(name+" "+age+" "+height
//				+" "+color+" "+Arrays.toString(animals)+" "
//				+lunch+" "+info);
		Person p = Person.builder()
					.name(name)
					.age(age)
					.height(height)
					.color(color)
					.animals(animals)
					.lunch(lunch)
					.info(info)
					.build();
		
		request.setAttribute("person", p);
		RequestDispatcher rd = request.getRequestDispatcher("/personview.do");
					
		
		//응답하기, 응답하라 내서버!
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("개인취향테스트 결과");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>사용자 입력사항</h1>");
		sb.append("<p> 이름 : "+name+"</p>");
		sb.append("<p> 나이 : "+age+"</p>");
		sb.append("<p> 키 : "+height+"</p>");
		sb.append("<p style='color:"+color+";'>좋아하는색 : "+color+"</p>");
		sb.append("<p>좋아하는 동물</p>");
		sb.append("<ul>");
		for(String animal : animals) {
			String src="";
			switch(animal) {
				case "강아지" :src="https://blog.malcang.com/wp-content/uploads/2024/03/1-1.png";break;
				case "고양이" :src="https://newsimg.hankookilbo.com/2016/04/13/201604131460701467_1.jpg"; break;
				case "햄스터" : src="https://cdn.pointe.co.kr/news/photo/202107/4159_10727_3352.png";break;
				default : src="https://img.freepik.com/premium-vector/hand-drawing-cartoon-animals-collection-sticker-set-cute-animal-drawing-animal-icon_488586-905.jpg?semt=ais_hybrid&w=740";
			}
			sb.append("<li>");
			sb.append("<img src='"+src+"' width='200' height='200'>");
			sb.append("</li>");
		}
		sb.append("</ul>");
		sb.append("<p>"+lunch+"</p>");
		sb.append("<p>"+info+"</p>");
		sb.append("</body>");
		sb.append("</html>");
		
		out.print(sb);
		
		
		
		
		
		
		
	}

}
