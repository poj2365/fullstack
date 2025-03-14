package com.obj.controller;

import com.obj.model.vo.Developer;

public class DeveloperMain {

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.setName("김개발");
		dev.setYear(10);
		dev.setLang("java");
		dev.setSalary(1000);
		
		System.out.println(dev.getName() + " "+
						dev.getYear()+" "+
						dev.getLang()+" "+
						dev.getSalary());
		
		System.out.println("연봉 : "+dev.getSalary());
		dev.setSalary(10);
		System.out.println("연봉 : "+dev.getSalary());
		dev.setLang("파이썬");
		System.out.println("주언어 : "+dev.getLang());
		
	}

}
