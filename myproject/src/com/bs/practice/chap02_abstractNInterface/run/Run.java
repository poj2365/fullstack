package com.bs.practice.chap02_abstractNInterface.run;

import com.bs.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		String[] result = new PhoneController().method();
		
        for (String s : result) {
            System.out.println(s);
        }
	}
}
