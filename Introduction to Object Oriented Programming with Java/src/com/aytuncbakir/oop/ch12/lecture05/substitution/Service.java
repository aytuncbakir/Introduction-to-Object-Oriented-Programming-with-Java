package com.aytuncbakir.oop.ch12.lecture05.substitution;

public class Service {
	
	public void method(Parent parent) {
		System.out.println("Service is serving...!");
		parent.instanceMethod();
	}

}
