package com.bs.practice.charCheck.cotroller;

import com.bs.practice.charCheck.exception.CharCheckException;

public class CharCheckController{
	public CharCheckController() {
	}
	
	public int countAlpha(String s) throws CharCheckException{
		if (s.contains(" ")) {
		   throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			if(('A'<= s.charAt(i) && s.charAt(i) <= 'Z') || ('a'<= s.charAt(i) && s.charAt(i) <= 'z')) {
				cnt++;
			}
		}
		return cnt;
	}
	
}
