package com.poly.controller;

import java.util.Scanner;

import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Dog;

public class AnimalController {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		System.out.println("=== 동물울음소리 ===");
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		System.out.println("3. 돼지");
		System.out.println("4. 호랑이");
		System.out.print("입력 : ");
		int choice = sc.nextInt();
		Animal a =null;
		switch (choice) {
		case 1: 
			a= new Cat();
			break;
		case 2: 
			a= new Dog();
			 break;
//		case 3: 
//			a= new Pig();
//			 break;
//		case 4: 
//			a= new Tiger();
//			 break;
		default:
		}
		animalBark(a); 
	}
	}
	
	public void animalBark(Animal a) {
		a.bark();
	}

}
