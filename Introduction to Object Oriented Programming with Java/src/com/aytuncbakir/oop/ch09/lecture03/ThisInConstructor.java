package com.aytuncbakir.oop.ch09.lecture03;

public class ThisInConstructor {
	
	public static void main(String[] args) {
		
	}
}

class Cat{
	
	private String name;
	private String type;
	private int age;
	
	
	public Cat(String name, String type, int age) {
//		this(name, type);  // not allowed
	}
	
	public Cat(String name, String type) {
//		this(name, type, 5);  // not allowed
	}
	
	public Cat(String name) {
//		System.out.println("Constructor call 'this()' must be the first statement in a constructor");
//		this(name, "Cat", 5);   inside a costructor have to be if only if one this()
		this(name, 5);   // Recursive constructor invocation Cat(String, int)
	}
	
	public Cat(String name, int age) {
//		this(name);  // Recursive constructor invocation Cat(String)
	}
	
	public void method(String name, String type) {
//		this(name, type);  // not allowed, 'this()' Constructor call can be only in a Constructor
	}
	

}
