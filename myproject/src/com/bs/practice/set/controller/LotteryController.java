package com.bs.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.bs.practice.set.model.compare.SortedLottery;
import com.bs.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public void mainMenu() {
		
	}
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
			boolean result = lottery.remove(l);
			if(result && win!=null) {
				win.remove(l);
			}
			return result;
	}
	
	public HashSet winObject() {
		ArrayList al = new ArrayList(lottery);
		for(int i=0;i<(al.size()>=4?4:al.size());i++) {
			int random = (int)(Math.random()*al.size());
			win.add(al.get(i));
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet<Lottery> sortedWinObject = new TreeSet(new SortedLottery());
		sortedWinObject.addAll(winObject());
		sortedWinObject.forEach(System.out::println);
		return sortedWinObject;
	}
	
	public boolean searchWinner(Lottery l) {
		return lottery.contains(l);
	}
	

}
