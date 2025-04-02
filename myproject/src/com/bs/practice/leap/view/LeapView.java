package com.bs.practice.leap.view;

import java.util.Calendar;

import com.bs.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		LeapController lc = new LeapController();
		String result = lc.isLeapYear(2019)?"윤년":"평년";
		System.out.println("2019 년은 "+result+"입니다.");
		Calendar c;
		c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1);
		c.set(Calendar.MONTH, 1-1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("총 날짜 수 : "+lc.leapDate(c));
	}
}
