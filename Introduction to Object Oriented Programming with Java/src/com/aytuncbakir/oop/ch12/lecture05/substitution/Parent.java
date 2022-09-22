package com.aytuncbakir.oop.ch12.lecture05.substitution;


public class Parent {
	protected int i = 6;
	protected boolean b = true;
	protected static String s = "Parent";
	
	public static void staticMethod(){
		System.out.println("staticMethod() in Parent");
	}
	
	public void instanceMethod() {
		System.out.println("instanceMethod() in Parent");
	}
}
