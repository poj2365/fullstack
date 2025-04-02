package com.bs.pratice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		String result = "";
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
		return result;
		
	}
	
	public String firstCap(String input) {
		String result = input.substring(0);
		StringBuffer sb = new StringBuffer(input);
		result +=sb.deleteCharAt(0);
		return result;
		
	}
	
	public String findChar(String input, char one) {
		int cnt = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==one) {
				cnt++;
			}
		}
		return String.valueOf(cnt);
	}
}
