package com.variable.controller;

public class C_Overflow {
	public static void main(String[] args) {
		byte bnum = 100;
		for(int i = 0; i<10000; i++) {
			System.out.println(bnum++);
		}
	}
}

