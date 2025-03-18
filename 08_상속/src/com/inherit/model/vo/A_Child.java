package com.inherit.model.vo;

public class A_Child extends A_Parent{// 3/17
	private String[] names;
	
	public A_Child() {
		super("우와!"); // child 생성 할 때 부모는 스트링 변수 받는 매개변수로 생성해
		// 상속 관계에 있을 때 부모가 생성될 때 자식이 무조건 생성되야함
	}
	
	public void ChildTest() {
		//getter / setter 를 이용해서 접근해야함
//		data = "안녕"; private
		setData("안녕");
		// protected 접근제한자는 자식 클래스에서 직접 접근이 가능
		weight = 65.5;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}


}
