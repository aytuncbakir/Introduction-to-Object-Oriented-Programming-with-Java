package com.aytuncbakir.oop.ch12.lecture03.initializationorder;

public class AAA {
	
	public int x;
	public static int a;
	public int aa;
	
	static {
		a = 5;
		System.out.println("class AAA - in static initialization block - public static int a: "+a);
	}
	
	{
		aa = 5;
		System.out.println("class AAA - in instance initialization block - public int aa: "+aa);
	}

	public AAA(int x) {
		this.x = x;
		//System.out.println(" in constructor AAA(int x)");
	}
	
}
