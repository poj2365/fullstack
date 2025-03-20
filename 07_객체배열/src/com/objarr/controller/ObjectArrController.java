package com.objarr.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

import com.objarr.common.FruitFilter;
import com.objarr.model.vo.Car;
import com.objarr.model.vo.Food;
import com.objarr.model.vo.Fruit;

public class ObjectArrController {
	
	public void basicObjectArray() {
		//객체배열 선언하기
		Food[] foods;
		foods=new Food[3];//Food f1,f2,f3;
		
//		foods[0].setName("구내식당");
		
		//객체 배열의 각 저장소에 객체를 생성 후 활용해야함.
		foods[0]=new Food();
		foods[1]=new Food("쌀국수",11000,"아시아");
		System.out.println(foods[0]);
		System.out.println(foods[1]);
		
		//객체배열에 저장된 객체 활용하기
		foods[0].setName("짜장면");
//		foods[0].name="짜장면";
		System.out.println(foods[0].getName());
		System.out.println(foods[1].getName());
		
		//반복문을 이용해서 데이터 조회하기
		for(int i=0;i<foods.length;i++) {
			if(foods[i]!=null)
				System.out.println(foods[i].getName());
		}
		
		//반복문을 이용해서 foods에 
		//초밥, 15000, 일식
		//김치찌개, 9000, 한식
		//구내식상, 6500, 한식
		//입력하여 저장하고 출력해보기
		
//		foods[0]=new Food("초밥",15000,"일식");
//		foods[1]=new Food("김치찌개",9000,"한식");
//		foods[2]=new Food("구내식당",6500,"한식");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<foods.length;i++) {
			foods[i]=new Food();
			System.out.print("이름 : ");
			String name=sc.nextLine();
			foods[i].setName(name);
			System.out.print("가격 : ");
			int price=sc.nextInt();
			foods[i].setPrice(price);
			sc.nextLine();
			System.out.print("종류 : ");
			String type=sc.nextLine();
			foods[i].setType(type);
			//foods[i]=new Food(name,price,type);
		}
		for(int i=0;i<foods.length;i++) {
			System.out.println(foods[i].getName()
					+" "+foods[i].getPrice()+" "+foods[i].getType());
		}
		
		//Car클래스를 선언하고
		//차종, 색상, km, 이름
		//배열을 이용해서 데이터를 저장
		//대형 검정 300 타호
		//중형 흰색 500 GV70
		//스포츠 노랑 10 카마로
		//소형 카키 800 캐스퍼
		//대형 파란 600 타요
		//입력받아서 저장하기 / 저장한 값 출력하기
	}
	
	public void testCar() {
		Car[] cars=new Car[5];
		Scanner sc=new Scanner(System.in);
		cars[0]=new Car("대형","검정",300,"타호");
		cars[1]=new Car("중형","흰색",500,"GV70");
		cars[2]=new Car("스포츠","노랑",10,"카마로");
		cars[3]=new Car("소형","카키",800,"캐스퍼");
		cars[4]=new Car("대형","파랑",600,"타요");
//		for(int i=0;i<cars.length;i++) {
//			cars[i]=new Car();
//			System.out.print("차종 : ");
//			String chajong=sc.next();
//			cars[i].setType(chajong);
//			System.out.print("색상 : ");
//			String color=sc.next();
//			cars[i].setColor(color);
//			System.out.print("거리 : ");
//			int km=sc.nextInt();
//			cars[i].setKm(km);
//			System.out.print("이름 : ");
//			String name=sc.next();
//			cars[i].setName(name);
//			//cars[i]=new Car(color,name,km,chajong);
//		}
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].getCarType()
					+" "+cars[i].getCarColor()
					+" "+cars[i].getKm()
					+" "+cars[i].getCarName());
		}
		
		//객체 배열에서 forEach문 활용하기
		//for(자료형 변수명 : 배열)
		for(Car c : cars) {
			System.out.println(c.getCarType()
					+" "+c.getCarColor()
					+" "+c.getKm()
					+" "+c.getCarName());
		}
		//forEach으로 값 수정하기 -> 
//		for(Car c:cars) {
//			c.setName("ttt");
//			c=new Car();
//		}
//		for(Car c : cars) {
//			System.out.println(c.getName());
//		}
		System.out.println("500 이상인 차 출력하기");
		//cars에 저장된 차 중 주행거리가 500을 초과하는 차 출력하기
		//주행거리가 500초과가는 차만 저장한 배열 생성하기
		for(Car c : cars) {
			if(c.getKm()>500) {
				System.out.println(c.infoCar());
			}
		}
		int count=0;
		for(Car c : cars){
			if(c.getKm()>500) count++;
		}
//		Car[] car500=new Car[cars.length];
		Car[] car500=new Car[count];
//		car500[0]=cars[0];
//		cart500[0]=new Car(cars[0].getName()));
		
		int i=0;
		for(Car c : cars) {
			if(c.getKm()>500) {
				car500[i++]=c;
			}
		}
		for(Car c : car500) {
//			if(c!=null)
				System.out.println(c.infoCar());
		}
		
//		Car[] tempCar;
//		
//		tempCar=Arrays.stream(cars)
//				.filter(c->c.getKm()>500)
//				.toArray(Car[]::new);
//		
//		for(Car c : tempCar) {
//			System.out.println(c.infoCar());
//		}
		
		//객체배열 선언과 동시에 초기화하기
		Food[] foods2= {new Food(),new Food()};
		for(Food f : foods2) {
			f.setName("test");
			//f=new Food();
		}
		foods2= new Food[]{new Food("짜장면",9000,"중식"),
				new Food("돈까스",1200,"양식"),
				new Food("짜글이",1800,"한식")};
		
		
		
		
		
		//과일을 저장할 수 있는 클래스를 만들고
		//이름, 무게, 색상, 가격
		//과일을 5개 저장할 수 있는 저장소를 만들자
		//1. 초기화한 과일들 전체 출력하기
		//2. 입력된 과일중 무게가 3kg이상인 과일 출력하기
		//3. 가격이 3000 이상인 과일 출력하기
		//사과 5 빨강 10000
		//바나나 3 노랑 8000
		//딸기 1.5 빨강 2500
		//키위 2 초록 2800
		//샤인머스켓 1.3 초록 40000
		
		Fruit[] fruits=new Fruit[5];
		fruits[0]=new Fruit("사과",5, "빨강", 10000);
		fruits[1]=new Fruit("바나나" ,3, "노랑", 8000);
		fruits[2]=new Fruit("딸기", 1.5, "빨강", 2500);
		fruits[3]=new Fruit("키위", 2, "초록", 2800);
		fruits[4]=new Fruit("샤인머스켓", 1.3, "초록", 40000);
		
		for(Fruit f : fruits) {
			System.out.println(f.getName()
					+" "+f.getWeight()
					+" "+f.getColor()
					+" "+f.getPrice());
		}
		System.out.println("3kg이상 과일 출력하기");
		for(Fruit f : fruits) {
			if(f.getWeight()>=3) {
				System.out.println(f.getName()
						+" "+f.getWeight()
						+" "+f.getColor()
						+" "+f.getPrice());
			}
		}
		System.out.println("가격이 3000이상인 과일");
		for(Fruit f : fruits) {
			if(f.getPrice()>=3000) {
				System.out.println(f.getName()
						+" "+f.getWeight()
						+" "+f.getColor()
						+" "+f.getPrice());
			}
		}
		
//		Arrays.stream(fruits)
//		.forEach(f->System.out.println(f.infoFruit()));
		System.out.println("무게로 과일 찾기");
		fruitFilter(fruits,(f)->f.getWeight()>=3,3);
		System.out.println("가격으로 과일찾기");
		fruitFilter(fruits,(f)->f.getPrice()>3000,3000);
		System.out.println("과일이름이 두글자인것 찾기");
		fruitFilter(fruits,(f)->f.getName().length()==2,2);
		System.out.println("과일이름이 두글자인것 찾기22");
//		Predicate<Fruit> filter=new Predicate<Fruit>() {
//			@Override
//			public boolean test(Fruit f) {
//				return f.getName().length()>3;
//			}
//		};
		
//		fruitFilter2(fruits,new Predicate<Fruit>() {
//			@Override
//			public boolean test(Fruit f) {
//				return f.getName().length()>3;
//			}
//		});
		
		System.out.println("stream으로 출력하기");
//		Arrays.stream(fruits)
//		.filter((f)->f.getName().length()==2)
//		.forEach(System.out::println);
	}
//	public void fruitFilter2(Fruit[] fruits,Predicate<Fruit> filter) {
//		for(Fruit f : fruits) {
//			if(filter.test(f)) {
//				System.out.println(f.getName()
//						+" "+f.getWeight()
//						+" "+f.getColor()
//						+" "+f.getPrice());
//			}
//		}
//	}
	public void fruitFilter(Fruit[] fruits,
			FruitFilter filter,
			int value) {
		for(Fruit f : fruits) {
			if(filter.checkFruit(f)) {
				System.out.println(f.getName()
						+" "+f.getWeight()
						+" "+f.getColor()
						+" "+f.getPrice());
			}
		}
	}
	
	
}





