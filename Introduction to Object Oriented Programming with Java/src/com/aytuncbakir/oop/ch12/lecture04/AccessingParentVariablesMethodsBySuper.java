package com.aytuncbakir.oop.ch12.lecture04;


	// static methods can be hide
	// instance methods can be override

public class AccessingParentVariablesMethodsBySuper {

	public static void main(String[] args) {
		Child child = new Child();
		child.printDetailInfo();
	}
}

class Parent {
	static int i = 7;
	int j = 9;

	static void staticMethod() {
		System.out.println("in staticMethod() of Parent");
	}
	
	 void instanceMethod() {
		System.out.println("in instanceMethod() of Parent");
	}
}

class Child extends Parent {
//	static int t = 2 * super.i; // Can't say this!
//	static double t = 2 * i; // Can't do this because it is a forward reference!
	static double t = 2 * Parent.i;
	static double i = 17d;
	int j = 19;
	int k;
	int l;
	int m = 2 * super.i; // Unethical access: Prefer Parent.i
	
	static
	{
//		i = 2 * super.j; // Can't use super in a static context!
	}
	
	{
		k = super.j;
	}

	public Child() {
		l = 2 * super.j;
	}
	
	static void staticMethod() {
		System.out.println("in staticMethod() of B");
//		super.f(); // Can't use super in a static context!
//		Parent.f();	// That's ok.
	}
	
	public void printDetailInfo() {
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("k: " + k);
		System.out.println("l: " + l);
		System.out.println("m: " + m);
		System.out.println("t: " + t);
		System.out.println("super.i: " + super.i);
		
		System.out.println();
		
		staticMethod();
		this.staticMethod(); // Unethical access: Prefer f()
		Parent.staticMethod(); // Unethical access: Prefer Parent.f()
		
		System.out.println();
		
		super.staticMethod();
		Parent.staticMethod();
		
		System.out.println();
		
		Parent p = new Parent();
		p.instanceMethod();
		super.instanceMethod();
		
//		receiveParent(super); // Can't do this!
//		receiveParent(this.super); // Can't do this!
	}
	
	void receiveParent(BaseClass p){
		System.out.println("in receiveParent()");
	}
	
//	Parent getParent(){
//		return super; // Can't do this!
//	} 
}