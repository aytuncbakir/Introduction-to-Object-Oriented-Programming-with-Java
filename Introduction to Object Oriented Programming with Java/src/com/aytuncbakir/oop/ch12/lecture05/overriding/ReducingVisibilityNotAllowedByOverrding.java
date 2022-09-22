package com.aytuncbakir.oop.ch12.lecture05.overriding;


public class ReducingVisibilityNotAllowedByOverrding {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.f();
		System.out.println(p.publicValue);

		Child c = new Child();
		c.f();
//		System.out.println(c.i);
	}
}

class Parent {
	public int publicValue = 8;

	public void f() {
	}
}

class Child extends Parent {
	private int publicValue = 9;  // public to private OK!

	public void f() {  // that is possible
	}
//	
	// it is not possible to reduce visibility which is defined in Parent
//	private void f() {   // that is not possible
//	}
	
//	protected void f() {  // that is not possible
//	}
//	
//	void f() {  // that is not possible
//	}
	
}
