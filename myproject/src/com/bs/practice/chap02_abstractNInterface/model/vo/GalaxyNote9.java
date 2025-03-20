package com.bs.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	public GalaxyNote9() {
		this.setMaker("삼성");
	}
	
	public String makeCall() {
		return null;
	}
	
	public String takeCall() {
		return null;
	}
	
	public String picture() {
		return null;
	}
	
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String printInformation() {
		return "갤럭시 노트9 은"+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n"+makeCall()+"\n"+takeCall()
		+"\n"+picture()+"\n"+charge()+"\n"+touch()+"\n"+"블루투스펜 탑재 여부"+bluetoothPen();
		
	}



}
