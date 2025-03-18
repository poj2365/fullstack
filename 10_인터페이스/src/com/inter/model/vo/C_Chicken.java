package com.inter.model.vo;

import com.inter.common.FlyAble;
import com.inter.common.MoveAble;

public class C_Chicken extends C_Animal implements FlyAble, MoveAble{
	
	@Override
	public void fly() {
		System.out.println("푸다닥!!");
	}

	@Override
	public void move() {
		System.out.println("성큼성큼");
	}

	@Override
	public void bark() {
		System.out.println("꼬끼오~");		
	}
	
}
