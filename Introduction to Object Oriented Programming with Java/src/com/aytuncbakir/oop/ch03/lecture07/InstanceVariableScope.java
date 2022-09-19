package com.aytuncbakir.oop.ch03.lecture07;


// Instance Variable Scope is all Class
public class InstanceVariableScope {
	
	public int a;
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
		a = 5;
		System.out.println(a);
	}
	
	private void method2() {
		b = 7;
		System.out.println(b);
	}
	
	public void method3() {
		c = 3;
		System.out.println(c);
	}
	
	public void method4() {
		d = 9;
		System.out.println(d);
	}

}
