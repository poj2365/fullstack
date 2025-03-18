package com.inter.model.vo;

import com.inter.common.A_BasicInter;

public class A_BasicInterImpl implements A_BasicInter{

	@Override
	public void test() {
		System.out.println("나는 구현체");
	}

	@Override
	public double calc(int su, int su2) {
		return su/su2;
	}

	public void myMethod() {
		System.out.println("내꺼야");
	}
	
	@Override
	public String printMsg(String msg) {
		return "내가 다시 만들었어 "+msg;
	}
}
