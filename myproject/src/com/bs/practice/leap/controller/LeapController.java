package com.bs.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		if((year % 4 ==0 && year % 100 !=0 )|| (year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public long leapDate(Calendar c) {
		Calendar cal;
		cal = Calendar.getInstance();
		int result = 0;
		for(int i=1;i<cal.get(Calendar.YEAR);i++) {
			if(isLeapYear(i)) {
				result += 366;
			}else {
				result += 365;
			}
		}
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int j=0;j<cal.get(Calendar.MONTH)+1;j++) {
			result += month[j];
		}
		return result ;
	}
}
