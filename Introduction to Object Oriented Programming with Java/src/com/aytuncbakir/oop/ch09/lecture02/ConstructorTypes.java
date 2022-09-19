package com.aytuncbakir.oop.ch09.lecture02;

public class ConstructorTypes {
	
	private int field;

	// No-arg  : Dummy Constructor
	public ConstructorTypes() {
		
	}
	
	//Argument - Smart constructor
	public ConstructorTypes(int field) {
		this.field = field;
	}
	
}
