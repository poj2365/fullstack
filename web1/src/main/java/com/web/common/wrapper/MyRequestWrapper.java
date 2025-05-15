package com.web.common.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequestWrapper extends HttpServletRequestWrapper{
	
	public MyRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		String oriVal = super.getParameter(name);
//		if(name.equals("password")) {
//			return encrytPw(oriVal);
//		}
		return oriVal+"bs";
	}
}
