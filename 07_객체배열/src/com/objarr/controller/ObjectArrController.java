package com.objarr.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

import com.objarr.common.FruitFilter;
import com.objarr.model.vo.Car;
import com.objarr.model.vo.Food;
import com.objarr.model.vo.Fruit;

public class ObjectArrController { // 3/14 객체 배열

	private static final Scanner SC = new Scanner(System.in);

	public void basicObjectArray() {
		// 객체배열 선언하기
		Food[] foods;
		foods = new Food[3]; // Food f1,f2,f3 Food 객체를 생성한게 아니라 Food를 저장할 저장소 3개를 생성

//		foods[0].setName("구내식당"); nullpointer 에러 발생
		// 객체 배열의 각 저장소에 객체를 생성 후 활용해야함.
		foods[0] = new Food();
		foods[0] = new Food("쌀국수", 11000, "아시아");
		System.out.println(foods[0]);
		System.out.println(foods[1]);

		// 객체 배열에 저장된 객체 활용하기
		foods[0].setName("짜장면");
//		foods[0].name="짜장면"; 직접 접근 불가능
		System.out.println(foods[0].getName());
//		System.out.println(foods[1].getName());

		// 반복문을 이용해서 데이터 조회하기
		for (int i = 0; i < foods.length; i++) {
			if (foods[i] != null) {
				System.out.println(foods[i].getName());
			}
		}

		// 반복문을 이용해서 foods에
		// 초밥, 15000, 일식
		// 김치찌개, 9000, 한식
		// 구내식당, 6500, 한식
		// 저장하고 출력해보기
//		foods[0] = new Food("초밥", 15000, "일식");
//		foods[1] = new Food("김치찌개", 9000, "한식");
//		foods[2] = new Food("구내식당", 6500, "한식");
//		for(int i=0;i<foods.length;i++) {
//			System.out.println(foods[i].getName()+" "+foods[i].getPrice()+" "+foods[i].getType());
//		}
		// 입력 받아서 출력하기
		String result = "";
		for (int i = 0; i < foods.length; i++) {
			foods[i] = new Food(); // 객체 생성해줘야 에러 안남
			System.out.print("음식 입력 : ");
			foods[i].setName(SC.next());
			System.out.print("가격 입력 : ");
			foods[i].setPrice(SC.nextInt());
			System.out.print("타입 입력 : ");
			foods[i].setType(SC.next());
			result += foods[i].getName() + " " + foods[i].getPrice() + " " + foods[i].getType() + " ";
		}
		System.out.println(result);
	}

//	 Car 클래스를 선언하고 차종, 색상, km, 이름 배열을 사용해서 데이터를 저장
//	 대형 검정 300 타호
//	 중형 흰색 500 GV70
//   스포츠 노랑 10 카마로
//	 소형 카키 800 캐스퍼
//	 대형 파란 600 타요
//	 입력 받아서 저장하기 / 저장한 값 출력하기
	public void carObjectArr() {
		String result = "";
		Car[] car;
		car = new Car[5];
		for (int i = 0; i < car.length; i++) {
			car[i] = new Car(); // 객체 생성해줘야 에러 안남
			System.out.print("차종 입력 : ");
			car[i].setCarType(SC.next());
			System.out.print("색상 입력 : ");
			car[i].setCarColor(SC.next());
			System.out.print("km 입력 : ");
			car[i].setKm(SC.nextInt());
			System.out.print("이름 입력 : ");
			car[i].setCarName(SC.next());
			result += car[i].getCarType() + " " 
					+ car[i].getCarColor() + " " 
					+ car[i].getKm() + " "
					+ car[i].getCarName() + " ";
		}
		System.out.println(result);

		// car[i] = new Car(cartype, name, km, color); 이렇게 사용하는 것보다는 
		// getter/setter 이용하는 것을 권장함
		// 왜냐하면 차종 색상 km 이름 순으로 넣어야하는데 위처럼 실수로 잘못 넣을 경우가 발생하기 때문
		
		// 객체 배열에서 forEach 문 활용하기
		// for(자료형 변수명 : 배열)
		Car[] cars = new Car[5];
	    cars[0]=new Car("대형","검정",300,"타호");
	    cars[1]=new Car("중형","흰색",500,"GV70");
	    cars[2]=new Car("스포츠","노랑",10,"카마로");
	    cars[3]=new Car("소형","카키",800,"캐스퍼");
	    cars[4]=new Car("대형","파랑",600,"타요");
		for(Car c : cars) {
			System.out.println(c.getCarType() + " " 
					+ c.getCarColor() + " " 
					+ c.getKm() + " "
					+ c.getCarName() + " ");
		}
		// forEach으로 값 수정하기(주소값이 있는 경우 수정가능) ->
		for(Car c: cars) {
			c.setCarName("ttt");
			System.out.println(c.getCarName());
		}
		
		// cars에 저장된 차 중 주행거리가 500을 초과하는 차 출력하기
		// 주행거리가 500 초과한 차만 저장한 배열 생성하기
		
		System.out.println("500을 초과하는 차 출력하기");
		for(Car c: cars) {
			if(c.getKm()>500) {
				System.out.println(c.infoCar());				
			}
		}
		int count = 0;
		for(Car c: cars) {
			if(c.getKm()>500) {
				count++;
			}
		}
//		Car[] car500 = new Car[cars.length];
		Car[] car500 = new Car[count];		
		int i = 0;
		for(Car c: cars) {
			if(c.getKm()>500) {
				car500[i++]=c;				
					System.out.println(c.infoCar());				
			}
		}
		
		Car[] tempCar;
//		tempCar = Arrays.stream(cars).filter(c->c.getKm()>500).toArray(Car[]::new);
//		for(Car c : tempCar) {
//			System.out.println(c.infoCar());
//		}
		// 객체 배열 선언과 동시에 초기화
		Food[] foods = {new Food(),new Food()};
		for(Food f: foods) {
			f.setName("test");
		}
//		foods {new Food("짜장면", 9000, "중식"),
//			   new Food("돈까스", 1200, "양식"),
//			   new Food("짜글이", 1200, "한식")
//		};
	}
	
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
	public void fruit() {
		Fruit[] f = {new Fruit("사과",5,"빨강",10000),
					 new Fruit("바나나",3,"노랑",8000),
					 new Fruit("딸기",1.5,"노랑",2500),
					 new Fruit("키위",2,"노랑",2800),
					 new Fruit("샤인머스켓",1.3,"노랑",40000)
		};
		for(Fruit fruit : f) {
			//1. 초기화한 과일들 전체 출력하기
			System.out.println(fruit.infoFruit());
		}
//		Arrays.stream(f).forEach(System.out::println);
		System.out.println("------------------------");
		
		//2. 입력된 과일중 무게가 3kg이상인 과일 출력하기
		for(Fruit fruit : f) {
			if(fruit.getWeight()>=3) {
				System.out.println(fruit.infoFruit());
				fruitFilter(fruit, (f,value)->f.getWeight()>=value, 3);
				fruitFilter2(fruit, (f)->f.getName().length()==2);
			}
		}
		
		System.out.println("------------------------");
		//3. 가격이 3000 이상인 과일 출력하기
		for(Fruit fruit : f) {
			if(fruit.getPrice()>=3000) {
				System.out.println(fruit.infoFruit());
			}
		}
		System.out.println("------------------------");
		
	}
	
	// 03/19
	public void fruitFilter(Fruit[] fruit, FruitFilter filter, Object value) {
		for(Fruit f : fruit) {
			if(filter.checkFruit(f, value)) {
				System.out.println(f.infoFruit());
			}
		}
	}
	
	public void fruitFilter2(Fruit fruit, Predicate<Fruit> filter) {
		for(Fruit f : fruit) {
			if(filter.test(f)) {
				System.out.println(f.infoFruit());
			}
		}
	}
}
