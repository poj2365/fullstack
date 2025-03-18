package com.inter.model.vo;

import com.inter.common.A_BasicInter;

public class A_BasicInterImpl2 implements A_BasicInter{

	@Override
	public void test() {
		System.out.println("이제 곧 쉬는시간");
	}

	@Override
	public double calc(int su, int su2) {
		return su*su2;
	}

}
