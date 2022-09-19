package com.aytuncbakir.oop.ch09.lecture09;

public class FinalInitializationExample {

	public static void main(String[] args) {

	}
}

class FinalVariables {

	final int a;
	String stringsFinal;
	
	static final int s;
	
	{
		a = 3;  // instance variable can initialize instance block
	}
	
	static
	{
		s = 17; // Blank finals (static) have to be initialized in static block.
	}

	FinalVariables() {
		this(5);
//		s = 13;  //  can not do that
//		a = 12;   
	}

	public FinalVariables(int a) {
//		s = 13;   //  can not do that
//		this.a = a;
	}

	public FinalVariables(String stringsFinal) {
		this.stringsFinal = stringsFinal;
//		a = 12;
	}
}
