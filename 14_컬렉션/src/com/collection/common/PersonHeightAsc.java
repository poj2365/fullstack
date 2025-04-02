package com.collection.common;

import java.security.DrbgParameters.NextBytes;
import java.util.Comparator;

import com.collection.model.vo.Person;

public class PersonHeightAsc implements Comparator<Person>{
	
	@Override
//	public int compare(Object o, Object o1) {
//		Person prev = (Person)o;
//		Person next = (Person)o1;
//		return (int)(prev.getHeight()-next.getHeight());
	public int compare(Person p, Person p1) {
		return (int)(p.getHeight()-p1.getHeight());
	}
}
