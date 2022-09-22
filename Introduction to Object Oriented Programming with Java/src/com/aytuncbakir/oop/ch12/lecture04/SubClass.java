package com.aytuncbakir.oop.ch12.lecture04;


public class SubClass extends BaseClass {
	protected int i; 	// Hiding i of Parent
	protected byte b;	// Hiding b of Parent
	protected double d;
	
	public SubClass() {
		
	}

	public SubClass(int i1, boolean b1, int i2, byte b2, double d) {
//		super(i1, b1);
		super();
		super.i = i1;
		super.b = b1;
		i = i2;
		b = b2;
		this.d = d;
	}

	/**
	 * This is hiding.
	 * Remove "static" keyword and try to override a static method in parent. It is an error!
	 */
	public static void staticMethod() {
		System.out.println("staticMethod() in Child");
	}
	
	public void instanceMethod() {
		System.out.println("instanceMethod() in Child");
	}
	
	// When static is removed from staticMethod() it tries to override static method pf Parent.
//	public void staticMethod() {
//		
//	}
	
	/**
	 * A static method in the child class can't hide an instance method of the parent class.
	 */
//	public static void staticMethod() {
//		System.out.println("staticMethod() in Child");
//	}

	/**
	 * This is not hiding, this is overriding.
	 */
	public void printInfo() {
		System.out.println("\nChild Info: ");
		System.out.println("i: " + i);
		System.out.println("super.i: " + super.i);
		System.out.println("b: " + b);
		System.out.println("super.b: " + super.b);
		System.out.println("d: " + d);
		staticMethod();
		System.out.println();
		super.staticMethod();
		BaseClass.staticMethod();
	}
	
	public void printInfoUsingSuper() {
		System.out.println("\nChild Info Using Super: ");
		System.out.println("i: " + i);
		System.out.println("b: " + b);
		System.out.println("d: " + d);
		staticMethod();
		
		super.printInfo();
	}
}
