package com.aytuncbakir.oop.ch12.lecture04;

public class BasicHidingExample {
	
	public static void main(String[] args) {
		B b = new B();
		b.staticMethod();
		b.instanceMethod();
		System.out.println(b.a);
		
		System.out.println("-----------------------");
		b.printInfo();
		
	}

}


class A{
	
	public static int a =  5;
	public  int b =  4;
	
	public static void staticMethod() {
		System.out.println("static method in A");
	}
	
	public  void instanceMethod() {
		System.out.println("instance method in A");
	}
	
	public void printInfo() {
		System.out.println("Class A -- a: "+a);
		System.out.println("Class A -- b: "+b);
		
	}
	
}

class B extends A{
	
	public static int a = A.a +15;  // you can not do this super.a
	public  int b = super.b + 5;
	
	// hiding
//	public static void staticMethod() {
//		System.out.println("*******************************");
//		System.out.println("static method in B");
//		System.out.println("*******************************");
//	}
	
	//overriding
//	public  void instanceMethod() {
//		System.out.println("*******************************");
//		System.out.println("instance method in B");
//		System.out.println("*******************************");
//	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Class B -- a: "+a);
		System.out.println("Class B -- b: "+b);
//		System.out.println("Class A -- a: "+super.a);
//		System.out.println("Class A -- b: "+super.b);
		
	}
}
