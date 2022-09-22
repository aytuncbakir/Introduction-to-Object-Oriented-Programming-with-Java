package com.aytuncbakir.oop.ch12.lecture04;


public class BaseClass {
	protected int i;
	protected boolean b;
	
	public BaseClass() {
		
	}
	
	public BaseClass(int i, boolean b) {
		this.i = i;
		this.b = b;
	}
	
	protected static void staticMethod(){
		System.out.println("staticMethod() in Parent");
	}
	
	public void instanceMethod() {
		System.out.println("instanceMethod() in Parent");
	}
	
	protected void printInfo() {
		System.out.println("\nParent Info: ");
		System.out.println("i: " + i);
		System.out.println("b: " + b);
		staticMethod();
		BaseClass.staticMethod();
	}
}
