package com.collection.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.collection.common.PersonHeightAsc;
import com.collection.common.PersonNamesAsc;
import com.collection.model.vo.Food;
import com.collection.model.vo.Person;

public class ListController {
	public static void main(String[] args) {
		// List 인터페이스
//		List list = new List();
		// List 인터페이스를 구현한 클래스를 이용
		// ArrayList, LinkedList
		// 선형 자료 구조를 가지고 있으며 index 번호가 있음
		// 데이터에 순서가 있음.
		// 중복 값 저장 가능
		// 클래스 이용방식으로 이용
		ArrayList arrList;
		arrList = new ArrayList();
		// ArrayList 객체가 제공하는 메소드를 이용해서 데이터를 저장, 관리함

		// 데이터 저장, 수정, 삭제하기
		// add(Object) : 맨 뒤에 추가 / add(index, object) 원하는 위치에 추가
		arrList.add("유병승");
		arrList.add("양지혁");
		arrList.add("유병승");
		System.out.println(arrList);

		// 별도의 설정이 없다면 Object 타입으로 저장함.
		arrList.add(10);
		arrList.add(true);
		arrList.add('A');
		arrList.add(LocalDate.now());
		System.out.println(arrList);

		// 특정 인덱스에 데이터 값 추가하기
		// add(index, 값)
		arrList.add(2, 180.5);
		System.out.println(arrList);

		// 데이터 수정하기
		// 특정 인덱스의 값을 변경하기
		// set(index, 값)
		arrList.set(0, "장명수");
		System.out.println(arrList);

		// 삭제하기
		// clear() : 전체 데이터 삭제
		// remove(index) : 특정 인덱스의 값을 삭제
		// remove(Object) : 인자값과 일치하는 값을 삭제
		// * 비교하는 클래스에 equals, hashCode 메소드가 정의되어 있어야함.
//		arrList.clear();
//		arrList.remove(2);
//		arrList.remove(true);
//		arrList.remove(Integer.valueOf(10));
		System.out.println(arrList);

		// 클래스는 선언해서 ArrayList로 관리하기
		ArrayList foods = new ArrayList();
		foods.add(new Food("냉면", 8000, "한식", 4));
		foods.add(new Food("짜장면", 9000, "중식", 3));
		System.out.println(foods);

		foods.add(1, new Food("돈까스", 12000, "양식", 3));
		System.out.println(foods);
		foods.set(1, new Food("콩국수", 10000, "한식", 4));
		System.out.println(foods);

//		foods.remove(0);
		System.out.println(foods);
//		foods.remove(new Food("콩국수", 10000, "한식", 4));
		System.out.println(foods);

		// 저장된 값을 조회하기
		// get(index)
		Object o = arrList.get(0);
		String name = (String) arrList.get(0);
		System.out.println(name);

		boolean flag = (Boolean) arrList.get(5);
		System.out.println(flag);

		Food temp = (Food) foods.get(0);
		System.out.println(temp.getName() + " " + temp.getPrice());

		// ArrList 의 길이 구하기
		// size()
		System.out.println(foods.size());
		// 반복문을 이용해서 데이터 조회하기
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		// foods에서 타입, 이름, 가격을 출력하기
		for (int i = 0; i < foods.size(); i++) {
//			foods.sort((type, name) -> type.);
			Food f = (Food) foods.get(i);
			System.out.println(f.getName() + " " + f.getType() + " " + f.getPrice());
			System.out.println(((Food) foods.get(i)).getType());
			System.out.println(((Food) foods.get(i)).getName());
			System.out.println(((Food) foods.get(i)).getPrice());
			// 오브젝트 타입이라서 Food로 형변환 해줘야하는데 연산 순서가 형변환이 느려서 () 해줘야함
		}
		for (Object f : foods) {
			Food f1 = (Food) f;
			System.out.println(f1.getType() + " " + f1.getPrice() + " " + f1.getType());
		}

		// iterator() 메소드를 이용해서 데이터 조회하기
		// Iterator 인터페이스 구현체를 반환
		Iterator ir = foods.iterator();
		while (ir.hasNext()) {
			Food f = (Food) ir.next(); // 저장된 객체 한개 반환 == foods.get(i)
		}

		// List 인터페이스가 제공하는 default 메소드를 이용
		foods.forEach(new Consumer() {
			@Override
			public void accept(Object o) {
				System.out.println(o);
			}
		});
		foods.forEach((o1) -> {
			Food f1 = (Food) o1;
			System.out.println(f1.getType() + " " + f1.getPrice() + " " + f1.getType());
		});

		foods.forEach(System.out::println); // void accept(Object o){}

		// ArrayList를 하나 생성
		// 삼겹살,12000,한식,5
		// 피자,23000,양식,4
		// 치킨,20000,한식,4
		// 국밥,9000,한식,3
		// 요아정,15000,간식,3
		// 1. 데이터 저장하기
		// 2. 전체데이터 출력하기 -> 4가지방식 모두 이용하기
		// 3. 2만원이상인 음식의 이름, 가격, 평점 출력하기
		// 4. 평정이 4점 이상인 음식의 이름 가격 출력하기
		// 5. 음식이름이 치킨인 전체 데이터 출력하기
		// 6. 피자의 이름 가격 타입 출력하기
		// 7. 치킨을 뿌링클로 변경하기
		// 8. 삼겹살 삭제하기
		ArrayList food = new ArrayList();
		// 1. 데이터 저장하기
		food.add(new Food("삼겹살", 12000, "한식", 5));
		food.add(new Food("피자", 23000, "양식", 4));
		food.add(new Food("치킨", 20000, "한식", 4));
		food.add(new Food("국밥", 9000, "한식", 3));
		food.add(new Food("요아정", 15000, "간식", 3));

		// 2. 전체데이터 출력하기 -> 4가지방식 모두 이용하기
		for (int i = 0; i < food.size(); i++) {
			Food f = (Food) food.get(i);
			System.out.println(f.getName() + " " + f.getPrice() + " " + f.getType() + " " + f.getRating());
		}
		for (Object ob : food) {
			Food f = (Food) ob;
			System.out.println(f.getName() + " " + f.getPrice() + " " + f.getType() + " " + f.getRating());
		}
		Iterator it = food.iterator();
		while (it.hasNext()) {
			Food f = (Food) it.next();
		}
		food.forEach(System.out::println);
		// 3. 2만원이상인 음식의 이름, 가격, 평점 출력하기
		for (int i = 0; i < food.size(); i++) {
			Food f = (Food) food.get(i);
			if (f.getPrice() >= 20000) {
				System.out.println(f.getName() + " " + f.getPrice() + " " + f.getRating());
			}
		}
		// 4. 평정이 4점 이상인 음식의 이름 가격 출력하기
		for (int i = 0; i < food.size(); i++) {
			Food f = (Food) food.get(i);
			if (f.getRating() >= 4) {
				System.out.println(f.getName() + " " + f.getPrice());
			}
		}
		// 5. 음식이름이 치킨인 전체 데이터 출력하기
		for (int i = 0; i < food.size(); i++) {
			Food f = (Food) food.get(i);
			if (f.getName().equals("치킨")) {
				System.out.println(f.getName() + " " + f.getPrice() + " " + f.getType() + " " + f.getRating());
			}
		}
		// 6. 피자의 이름 가격 타입 출력하기
		for (int i = 0; i < food.size(); i++) {
			Food f = (Food) food.get(i);
			if (f.getName().equals("피자")) {
				System.out.println(f.getName() + " " + f.getPrice() + " " + f.getType());
			}
		}

		// 7. 치킨을 뿌링클로 변경하기
		for (int i = 0; i < food.size(); i++) {
			Food f = (Food) food.get(i);
			if (f.getName().equals("치킨")) {
				f.setName("뿌링클");
			}
		}

		// 8. 삼겹살 삭제하기
		for (int i = 0; i < food.size(); i++) {
			Food f = (Food) food.get(i);
			if (f.getName().equals("삼겹살")) {
				food.remove(i);
			}
		}

		food.forEach(System.out::println);

		// 사람클래스를 만들기
		// 이름, 나이, 키, 성별
		// 유병승, 19, 180.5 '남'
		// 이순신, 29, 179.2, '남'
		// 김두한, 25, 165.3, '여'
		// 홍길동, 28, 177.3, '남'
		// 김천재, 26, 164.2, '여'
		// 김양반, 31, 174.3, '남'
		// 1. 두번째 저장소에 있는 사람의 이름, 나이 출력하기
		// 2. 나이가 20대인 사람들 이름 나이 키 출력하기
		// 3. 이름이 김천재인 사람의 나이를 39 키를 170.3으로 수정
		// 4. 나이가 19세인 사람 삭제하기
		// 5. 세번째 저장소에 신사임당, 31, 154.2, '여'을 저장
		// 6. 권지용, 29, 173.3,'남' 을 중복되는 사람이 아니면 저장
		ArrayList person = new ArrayList();
		person.add(new Person("유병승", 19, 180.5, '남'));
		person.add(new Person("이순신", 29, 179.2, '남'));
		person.add(new Person("김두한", 25, 165.3, '여'));
		person.add(new Person("홍길동", 28, 177.3, '남'));
		person.add(new Person("김천재", 26, 164.2, '여'));
		person.add(new Person("김양반", 31, 174.3, '남'));
		// 1. 두번째 저장소에 있는 사람의 이름, 나이 출력하기
		System.out.println("1. 두번째 저장소에 있는 사람의 이름, 나이 출력하기");
		System.out.println(((Person) person.get(1)).getName() + " " + ((Person) person.get(1)).getAge());
		System.out.println("--------------------------------------");
		// 2. 나이가 20대인 사람들 이름 나이 키 출력하기
		System.out.println("2. 나이가 20대인 사람들 이름 나이 키 출력하기");
		for (int i = 0; i < person.size(); i++) {
			Person p = (Person) person.get(i);
			if (20 <= p.getAge() || p.getAge() < 30) {
				System.out.println(p.getName() + " " + p.getAge());
			}
		}
		person.forEach(o1 -> {
			Person p1 = (Person) o1;
			if (p1.getAge() >= 20 && 30 > p1.getAge()) {
				System.out.println(p1.getName() + " " + p1.getAge());
			}
		});
		System.out.println("--------------------------------------");
		// 3. 이름이 김천재인 사람의 나이를 39 키를 170.3으로 수정
		System.out.println("3. 이름이 김천재인 사람의 나이를 39 키를 170.3으로 수정");
		for (int i = 0; i < person.size(); i++) {
			Person p = (Person) person.get(i);
			if (p.getName().equals("김천재")) {
				p.setAge(39);
				p.setHeight(170.3);
				System.out.println(p.getAge() + " " + p.getHeight());
			}
		}
		System.out.println("--------------------------------------");
		// 4. 나이가 19세인 사람 삭제하기
		System.out.println("4. 나이가 19세인 사람 삭제하기");
//		for(Object o1 : person) {
//			if(o1 instanceof Person) {
//				Person p1 = (Person)o1;
//				if(p1.getAge()==19) {
//					person.remove(p1); // 오브젝트 타입으로 삭제
//				}
//			}
//		} forEacht 문으로 삭제하면 java.util.ConcurrentModificationException 에러 발생 
		// 왜냐하면 forEacht 문은 Iterator 로 가져와서 지우면 Iterator로 가져온 값과 데이터가 불일치하게 되어버림
		Iterator it2 = person.iterator();
		while (it2.hasNext()) {
			Object o1 = it2.next();
			if (o1 instanceof Person) {
				Person p1 = (Person) o1;
				if (p1.getAge() == 19) {
					it2.remove();
				}
			}
		}

		for (int i = 0; i < person.size(); i++) {
			Person p = (Person) person.get(i);
			if (p.getAge() == 19) {
				person.remove(i);
			}
		}
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		// 5. 세번째 저장소에 신사임당, 31, 154.2, '여'을 저장
		System.out.println("5. 세번째 저장소에 신사임당, 31, 154.2, '여'을 저장");
		person.add(2, new Person("신사임당", 31, 154.2, '여'));
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		// 6. 권지용, 29, 173.3,'남' 을 중복되는 사람이 아니면 저장
		System.out.println("6. 권지용, 29, 173.3,'남' 을 중복되는 사람이 아니면 저장");
//		boolean result = false;
//		for (int i = 0; i < person.size(); i++) {
//			Person p = (Person) person.get(i);
//			if (p instanceof Person) {
//				if (p.equals(new Person("권지용", 29, 173.3, '남'))) {
//					result = true;
//					break;
//				}
//			}
//		}
//		if (result) {
//			person.add(new Person("권지용", 29, 173.3, '남'));
//		}
		// 사실 위에처럼 할 필요 없이 contains 메소드가 있음
		if (!person.contains(new Person("권지용", 29, 173.3, '남'))) {// equals hashCode 구현되어 있어야함
			person.add(new Person("권지용", 29, 173.3, '남'));
		}
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		linkedList();
	}

	public static void extraMethods() {
		// 1. 중복 값을 저장 할 수 있다.
		ArrayList list = new ArrayList();
		list.add(new Person("유병승", 19, 180.5, '남'));
		list.add(new Person("유병승", 19, 180.5, '남'));
		list.add(new Person("유병승", 19, 180.5, '남'));

		list.forEach(System.out::println);

		// 2. 인덱스 번호 찾기
		// indexOf() / lastIndexOf()
		list.add(new Person("이순신", 29, 179.2, '남'));
		list.add(new Person("김두한", 25, 165.3, '여'));
		list.add(new Person("홍길동", 28, 177.3, '남'));
		list.add(new Person("김천재", 26, 164.2, '여'));
		list.add(new Person("김양반", 31, 174.3, '남'));
		int index = list.indexOf(new Person("김천재", 26, 164.2, '여'));
		System.out.println(index);
		((Person) list.get(index)).setName("김바보");
		((Person) list.get(index)).setAge(47);
		index = list.indexOf(new Person("유병승", 19, 180.5, '남'));
		System.out.println(index);

		// 3. List 자료형을 객체 배열로 반환해주는 메소드
		// toArray() 함수 이용
		Object[] personArr = list.toArray();
		System.out.println(personArr);
		for (Object o : personArr) {
			System.out.println(o);
		}
		personArr = list.toArray(value -> {
			// 인덱스 번호
			System.out.println(value);
			Object[] obj = new Object[list.size()];
			Object o = list.get(value);
			return new Object[] { o };
		});
		for (Object o : personArr) {
			System.out.println(o);
		}

		// 객체배열을 List 로 반환해주는 메소드
		// Arrarys.asList() 메소드 이용
		String[] names = { "유병승", "양지혁", "박서영", "박세웅", "황민익" };
		System.out.println(names);
//		List nameList = Arrays.asList(names); //불변 readOnly
//		nameList.add("최준범"); 길이 변경 불가능 수정은 가능
		List nameList = new ArrayList(Arrays.asList(names));
		nameList.add("최준범");
		nameList.set(1, "김경주");
		System.out.println(nameList);

		// 초기화 한 List를 생성하기
		// List.of()
		List numbers = List.of(1, 2, 3, 4, 5, 6, 7); // 불변 readOnly
		System.out.println(numbers);
//		numbers.add(8); 길이 변경 불가능
//		numbers.set(1, 100); 수정도 불가능
		System.out.println(numbers.get(0));
		numbers = new ArrayList(numbers);
		numbers.add(8);
		numbers.set(1, 100);
		System.out.println(numbers);

		// 메소드 참조 void 형이면서 매개변수 한개
		list.forEach(System.out::println);
		System.out.println("메소드 참조 직접 만듬");
		list.forEach(new Person()::referenceMethodTest);
		System.out.println("생성자 참조하기");
		list.forEach(Person::new);

	}

	public static void sortTest() {
		// List 자료형은 순서가 있음 -> 정렬
		// List 인터페이스가 제공하는 sort()메소드를 이용할 수 있다.
		ArrayList numbers = new ArrayList();
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(7);
		numbers.add(3);
		numbers.add(10);
		System.out.println(numbers);
		// Compareator 인터페이스 @FunctionalInterface
		// 정렬에 사용하는 기준이 되는 값을 반환하는 추상메소드를 선언
		// int compare(Object o, Obeject o2); o1 , o2는 배열의 앞 뒤값 바꿀지 말지
		// 양수 : 변경해라
		// 음수 : 변경하지마
		// 0 : 변경하지마 -> 같은 값일 경우
		// 오름차순 정렬
		numbers.sort(new Comparator() {
			@Override
			public int compare(Object prev, Object next) {
				Integer i = (Integer) prev;
				Integer j = (Integer) next;
				if (i > j)
					return 1;
				else if (i < j)
					return -1;
				return 0;
			}
		});
		System.out.println(numbers);

		// 내림차순
		numbers.sort((o, o2) -> {
			Integer prev = (Integer) o;
			Integer next = (Integer) o2;
//			if(prev<next) return 1;
//			else if(prev>next) return -1;
//			return 0;
			return next - prev; // -, +, 0
		});
		System.out.println(numbers);

		// 나이순 오름차순, 내림차순 각각 출력
		ArrayList person = new ArrayList();
		person.add(new Person("유병승", 19, 180.5, '남'));
		person.add(new Person("이순신", 29, 179.2, '남'));
		person.add(new Person("김두한", 25, 165.3, '여'));
		person.add(new Person("홍길동", 28, 177.3, '남'));
		person.add(new Person("김천재", 26, 164.2, '여'));
		person.add(new Person("김양반", 31, 174.3, '남'));
		person.sort((o1, o2) -> {
			Person prev = (Person) o1;
			Person next = (Person) o2;
			return prev.getAge() - next.getAge();
		});
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		person.sort((o1, o2) -> {
			Person prev = (Person) o1;
			Person next = (Person) o2;
			return next.getAge() - prev.getAge();
		});
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		person.sort(new PersonHeightAsc());
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		// 이름순으로 정렬하기
		// compareable 인터페이스를 이용해서
		// 객체의 기본 우선순위를 설정할 수 있음
		// int compareTo(Object) 메소드를 재정의
//		String
		person.sort(new PersonNamesAsc());
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		// 내림차순
		person.sort((o, o1) -> {
			Person pre = (Person) o;
			Person next = (Person) o1;
			return next.getName().compareTo(pre.getName());
		});
		person.forEach(System.out::println);
		System.out.println("--------------------------------------");
		System.out.println("compareTo 로 정렬하기");
		// Collections 클래스에서 제공하는 sort 메소드 이용하기
		Collections.sort(person); // person에 있는 compareTo로 정렬하겠다는 뜻 (implements Comparable 필수)
		person.forEach(System.out::println);

		System.out.println(((Person) person.get(0)).compareTo((Person) person.get(1)));
	}
	
	public static void linkedList() {
		// 연결된 리스트
		// ArrayList와 동일하다
		LinkedList llist = new LinkedList();
		llist.add("안녕");
		llist.add("19");
		llist.forEach(System.out::println);
		llist.add(1,"중간에 추가");
		llist.forEach(System.out::println);

		llist.addFirst("호호");
		llist.forEach(System.out::println);
		llist.addLast("히히");
		llist.forEach(System.out::println);
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		Collections.sort(llist);
		llist.forEach(System.out::println);
		
		List list = new ArrayList();
		list = new LinkedList();
		Collection c = new ArrayList();
		c = new LinkedList();
	}
}