package com.generic.controller;

import java.sql.Date;

import com.generic.model.vo.GenericTest;
import com.generic.model.vo.GenericTest2;
import com.generic.model.vo.Person;
import com.generic.model.vo.Student;

public class GenericController {
	public static void main(String[] args) {
		// 제네릭에 대해 알아보자
		// 자바에서 타입을 추상화할 수 있는 기술
		// 코드를 작성하는 시점(컴파일)에 타입을 결정
		// 컴파일 시점에 특정 타입에 대한 에러를 확인할 수 있게 해줌
		// 클래스를 설계할 시점에서 타입을 정하지 않고특정 기호로 표시
		// 설계할 클래스를 생성할때 타입을 지정해서 사용할 수 있게 한다.
		// 특정 기호 : 타입(T), 객체(E), 반환형(R), 키(K), 값(V)
		// 선언하기
		// 클래스 선언부 <특정 기호>
		// public class 클래스명<T> {}
		// public interface 인터페이스명<T> {}
		// 타입을 지정하지 않으면 Object로 설정됨.
		
		// Collection, List, Set, Map
		// ArrayList, LinkedList, HashSet, HashMap
		// Functional 인터페이스들..
		
		GenericTest gt = new GenericTest();
		gt.setData("문자열");
		System.out.println(gt.getData());
//		gt.setData(200);
		// 제네릭으로 선언된 클래스를 이용(객채화)할때 설정해야한다.
		GenericTest<Integer> gt2= new GenericTest<Integer>();
		gt2.setDydata(1000);
		System.out.println(gt2.getDydata());
		GenericTest<Date> gt3 = new GenericTest<>();
		gt2.setDydata(1000);
		
		GenericTest2<String[],Integer,String> gt22 = new GenericTest2<>();
		gt22.setData(new String []{"1","가","A"});
		gt22.setCount(123);
		
		GenericTest<Person> gt4 = new GenericTest<>();
		gt4.setDydata(new Person());
		gt4.setDydata(new Student());
		
	}
}
