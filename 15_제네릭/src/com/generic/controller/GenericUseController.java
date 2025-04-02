package com.generic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.generic.model.vo.Fruit;
import com.generic.model.vo.Snack;
import com.generic.model.vo.Student;

public class GenericUseController {
	public static void main(String[] args) {
		//Collection, Map, Iterator객체 제네릭 선언하기
		ArrayList<String> list=new ArrayList<>();
		list.add("유병승");
//		list.add(19);
//		list.add(new Person());
		list.add("박세웅");
		list.add("황민익");
		list.add("임희석");
		list.add("최준범");
		
		for(String name:list) {
			System.out.println(name+" : "+name.length());
		}
		
		ArrayList<Student> students=new ArrayList();
		students.add(new Student("오상진",27,'남',5,3));
		students.add(new Student("장명수",27,'남',5,7));
		students.add(new Student("윤우식",27,'남',5,5));
		students.add(new Student("이예찬",32,'남',3,1));
		students.add(new Student("김희범",27,'남',5,2));
		
		for(Student s : students) {
			System.out.println(s.getName()+" "+s.getAge());
		}
		
		students.forEach(s->{
			System.out.println(s.getName());
		});
		
		//Iterator이용하기
		Iterator<Student> it=students.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.getName()+" "+s.getGrade());
		}
		
		Set<Student> studentSet=new HashSet<>(students);
		
		for(Student s : studentSet) {
			
		}
		Iterator<Student> it2=studentSet.iterator();
		while(it2.hasNext()) {
			Student s=it2.next();
			System.out.println(s.getName());
		}
		
		HashMap<String,Snack> snacks=new HashMap<>();
	    snacks.put("구운감자", new Snack("구운감자",1200,"스틱","감자"));
	    snacks.put("포테포칩", new Snack("포테포칩",2300,"칩","어니언"));
	    snacks.put("새우깡", new Snack("새우깡",1400,"깡","새우"));
	    snacks.put("홈런볼", new Snack("홈런볼",2500,"슈","초코"));
	    snacks.put("고래밥", new Snack("고래밥",1000,"밥","바베큐"));
	    
	    Set<String> keys=snacks.keySet();
	    Iterator<String> it3=keys.iterator();
	    while(it3.hasNext()) {
	    	String key=it3.next();
	    	Snack s=snacks.get(key);
	    	System.out.println(key+" : "+s.getPrice());
	    }
		
	    Set<Map.Entry<String, Snack>> entry=snacks.entrySet();
	    Iterator<Map.Entry<String,Snack>> entrySnack=entry.iterator();
	    while(entrySnack.hasNext()) {
	    	Map.Entry<String,Snack> map=entrySnack.next();
	    	System.out.println(map.getKey()
	    			+" "+map.getValue().getPrice()
	    			+" "+map.getValue().getFlavor());
	    }
	    
	    for(Map.Entry<String,Snack> e : snacks.entrySet()) {
	    	System.out.println(e.getKey()
	    			+" "+e.getValue().getName()
	    			+" "+e.getValue().getPrice());
	    }
	    snacks.forEach((k,v)->{
	    	System.out.println(k);
	    	System.out.println(v.getName()+" "+v.getPrice());
	    });
	    
//	    students.sort((s,s1)->s.getName().compareTo(s1.getName()));
	    
	    students.forEach(System.out::println);
	    	
//		testGeneric(10);
		testGeneric("String");
		GenericUseController.<Double>testGeneric("test");
		
		 //과일을 저장하는 클래스를 생성
	    //이름, 원산지, 수량, 가격
	    //귤, 제주도, 10, 15000,
	    //사과, 예산, 5, 25000,
	    //포도, 영동, 10, 35000,
	    //배, 나주, 10, 50000,
	    //Map방식으로 저장, key값 1~4로 저장        
	    //1. 전체 데이터 조회
	    //2. 가격이 20000원 이상인 과일만 key와 value출력
	    //3. 이름이 한글자인 과일의 key,value를 출력
	    //4. 포도의 가격을 40000원으로 수정하고, 전체데이터 출력
	    //5. 배를 찾아 삭제하기
		HashMap<String, Fruit> fruits = new HashMap();
		fruits.put("1", new Fruit("귤","제주도",10,15000));
		fruits.put("2", new Fruit("사과","예산",5,25000));
		fruits.put("3", new Fruit("포도","영동",10,35000));
		fruits.put("4", new Fruit("배","나주",10,50000));
		//1. 전체 데이터 조회
		System.out.println("1. 전체 데이터 조회");
		Set<Map.Entry<String, Fruit>> fruitEntry = fruits.entrySet();
		Iterator<Map.Entry<String, Fruit>> fruitIt = fruitEntry.iterator();
		while(fruitIt.hasNext()) {
			Map.Entry<String, Fruit> str = fruitIt.next();
			System.out.println(str.getKey() + " : "+str.getValue());
		}
		//2. 가격이 20000원 이상인 과일만 key와 value출력
		System.out.println("2. 가격이 20000원 이상인 과일만 key와 value출력");
		for(Map.Entry<String, Fruit> e : fruits.entrySet()) {
			if(e.getValue().getPrice()>=20000) {
				System.out.println(e.getKey()+" : "+e.getValue());
			}
		}
		//3. 이름이 한글자인 과일의 key,value를 출력
		System.out.println("3. 이름이 한글자인 과일의 key,value를 출력");
		for(Map.Entry<String, Fruit> e : fruits.entrySet()) {
			if(e.getValue().getName().length()==1) {
				System.out.println(e.getKey()+" : "+e.getValue());
			}
		}
		//4. 포도의 가격을 40000원으로 수정하고, 전체데이터 출력
		System.out.println("4. 포도의 가격을 40000원으로 수정하고, 전체데이터 출력");
		for(Map.Entry<String, Fruit> e : fruits.entrySet()) {
			if(e.getValue().getName().equals("포도")) {
				e.getValue().setPrice(40000);
				System.out.println(e.getKey()+" : "+e.getValue());
			}
		}
		//5. 배를 찾아 삭제하기
		System.out.println("5. 배를 찾아 삭제하기");
		for(Map.Entry<String, Fruit> e : fruits.entrySet()) {
			if(e.getValue().getName().equals("배")) {
				fruits.remove(e.getKey());
				System.out.println(e.getKey()+" : "+e.getValue());
			}
		}
		System.out.println(fruits);
	}
	
	public static <T> T testGeneric(String msg){
//		System.out.println(test);	
		T test=null;
		
		return test;
	}
	
}
