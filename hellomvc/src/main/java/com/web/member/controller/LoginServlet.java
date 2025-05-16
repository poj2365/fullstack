package com.web.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.member.model.service.MemberService;
import com.web.model.dto.Member;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "loginServlet", urlPatterns ={"/member/login.do"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트가 보낸 정보 가져오기
		String id = request.getParameter("userId");
		String password = request.getParameter("password");
		String saveId = request.getParameter("saveId");
		System.out.println(saveId);
		if(saveId!=null) {
			Cookie c = new Cookie("saveId", id);
			c.setMaxAge(60*60*24*7);
			c.setPath("/");
			response.addCookie(c);
		}else {
			Cookie c = new Cookie("saveId", id);
			c.setMaxAge(0);
			c.setPath("/");
			response.addCookie(c);
		}
		// 2. DB에 아이디, 비밀번호 일치하는 회원 확인
//		Member m = MemberService.memberService().login(id,password);
		// 3. 결과를 저장
//		HttpSession session = request.getSession();
//		session.setAttribute("result", m);

		// 강사님 풀이
		Member m = MemberService.memberService().idDuplicate(id);
		//3. 결과를 저장
		if(m!=null && m.getPassword().equals(password)) {
			//인증성공
			HttpSession session = request.getSession();
			session.setAttribute("result", m);
			// 4. 출력 페이지 설정
			response.sendRedirect(request.getContextPath());
		}else {
			request.setAttribute("msg", "아이디나 패스워드가 일치하지 않습니다.");
			request.setAttribute("loc", "/");
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
		}	


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
