package com.inherit.controller;

import com.inherit.model.vo.C_Cat;
import com.inherit.model.vo.C_Dog;

public class C_OverrideController {
	public void overvideTest() {
		C_Dog dog = new C_Dog();
		dog.setName("덕만이");
		dog.setAge(7);
		dog.setWeight(5.5);
		dog.move();
		dog.bark();
		
		C_Cat cat = new C_Cat();
		cat.setName("김춘식");
		cat.setAge(4);
		cat.setWeight(6.1);
		cat.move();
		cat.bark();
		
	}

}
