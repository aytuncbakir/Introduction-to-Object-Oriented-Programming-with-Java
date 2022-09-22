package com.aytuncbakir.oop.ch12.lecture03.initializationorder;

public class BBB extends AAA{

	public int x;
	public static int b;
	public int bb;
	
	static {
		b = 8;
		System.out.println("class BBB - in static initialization block - public static int b: "+b);
	}
	
	{
		bb = 8;
		System.out.println("class BBB - in instance initialization block - public int bb: "+bb);
	}
	
	
	public BBB(int x) {
		super(x);
		//System.out.println("In Constructor BBB(int x)");
	}

}
