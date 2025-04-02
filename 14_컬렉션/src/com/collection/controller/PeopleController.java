package com.collection.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.People;
import com.collection.model.vo.Person;

public class PeopleController {
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		// 사람클래스는 생서해서 리스트로 관리하기
		// 이름, 나이, 성별, 키, 몸무게
		// 유병승, 19, 남, 180.5, 65.5
		// 홍길동, 44, 여, 155.5, 45.5
		// 고길동, 20, 남, 175.5, 70.5
		// 선덕여왕, 35, 여, 150.2, 50.5
		// 김두환, 42, 남, 188.2, 95.5
		// 1. 위 데이터를 사용자에게 입력받아 리스트에 저장 후 전체 데이터 출력하기
		List list = new ArrayList();
//		for(int i=0;i<6;i++) {
//		System.out.print("이름 입력 : ");
//		String name = SC.next();
//		System.out.print("나이 입력 : ");
//		int age = SC.nextInt();
//		System.out.print("성별 입력 : ");
//		char gender = SC.next().charAt(0);
//		System.out.print("키 입력 : ");
//		double height = SC.nextDouble();
//		System.out.print("몸무게 입력 : ");
//		double weight = SC.nextDouble();	

		list.add(new People("유병승", 19, '남', 180.5, 65.5));
		list.add(new People("홍길동", 44, '여', 155.5, 45.5));
		list.add(new People("고길동", 20, '남', 175.5, 70.5));
		list.add(new People("선덕여왕", 35, '여', 150.2, 50.5));
		list.add(new People("김두환", 42, '남', 188.2, 95.5));
//		list.add(new People(name,age,gender,height,weight));
//		}
		list.forEach(System.out::println);
//		2. 저장한 데이터 중 키가 180이상인 사람의 나이를 1씩 증가 시킨 후 모든 데이터 출력하기
		System.out.println("2. 저장한 데이터 중 키가 180이상인 사람의 나이를 1씩 증가 시킨 후 모든 데이터 출력하기");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			People p = (People) o;
			if (p.getHeight() >= 180) {
				p.setAge(p.getAge() + 1);
			}
		}
		list.forEach(System.out::println);
//		3. 나이가 40세 이상인 사람만 출력하기
		System.out.println("3. 나이가 40세 이상인 사람만 출력하기");
//		while(it.hasNext()) {
//			Object o = it.next();
//			People p = (People)o;
//			if(p.getAge()>=40) {
//				list.forEach(System.out::println);
//			}
//		}
		list.forEach(o -> {
			People p = (People) o;
			if (p.getAge() >= 40) {
				System.out.println(p);
			}
		});
//		4. 사원을 이름(내림차순)순으로 정렬하기
		System.out.println("4. 사원을 이름(내림차순)순으로 정렬하기");
		list.sort((o, o1) -> {
			People pre = (People) o;
			People next = (People) o1;
			return next.getName().compareTo(pre.getName());
		});
		list.forEach(System.out::println);

		// 5. 사원을 키(오름차순)순으로 정렬하기
		System.out.println("5. 사원을 키(오름차순)순으로 정렬하기");
		list.sort((o, o1) -> {
			People pre = (People) o;
			People next = (People) o1;
			return (int) Math.ceil(pre.getHeight() - next.getHeight());
		});
		list.forEach(System.out::println);

		// 6. 2번 인덱스에 최주영,26,남,177.3,70.5 저장하기(추가)
		System.out.println("6. 2번 인덱스에 최주영,26,남,177.3,70.5 저장하기(추가)");
		System.out.println(list.get(2));
		list.add(2, new People("최주영", 26, '남', 177.3, 70.5));
		System.out.println(list.get(2));
//		list.forEach(System.out::println);
		// 7. 3번 인덱스 값을 이동제,25,175.3,68.3 으로 변경하기
		System.out.println("7. 3번 인덱스 값을 이동제,25,175.3,68.3 으로 변경하기");
		System.out.println(list.get(3));
		list.set(3, new People("이동제", 25, '남', 175.3, 68.3));
		System.out.println(list.get(3));
		// 8. 고길동, 20, 남, 175.5, 70.5이 리스트에 있는지 확인하고 없으면 추가하기
		System.out.println("8. 고길동, 20, 남, 175.5, 70.5이 리스트에 있는지 확인하고 없으면 추가하기");
		if (!list.contains(new People("고길동", 20, '남', 175.5, 70.5))) {
			list.add(new People("고길동", 20, '남', 175.5, 70.5));
		}
		list.forEach(System.out::println);
		// 9. 이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 추가하기
		System.out.println("9. 이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 추가하기");
		for (int i = 0; i < list.size(); i++) {
			if (((People) list.get(i)).getName().equals("선덕여왕")) {
				list.add(i, new People("주몽", 58, '남', 189.4, 90.3));
				break;
			}
		}
		list.forEach(System.out::println);
		// 10. 4번 인덱스의 사람 삭제하기
		list.forEach(System.out::println);
		list.remove(4);
		list.forEach(System.out::println);

		// 11. 김두환, 42, 남, 188.2, 95.5 사람 삭제하기
		if (list.contains(new People("김두환", 42, '남', 188.2, 95.5))) {
			list.remove(new People("김두환", 42, '남', 188.2, 95.5));
		}

		// 12. 리스트에 값이 있는지 없는지 확인하고 값이 있으면 사람있어요~~ 출력 없으면 사람없어요~~ 출력
		for (int i = 0; i < list.size(); i++) {
			if (!list.isEmpty()) {
				System.out.println("사람있어요~~");
			} else {
				System.out.println("사람없어요~~");
			}
		}
		//13. 리스트에 있는 모든데이터 삭제하기
		list.clear();
	}
}
