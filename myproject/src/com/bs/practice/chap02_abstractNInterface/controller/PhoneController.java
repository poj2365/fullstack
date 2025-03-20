package com.bs.practice.chap02_abstractNInterface.controller;

import com.bs.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.bs.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.bs.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	// 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
	// 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
	// for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의
	// 반환 값을 String배열에 담아 반환
	public String[] method() {
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
//		phone[0].
		
		String[] result = new String[2];
//		for() {
//			
//		}
//		
		return result;
				
		
	}
}
