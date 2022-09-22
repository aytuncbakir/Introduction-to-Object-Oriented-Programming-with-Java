package com.aytuncbakir.oop.ch12.lecture04;

public class StaticOverridingExample {

	public static void main(String[] args) {
		
		BaseClass.staticMethod();
		SubClass.staticMethod();
		
		System.out.println();
		
		BaseClass b = new SubClass();
		b.staticMethod();
		b.instanceMethod();
		
//		SubClass b2 = new SubClass();
//		b2.staticMethod();
	}
}
