package com.generic.model.vo;

public class GenericTest<T> {
	private T dydata;
	private String data;
	
	public GenericTest() {
		// TODO Auto-generated constructor stub
	}

	public GenericTest(String data, T dydaaa) {
		super();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public T getDydata() {
		return dydata;
	}

	public void setDydata(T dydata) {
		this.dydata = dydata;
	}
	
	// extends : 상한선
	// super : 하한선
//	public GenericTest<? extends Person> getTest() { // ? 는 제네릭 타입으로 받을건데 어떠한 객체가 들어오든 상관 없다
	public GenericTest<? super Student> getTest() {
		return new GenericTest<Person>();
	}
}
