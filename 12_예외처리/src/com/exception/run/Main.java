package com.exception.run;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.exception.common.exception.ServerException;
import com.exception.controller.ExceptionController;

public class Main {
	public static void main(String[] args) {
//		new ExceptionController().uncheckedException();
		try {
			new ExceptionController().throwExceptionTest("문");
			new ExceptionController().throwExceptionTest(10);
			new ExceptionController().throwExceptionTest(180.0);
		}catch(ServerException e) {
			System.out.println(e.getTriggerDate());
		}
		
		try {
			new ExceptionController().checkedExceptionTest();
		} catch (FileNotFoundException | EOFException e) {
			e.printStackTrace();
		}
		
	}
}
