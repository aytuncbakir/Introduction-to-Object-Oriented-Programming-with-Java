package com.aytuncbakir.oop.ch08.lecture07;

public class Test {
	public static void main(String[] args) {
		PassingParameters pp = new PassingParameters();
		
		int x = 3;
		pp.method(x);
		System.out.println(x);
		
		pp.method2(pp);
		System.out.println(pp.i);
		
		
		String s = new String("Hello");
		pp.method(s);
		System.out.println(" "+ s);
		
		
		
	}

}
