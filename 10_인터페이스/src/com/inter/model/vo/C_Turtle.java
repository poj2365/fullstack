package com.inter.model.vo;

import com.inter.common.FlyAble;
import com.inter.common.MoveAble;
import com.inter.common.SwimAble;

public class C_Turtle extends C_Animal implements SwimAble, MoveAble{

	@Override
	public void move() {
		System.out.println("엉금엉금");
	}

	@Override
	public void bark() {
		System.out.println("뻐끔뻐끔");
	}

	@Override
	public void swimming() {
		System.out.println("?");
	}

	
}
