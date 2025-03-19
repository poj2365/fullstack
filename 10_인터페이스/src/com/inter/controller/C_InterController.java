package com.inter.controller;

import com.inter.common.A_BasicInter;
import com.inter.common.AnimalAble;
import com.inter.common.C_ChildInter;
import com.inter.common.C_ParentInter;
import com.inter.common.C_ParentInter2;
import com.inter.common.FlyAble;
import com.inter.common.MoveAble;
import com.inter.common.MyFuntionalInter;
import com.inter.model.vo.Animal;
import com.inter.model.vo.C_Chicken;
import com.inter.model.vo.C_ChildInterImpl;
import com.inter.model.vo.C_Turtle;

public class C_InterController {
	
	public void extraInterTest() {
		// 1. 인터페이스는 다중 상속이 가능
		C_ChildInterImpl ci = new C_ChildInterImpl();
		C_ChildInter cinter = ci;
		C_ParentInter pi = ci;
		C_ParentInter2 pi2 = ci;
		
		// 2. 인터페이스 구현 클래스는 다수의 인터페이스 구현이 가능
		bark(new C_Chicken());
		fly(new C_Chicken());
		bark(new C_Turtle());
		fly(new C_Turtle());
		
		// 익명 클래스 활용하기
		// 재사용할게 아닌 일회용일 경우 생성 가능
//		FlyAble flyable= new FlyAble() {
//			@Override
//			public void fly() {
//				System.out.println("나도 날고 싶다");
//			}
//		};
//		fly(flyable);
		fly(new FlyAble() {
			@Override
			public void fly() {
				System.out.println("이거 하고 쉬는 시간");
			}
		});
		A_BasicInter basic = new A_BasicInter() {
			@Override
			public void test() {
			}
			
			@Override
			public double calc(int su, int su2) {
				return 0.0;
			}
			
			@Override
			public String printMsg(String msg) {
				return "";
			}
		};
		
		Animal a= new Animal("김춘식","회색",5.5,100,4,4) {
			@Override
			public void bark() {}
			@Override
			public void move() {}
			
		};
		System.out.println(a.getAge());
		System.out.println(a.getName());
		
		// 인터페이스에 선언된 추상메소드가 한개인 경우
		// FuncationalInterface
		// 람다표현식으로 처리가 가능
		fly2(()->{System.out.println("날아보자!");});
		// (매개변수)->{실행문}  ==> public void OOO(){}
		// ()->{return 값;} ==> public int OOO(){}
		// (data)->{} ==> public void OOO(String param){}
		// ()->10 ==> public int OOO(){}
		// data->data.length() ==> public int OOO(String data)
		
		MyFuntionalInter test = new MyFuntionalInter() {
			
			@Override
			public boolean test(String a) {
				return a.length()>5;
			}
		};
		test = (msg)->{return msg.charAt(0)=='자';};
		testString((s)->s.charAt(0)=='t');
		testString((s)->s.length()>10);
	}
	
	public void testString(MyFuntionalInter func) {
		if(func.test("test")){ 
			System.out.println("맞아");
		}else {
			System.out.println("아니야");
		}
	}
	
	
	public void fly2(FlyAble animal) {
			animal.fly();
	}
	
	public void fly(AnimalAble animal) {
		if(animal instanceof FlyAble) {
			((FlyAble)animal).fly();
		}else {
			System.err.println("날지 못하는 동물입니다.");
		}
	}
	
	public void bark(AnimalAble animal) {
		if(animal instanceof MoveAble) {
			((MoveAble)animal).bark();
		}else {
			System.err.println("울지 않는 동물입니다.");
		}
	}
}
