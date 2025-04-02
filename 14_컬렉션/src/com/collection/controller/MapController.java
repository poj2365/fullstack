package com.collection.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.collection.model.vo.Food;
import com.collection.model.vo.Fruit;
import com.collection.model.vo.Snack;

public class MapController {
	public static void main(String[] args) {
		// Map 인터페이스
		// key:value 형식으로 데이터를 저장
		// 변수명(key) = 값(value)
		// 기본타입 : key(Object : value(Object)
		// key는 일반적으로 String, Integer로 선언
		// HashMap, TreeMap, Properrties
		// Collection 인터페이스와 관계가 없음
//		Collection c;
//		List l = new ArrayList();
//		c=l;
//		Map m = new HashMap();
//		c=m;
		
		Map m = new HashMap();
		HashMap m2 = new HashMap();
		
		// Map 저장소에 값 저장하기
		// key : value 한번에 저장함
		// put(key:value) 메소드를 이용
		m.put("반장", "양지혁");
		m.put("선생", "유병승");
		System.out.println(m);
		
		m.put("돈까스", new Food("돈까스",10000,"양식",3));
		
		// map에 저장된 데이터 가져오기
		// get(key) 메소드 이용
		Object o = m.get("선생");
		System.out.println(o);
		System.out.println(m.get("반장"));
		Food f = (Food)m.get("돈까스");
		System.out.println(f);
		
		// 데이터 수 확인하기
		// size()
		System.out.println(m.size());
		
		// 데이터 삭제하기
		// remove(key);
		m.remove("선생");
		
		// key 값은 중복될 수 없다
		// 중복키를 저장하면 기존 값을 덮어쓰기함
		m.put("반장", new Food("두반장",3000,"중식",2));
		System.out.println(m);
		m.put("양식", new Food("돈까스",10000,"양식",3));
		System.out.println(m);
		
		// key가 있는지 확인하는 메소드
		// containsKey(key);
		// value가 있는지 확인하는 메소드
		// containsValue(value);
		// 반환형 boolean
		System.out.println(m.containsKey("돈까스"));
		System.out.println(m.containsKey("선생"));
		System.out.println(m.containsValue(new Food("돈까스",10000,"양식",3)));
		
		m.put("names", new ArrayList());
		((ArrayList)m.get("names")).add("김경주");
		((ArrayList)m.get("names")).add("한창규");
		((ArrayList)m.get("names")).add("오상진");
		((ArrayList)m.get("names")).add("장명수");
		
		for(Object o1 : ((ArrayList)m.get("names"))) {
			System.out.println(o1);
		}
		
		List l = new ArrayList();
		l.add(new HashMap());
		((Map)l.get(0)).put("name", "유병승");
		((Map)l.get(0)).put("age", 19);
		((Map)l.get(0)).put("height", 180.5);
		System.out.println(l);
		
		// 전체 데이터를 순회
		// key 로 value 를 가졍돈다.
		// 1. key 데이터를 전체 가져옴
		// keySet() 메소드를 이용 -> key 값을 set 방식으로 반환홤
		Set keys = m.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			String k = (String)it.next();
			System.out.println(k+" : " +m.get(k));
		}
		for(Object obj : keys) {
			System.out.println(obj +" : "+m.get(obj));
		}
//		keys.forEach(obj->System.out.println(obj +" : "+m.get(obj)));
		
		// 2. key : value 쌍을 가져옴
		// entrySet() 메소드를 이용
		Set entry = m.entrySet();
		Iterator it2 = entry.iterator();
		while(it2.hasNext()) {
			Map.Entry all = (Map.Entry)it2.next();
			Object key = all.getKey();
			Object value = all.getValue();
			System.out.println(all.getKey() + " : "+all.getValue());
		}
		
	    //Snack클래스생성
	    //이름, 가격, 종류, 맛
	    //구운감자,1200,스틱,감자 -> 구운감자
	    //포테토칩,2300,칩,어니언 -> 포테포칩
	    //홈런볼,2500,슈,초코 -> 홈런볼
	    //새우깡,1400,깡,새우 -> 새우깡
	    //고래밥,1000,밥,바베큐 -> 고래밥
		// 1. 저장된 과자를 전체 출력하기
		// 2. 저장된 과자의 이름, 가격 출력하기
		HashMap snacks = new HashMap();
		snacks.put("구운감자", new Snack("구운감자",1200,"스틱","감자"));
		snacks.put("포테포칩", new Snack("포테토칩",2300,"칩","어니언"));
		snacks.put("홈런볼", new Snack("홈런볼",2500,"슈","초코"));
		snacks.put("새우깡", new Snack("새우깡",1400,"깡","새우"));
		snacks.put("고래밥", new Snack("고래밥",1000,"밥","바베큐"));
		System.out.println(snacks);
		Set snacksSet = snacks.entrySet();
		Iterator ir = snacksSet.iterator();
		while(ir.hasNext()) {
			Map.Entry all = (Map.Entry)ir.next();
			Snack val = (Snack)all.getValue();
			System.out.println("이름 : "+val.getName()+ " 가격 : "+val.getPrice());
			
		}
		
		for(Object se : snacksSet) {
			Map.Entry e = (Map.Entry)se;
			System.out.println(e.getKey() +": "+ e.getValue());
		}
		// forEach 메소드 호출하기
		snacks.forEach((k, v) -> System.out.println(k+" : "+v));
		
		// 추가 메소드 8버전이상에서 사용가능
		// getOrDefault() : key 없으면 대채값으로 반환해주는 메소드
		Snack s =(Snack)snacks.get("사또밥");
		s =(Snack)snacks.getOrDefault("사또밥", new Snack());
		System.out.println(s);
		// computeIfAbsent(key,Function인터페이스) : key 가 없으면 Function 인터페이스를 실행
		// public R fun(E); -> 반환되는 값을 map에 추가, 있으면 function 실행 안함.
//		snacks.computeIfAbsent("고래밥", (o1)-> new Snack());
//		snacks.computeIfAbsent("사또밥", (o1)-> new Snack());
		snacks.computeIfAbsent("사또밥", (o1)->{
			// 매개변수 인자는 첫번쨰 매개변수 값을 저장
			System.out.println(o1);
			Snack s1 =new Snack();
			s1.setName((String)o1);
			return s1;
		});
		snacks.forEach((k, v) -> System.out.println(k+" : "+v));
		// computeIfPresent(key,(k,v)->return Object) : key 있으면 인터페이스 실행 -> key 값을 변경할 때
		snacks.computeIfPresent("고래밥", (k, v) -> new Snack() );
		snacks.forEach((k, v) -> System.out.println(k+" : "+v));

		// Map 선언과 동시에 초기화
		// Map.of() 메소드를 지원
//		String v = null;// of 로 생성했을때 null값 저장 불가
		String v = "값";
		m=Map.of(1,"첫번째",2,"두번쨰",3,"세번쨰",4,v);
		System.out.println(m);
//		m.put(4, "네번째");
		
		// TreeMap tm = new TreeMap()
		TreeMap tm = new TreeMap();
		tm.put(1, new Snack("구운감자",1200,"스틱","감자"));
		tm.put(2, new Snack("포테토칩",2300,"칩","어니언"));
		tm.put(3, snacks.get("홈런볼"));
//		tm.put(snacks.get("구운감자"), 10);
		
		// Map 하고 Collection 호환하기
		// values() 메소드를 이용해서 Map의 value 값을 Collection에 저장할 수 있음
		Collection c = snacks.values();
		ArrayList list = new ArrayList();
		Set set = new HashSet(c);
		System.out.println(list);
		System.out.println(set);
		
		// DB 테이블에 있는 데이터를 저장할 때 Map 사용
		Map row = new HashMap();
		row.put("MemberId", "admin");
		row.put("Memberpwd", "1234");
		row.put("MemberName", "유병승");
		row.put("MemberName", 19);
		Map row2 = new HashMap();
		row2.put("MemberId", "user01");
		row2.put("Memberpwd", "2222");
		row2.put("MemberName", "유저1");
		row2.put("MemberName", 22);
		
		List table = new ArrayList();
		table.add(row);
		table.add(row2);
		
		for(Object o1 : table) {
			Map rowTemp = (Map)o1;
			for(Object rowEntry : rowTemp.entrySet()) {
				Map.Entry all = (Map.Entry)rowEntry;
				System.out.println(all.getValue());
			}
		}
		
		System.out.println("-----------------------------------");
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
//		Map fruit = new HashMap();
//		fruit.put(1, new Fruit("귤","제주도",10,15000));
//		fruit.put(2, new Fruit("사과","예산",5,25000));
//		fruit.put(3, new Fruit("포도","영동",10,35000));
//		fruit.put(4, new Fruit("배","나주",10,50000));
//		Set fruitSet = fruit.entrySet();
//		 //1. 전체 데이터 조회
//		for(Object obj : fruitSet) {
//			Map.Entry e = (Map.Entry)obj;
//			System.out.println(e.getValue());
//		}
//		//2. 가격이 20000원 이상인 과일만 key와 value출력
//		System.out.println("2. 가격이 20000원 이상인 과일만 key와 value출력");
//		Iterator ir2 = fruitSet.iterator();
//		while(ir2.hasNext()) {
//			Map.Entry a = (Map.Entry)ir2.next();
//			Fruit val = (Fruit)a.getValue();
//			if(val.getPrice()>20000) {
//				
//				System.out.println(a.getValue());
//			}
//			if(val.getName().length()==1) {
//				System.out.println("3. 이름이 한글자인 과일의 key,value를 출력");
//				System.out.println(a.getKey() +" : "+ a.getValue());
//			}
//			//4. 포도의 가격을 40000원으로 수정하고, 전체데이터 출력
//			fruit.put(3, new Fruit("포도","영동",10,40000));
//			System.out.println(a.getKey() +" : "+ a.getValue());
//		}
//		System.out.println("5. 배를 찾아 삭제하기");
//		Iterator ir3 = fruitSet.iterator();
//		while(ir3.hasNext()) {
//			Map.Entry a = (Map.Entry)ir3.next();
//			Fruit val = (Fruit)a.getValue();
//			if(val.getName().equals("배")) {
//				System.out.println(a.getKey());
//				int key = (int)a.getKey();
//				fruit.remove(key);
//			}
//			System.out.println(a.getKey() +" : "+ a.getValue());
//		}
		
		// 선생님 풀이
		HashMap fruits = new HashMap();
		fruits.put(1, new Fruit("귤","제주도",10,15000));
		fruits.put(2, new Fruit("사과","예산",5,25000));
		fruits.put(3, new Fruit("포도","영동",10,35000));
		fruits.put(4, new Fruit("배","나주",10,50000));
		//1. 전체 데이터 조회
		for(Object o1 : fruits.entrySet()) {
			Map.Entry e = (Map.Entry)o1;
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		System.out.println("-----------------------------------");
	    //2. 가격이 20000원 이상인 과일만 key와 value출력
		for(Object o1 : fruits.entrySet()) {
			Map.Entry e = (Map.Entry)o1;
			Fruit fruit = (Fruit)e.getValue();
			if(f.getPrice()>20000) {
				System.out.println(e.getKey()+" : "+e.getValue());
			}
		}
		fruits.forEach((k1, v1) -> {
			if(((Fruit)v1).getPrice()>20000) {
				System.out.println(k1+" : "+v1);
			}
		});
		System.out.println("-----------------------------------");
		//3. 이름이 한글자인 과일의 key,value를 출력
		fruits.forEach((key, value) -> {
			if(((Fruit)value).getName().length()==1) {
				System.out.println(key+" : "+value);
			}
		});
		System.out.println("-----------------------------------");
	    //4. 포도의 가격을 40000원으로 수정하고, 전체데이터 출력
		for(Object o1 : fruits.entrySet()) {
			Map.Entry all = (Map.Entry)o1;
			Fruit fruit = (Fruit)all.getValue();
			if(fruit.getName().equals("포도")) {
				fruit.setPrice(40000);
			}
		}
		
		System.out.println("-----------------------------------");
		//5. 배를 찾아 삭제하기
		Iterator fruitsAll = fruits.entrySet().iterator();
		while(fruitsAll.hasNext()) {
			Map.Entry fruit = (Map.Entry)fruitsAll.next();
			if(((Fruit)fruit.getValue()).getName().equals("배")) {
				fruitsAll.remove();
			}
		}
//		for(Object o1 : fruits.entrySet()) {
//			Map.Entry fruitAll = (Map.Entry)o1;
//			Fruit fruit =  (Fruit)fruitAll.getValue();
//			if(fruit.getName().equals("배")) {
//				fruits.remove(fruitAll.getKey());
//			}
//		}
//		
//		fruits.forEach((t, u) -> {
//			Fruit fruit = (Fruit)u;
//			if(fruit.getName().equals("배")) {
//				fruits.remove(t);
//			}
//		});
		// -> 에러 발생
		fruits.entrySet().removeIf((o3)->((Fruit)((Map.Entry)o3).getValue()).getName().equals("배"));
		fruits.forEach(MapController::myForeach);
	}
	

		public static void myForeach(Object k, Object v) {
			System.out.println(k +" "+v);
		}
}
