package com.bs.practice.set.model.compare;

import java.util.Comparator;

import com.bs.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Lottery pre = (Lottery)o1;
		Lottery next = (Lottery)o2;
		if(pre.getName().equals(next.getName())) {
			return pre.getPhone().compareTo(next.getPhone());
		}
		return pre.getName().compareTo(next.getName());
	}
}
