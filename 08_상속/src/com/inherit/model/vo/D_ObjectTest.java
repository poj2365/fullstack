package com.inherit.model.vo;

import java.util.Objects;

public class D_ObjectTest {
	private int no;
	private String name;
	
	@Override
	public String toString() {
		return no + " "+ name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// this 값, 매개변수 객체와 비교
		D_ObjectTest param = (D_ObjectTest)obj;
		// 동등한 값에 대한 기준을 설정
		if(this.no==param.no && this.name.equals(param.name)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(no,name);
	}
	
	@Override
	public D_ObjectTest clone() {
//		return this; // 얕은 복사
		return new D_ObjectTest(no,name); // 깊은 복사
	}
	
	public void test(int a) {
		
	}
	
	public D_ObjectTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public D_ObjectTest(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
