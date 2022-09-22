package com.aytuncbakir.oop.ch12.lecture03.initializationorder;

public class Test {
	
	/*
	
	Initialization order is from parent to child. From top to down. 
	
	Initialization in each class is like
	 - Class variable (and static initialization blocks)
	 - If an object is creating
		- Instance variable (and instance initialization blocks)
	- Constructor call
	
	*/
	
	public static void main(String[] args) {
		
		AAA aaa = new AAA(11);
		System.out.println("*************************************************");
		BBB bbb = new BBB(22);
		System.out.println("*************************************************");
		CCC ccc = new CCC(33);
		
	}

}
