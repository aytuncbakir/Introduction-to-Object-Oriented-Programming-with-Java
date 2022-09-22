package com.aytuncbakir.oop.ch12.lecture05.substitution;


public class Child extends Parent {
//	protected int i = 9;	// Hiding b of Parent
//	protected boolean b = false;	// Hiding b of Parent
//	protected static String s = "Child"; // Hiding s of Parent
	
	private int i = 9;	// Hiding i of Parent
	private boolean b = false;	// Hiding b of Parent
	private static String s = "Child";
	
	public static void staticMethod(){
		System.out.println("staticMethod() in Child");
	}
	
	public void instanceMethod() {
		System.out.println("instanceMethod() in Child");
	}
}
