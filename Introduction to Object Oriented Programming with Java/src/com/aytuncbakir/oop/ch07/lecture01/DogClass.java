package com.aytuncbakir.oop.ch07.lecture01;

public class DogClass {

	// Class is a template. Abstraction - Generalization

	// attributes / properties : describes the object.  usually static properties
	public String type;
	public int legs;
	public String tail;

	public DogClass(String type) {
		super();
		this.type = type;
		this.legs = 4;
		this.tail = "moves";
	}

	// Behaviours
	public void bark() {  // Method : responsiblity, service or message
		System.out.println("Havv havv!");
	}

	public void run() {
		System.out.println("Run run run catch!");
	}

}
