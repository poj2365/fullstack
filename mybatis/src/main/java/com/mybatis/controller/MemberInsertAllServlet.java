package com.mybatis.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.dto.Member;
import com.mybatis.model.service.MemberService;

/**
 * Servlet implementation class MemberInsertAllServlet
 */
@WebServlet("/insertmemberall.do")
public class MemberInsertAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId= request.getParameter("userId");
		String password= request.getParameter("password");
		String userName= request.getParameter("userName");
		int age = Integer.parseInt(request.getParameter("age"));
		String email= request.getParameter("email");
		String address= request.getParameter("address");
		String phone= request.getParameter("phone");
		String hobby= String.join(",",request.getParameterValues("hobby"));
		String gender = request.getParameter("gender");
		
		Member m = Member.builder()
				.userId(userId)
				.password(password)
				.age(age)
				.address(address)
				.userName(userName)
				.phone(phone)
				.email(email)
				.hobby(hobby)
				.gender(gender)
				.build();
		
		Map<String, Object> param = new HashMap<>();
		param.put("userId", userId);
		param.put("password", password);
		param.put("age", age);
		param.put("userName", userName);
		param.put("phone", phone);
		param.put("email", email);
		param.put("address", address);
		param.put("hobby", hobby);
		param.put("gender", gender);
		
		Map<String, String[]> param2 = request.getParameterMap();
		
		int result = new MemberService().insertMemberAll(param);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<script>");
		out.print("alert('"+(result>0?"저장성공":"저장실패")+"')");
		out.print("location.replace('"+request.getContextPath()+"')");
		out.print("</script>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
