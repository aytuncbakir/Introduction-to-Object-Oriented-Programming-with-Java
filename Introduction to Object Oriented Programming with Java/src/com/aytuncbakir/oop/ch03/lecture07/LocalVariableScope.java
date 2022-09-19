package com.aytuncbakir.oop.ch03.lecture07;


// Instance Variable Scope is all Class
public class LocalVariableScope {
	
	public int a = 5;
	private int b;
	protected int c;
	int d;
	
	public void run() {
		method1();
		method2();
		method3();
		method4();
		
	}
	
	public void method1() {
		int a = 8;  // shadowing
		System.out.println(a);
	}
	
	private void method2() {
		int e = 9;
		b = 7;
//		if(true) {
//			int e = 5;
//		System.out.println(e);
//		}
		System.out.println(b);
//		System.out.println(e);
	}
	
	public void method3() {
		c = 3;
		if(true) {
			int g = 10;
		}
		System.out.println(c);
//		System.out.println(g);
	}
	
	public void method4() {
		d = 9;
		System.out.println(d);
	}

}
