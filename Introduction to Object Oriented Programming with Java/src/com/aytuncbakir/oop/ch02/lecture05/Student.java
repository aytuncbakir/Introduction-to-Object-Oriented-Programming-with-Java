package com.aytuncbakir.oop.ch02.lecture05;

public class Student {

	public String name;
	
	public Student() {
		
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello! My name is "+ name);
	}
	
	@Override
	public String toString() {
		return "Student []";
	}
	
}
