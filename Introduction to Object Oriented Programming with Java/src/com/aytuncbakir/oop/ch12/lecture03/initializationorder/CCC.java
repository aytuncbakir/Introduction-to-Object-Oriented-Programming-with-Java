package com.aytuncbakir.oop.ch12.lecture03.initializationorder;

public class CCC extends BBB{

	public int x;
	public static int c;
	public int cc;
	
	static {
		c = 10;
		System.out.println("class CCC - in static initialization block - public static int c: "+c);
	}
	
	{
		cc = 10;
		System.out.println("class CCC - in instance initialization block - public int cc: "+cc);
	}
	
	
	public CCC(int x) {
		super(x);
		//System.out.println("In Constructor CCC(int x)");
	}
}
