package com.aytuncbakir.oop.ch08.lecture07;

public class PassingParameters {
	
	int i = 4;
	
	public void method(int a) {  // a = x;
		a = 7;
	}
	
	public void  method(String a) {   // a = s;
		System.out.print("Yes, Strings are immutable, even if it is created with new:");
		a = new String("World!");
	}
	
	public void method2(PassingParameters pp){  // pp = p;
		pp.i++;
	}

}
