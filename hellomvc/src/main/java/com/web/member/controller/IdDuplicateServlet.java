package com.web.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.common.AESEncryptor;
import com.web.member.model.service.MemberService;
import com.web.model.dto.Member;

/**
 * Servlet implementation class IdDuplicateServlet
 */
@WebServlet("/member/idduplicate.do")
public class IdDuplicateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdDuplicateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 클라이언트가 보낸 아이디값 가져오기
		String id = request.getParameter("userId");
		// 2. DB에 아이디 일치하는 회원 확인
		Member m = MemberService.memberService().idDuplicate(id);
//		System.out.println(m.getAddress());
//		try {
//			String address = AESEncryptor.decryptData(m.getAddress());
//			System.out.println(address);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		// 3. 결과를 저장
		request.setAttribute("result", m==null);
		
		// 4. 출력 페이지 설정
		request.getRequestDispatcher("/WEB-INF/views/member/idDuplicate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
