package com.mybatis.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.dto.Member;
import com.mybatis.model.service.MemberService;

/**
 * Servlet implementation class MemberInsertParam2Servlet
 */
@WebServlet("/insertmemberparam2.do")
public class MemberInsertParam2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertParam2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId= request.getParameter("userId");
		String password= request.getParameter("password");
		Member m = Member.builder().userId(userId).password(password).build();
		
		int result = new MemberService().insertMember(m);
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
