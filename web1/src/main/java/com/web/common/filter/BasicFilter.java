package com.web.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.web.common.wrapper.MyRequestWrapper;

public class BasicFilter implements Filter{
	
	private String encoding;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.encoding = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("필터 실행!");
		// 인코딩 설정하기
		request.setCharacterEncoding(this.encoding);
		response.setCharacterEncoding(this.encoding);
		
		String data = request.getParameter("data");
		// FilterChain객체의 doFilter()메소드를 호출해야 다음 로직으로 진행됨
		if(data==null) {
			MyRequestWrapper myrequest = new MyRequestWrapper((HttpServletRequest)request);
			chain.doFilter(myrequest, response);
		}
		// 응답 메세지 작성
//		response.setContentType("text/html; charset=utf-8");
//		response.getWriter().append("<h3>잘못된 접근입니다.</h3>");
	}

}
