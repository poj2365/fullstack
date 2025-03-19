package com.api.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateController {
	public static void main(String[] args) {
		// 날짜를 처리하는 클래스
		// java.util.Date;
		// java.util.Calendar;
		// java.util.GregorianCalendar;
		// java.time.LocalDate;
		// java.time.LocalTime;
		// java.time.LocalDateTime;
		
		// DB와 연동할때 사용하는 Date클래스
		// java.sql.Date
		// java.sql.Timestamp
		
		Date today = new Date();
		System.out.println(today);
		// 현재 날짜를 클래스에 저장 -> 코드를 실행하는 컴퓨터에 설정된 날짜
		// 날짜를 설정해서 클래스 생성하기
		today = new Date(1234567890000L);
		System.out.println(today);
	
		// Date 클래스를 원하는 형태의 문자열로 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년-MM월-dd일 HH:mm:ss");
		String strDate = sdf.format(today);
		System.out.println(strDate);
		
		// Calendar / GregorianCalendar
		Calendar c; // 추상 클래스
		c = Calendar.getInstance();
		System.out.println(c);
		// 년 , 월 , 일 값을 가져오기
		// get(int) -> static final -> 년 -> Calendea.YEAR 월 - Calendea.MONTH
		int year =  c.get(Calendar.YEAR);
		System.out.println(year);
		// 월을 계싼시에는 0부터 시작함
		int month =  c.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = c.get(Calendar.DATE);
		System.out.println(day);
		
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		System.out.println(hour+" "+min+" "+sec);
		
		// 원하는 날짜 세팅하기
		// set(필드, 값)
		c.set(Calendar.YEAR, 1999);
		c.set(Calendar.MONTH, 6-1);
		c.set(Calendar.DATE, 17);
		c.set(Calendar.HOUR, 3);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 12);
		
		year =  c.get(Calendar.YEAR);
		System.out.println(year);
		// 월을 계싼시에는 0부터 시작함
		month =  c.get(Calendar.MONTH)+1;
		System.out.println(month);
		day = c.get(Calendar.DATE);
		System.out.println(day);
		
		hour = c.get(Calendar.HOUR);
		min = c.get(Calendar.MINUTE);
		sec = c.get(Calendar.SECOND);
		System.out.println(hour+" "+min+" "+sec);
		
		System.out.println(sdf.format(new Date(c.getTimeInMillis())));
		
		// GregorianCalendar 클래스 이용하기
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g);
		g = new GregorianCalendar(1999,4-1,27,3,30);
		System.out.println(sdf.format(new Date(g.getTimeInMillis())));
		
		String inputDate = "1999-01-08";
		String[] date = inputDate.split("-");
		GregorianCalendar g2 = new GregorianCalendar(
				Integer.parseInt(date[0]),
				Integer.parseInt(date[1])-1,
				Integer.parseInt(date[2])
				);	
		System.out.println(sdf.format(new Date(g2.getTimeInMillis())));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf2.parse(inputDate); // date로 값을 바꿔주는 메소드
			System.out.println(d);
			System.out.println(sdf2.format(d));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		// LocalDate, LocalTime, LocalDateTime
		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		year = ldate.getYear();
		month = ldate.getMonthValue();
		System.out.println(year + " "+ month );
		day = ldate.getDayOfMonth();
		System.out.println(day);
		int week = ldate.getDayOfWeek().getValue();
		System.out.println(week);
		DayOfWeek weekObj = ldate.getDayOfWeek();
		System.out.println(weekObj);
		
		// 날짜 값 설정하기
		ldate = LocalDate.of(1994, 8, 5);
		System.out.println(ldate);
		
		// 시간 값 저장하기
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		hour = lt.getHour();
		min = lt.getSecond();
		sec = lt.getSecond();
		System.out.println(hour + " : "+min + " : "+sec);
		lt = LocalTime.of(15, 50);
		System.out.println(lt);
		
		// 날짜와 시간을 동시에 관리하는 클래스
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		ldt = LocalDateTime.of(2025,2,27,10,0);
		System.out.println(ldt);
		ldt = LocalDateTime.of(ldate, lt);
		System.out.println(ldt);
		
		
		// 날짜 관련 계산 메소드를 제공
		// 두 날짜의 일자를 계산하기
		long result = ChronoUnit.DAYS.between(ldate, LocalDate.now());
		System.out.println(ldate);
		System.out.println(result);
		// 개월 수 계싼
		result = ChronoUnit.MONTHS.between(ldate, LocalDateTime.now());
		System.out.println(result + "개월");
		
		// sql 패키지 클래스와 연동하기
		// LocalDate -> sql.Date 변환하기
		java.sql.Date sqlDate = java.sql.Date.valueOf(ldate);
		System.out.println(sqlDate);
		
		// java.util.Date -> LocalDate
		new java.sql.Date(today.getTime()).toLocalDate();
		today = java.sql.Date.valueOf(ldate);
		System.out.println(today);
		
		// java.sql.Timestamp : 날짜 시간
		Timestamp timestamp = Timestamp.valueOf(ldt);
		LocalDateTime ldt2 = timestamp.toLocalDateTime();
		System.out.println(ldt2);
		
		
		
	}
}
