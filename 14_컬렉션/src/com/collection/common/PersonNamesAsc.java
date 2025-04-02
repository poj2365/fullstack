package com.collection.common;

import java.util.Comparator;

import com.collection.model.vo.Person;
public class PersonNamesAsc implements Comparator {

	@Override
	public int compare(Object o, Object o1) {
		Person prev = (Person) o;
		Person next = (Person) o1;
		return prev.getName().compareTo(next.getName());
		// 오름차순
	}
}
