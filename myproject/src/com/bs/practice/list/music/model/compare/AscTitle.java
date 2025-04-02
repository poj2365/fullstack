package com.bs.practice.list.music.model.compare;

import java.util.Comparator;

import com.bs.practice.list.music.model.vo.Music;


public class AscTitle implements Comparator{
	public int compare(Object o1, Object o2) {
		Music pre = (Music)o1;
		Music next = (Music)o2;
		
		return next.getTitle().compareTo(pre.getTitle());
	}
}
