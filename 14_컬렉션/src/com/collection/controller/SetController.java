package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.collection.model.vo.Animal;

public class SetController {
	public static void main(String[] args) {
		//Set인터페이스 활용하기
		//중복값을 저장하지 않는 자료형 
		//    -> equals, hashCode가 재정의 되어있어야함
		//순서가 없음, 데이터를 지칭하는 값이 없음(Iterator를 이용)
		//HashSet, TreeSet, LinkedHashSet
		Set set;//=new Set();
		set=new HashSet();
		HashSet hset=new HashSet();
		
		//데이터 관리하기
		//저장하기
		//add()메소드 이용
		hset.add("유병승");
		System.out.println(hset);
		//중복값은 저장하지 않음
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		hset.add("장명수");
		System.out.println(hset);
		
		hset.add(new Animal("김춘식",4,5.4));
		hset.add(new Animal("김춘식",4,5.4));
		hset.add(new Animal("김춘식",4,5.4));
		
		System.out.println(hset);
		
		//저장된 정보를 가져오기
		// 전체 가져와서 찾아야 함
		//1. Iterator인터페이스를 이용하기
		Iterator it=hset.iterator();
		String name="";
		while(it.hasNext()) {
			Object o=it.next();
			if(o instanceof String && o.equals("유병승")) {
				name=(String)o;
				break;
			}
		}
		System.out.println(name);
		//2. forEach문을 이용하는 방법
		for(Object o : hset) {
			if(o instanceof String && o.equals("장명수")) {
				name=(String)o;
				break;
			}
		}
		System.out.println(name);
		//3. forEach메소드 이용하기
		Animal a=null;
		hset.forEach(o->{
			if(o instanceof Animal){
				System.out.println(o);
			}
		});
		
		//Set의 길이확인
		//size()
		hset.add(new Animal("덕만이",7,5.2));
		System.out.println(hset.size());
		
		//데이터 삭제하기
		//remove(Object)
		hset.remove("유병승");
		System.out.println(hset);
		hset.remove(new Animal("덕만이",7,5.2));
		System.out.println(hset);
		
		if(hset.contains("장명수")) {
			System.out.println("명수야 놀자! 대머리 깍아라!");
		}
		
		//hset.clear();
		//로또번호 만들기
		// 1 ~ 45번호를 6자리로 만들기
		
		HashSet lotto=new HashSet();
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto);
		
		List lottoList=new ArrayList(lotto);
		lottoList.sort((o,o1)->(Integer)o-(Integer)o1);
		System.out.println(lottoList);
		
		List list=List.of(1,2,3,1,2,3,1,2,3,1,2,3,4,4,4,4,5,5,5,5);
		
		list=new ArrayList(new HashSet(list));
		
		System.out.println(list);
		
		//LinkedHashSet -> 저장순서 유지함.
		LinkedHashSet lhs=new LinkedHashSet();
		HashSet testSet=new HashSet();
		for(int i=1;i<=10;i++) {
			lhs.add(i);
			testSet.add(i);
		}
		System.out.println(lhs);
		System.out.println(testSet);
		for(int i=0;i<10;i++) {
			int random=(int)(Math.random()*100)+1;
			lhs.add(random);
			testSet.add(random);
		}
		System.out.println(lhs);
		System.out.println(testSet);
		
		System.out.println("linkedHashSet");
		for(Object o : lhs) {
			System.out.print(o+" ");
		}
		System.out.println();
		System.out.println("hashSet");
		for(Object o : testSet) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		//TreeSet
		//Tree구조
		TreeSet ts=new TreeSet();
		ts.add(new Animal("덕만이",7,5.2));
		ts.add(new Animal("김춘식",4,5.5));
		ts.add(new Animal("뽀삐",2,3.2));
		ts.add(new Animal("야옹이",1,2.1));
		ts.add(new Animal("야옹이",1,2.1));
		ts.add(new Animal("야옹이",1,2.1));
		ts.add(new Animal("야옹이",1,2.1));
		ts.add(new Animal("야옹이",1,2.1));
		
		for(Object o : ts) {
			System.out.println(o);
		}
		System.out.println("descending!!");
		Iterator it2=ts.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}
}




