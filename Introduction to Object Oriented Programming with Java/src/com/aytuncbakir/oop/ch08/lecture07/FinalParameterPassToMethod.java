package com.aytuncbakir.oop.ch08.lecture07;

public class FinalParameterPassToMethod {
	
	public void increase(final int newValue){
//		newValue = newValue+1; // Compile-time error.
		System.out.println(newValue);
	}
	public void assignNewValue(final String newValue){
//		newValue = "World"; // Compile-time error.
		System.out.println(newValue);
	}
	
	public void decrease(int newValue){  // newValue = assigned value;
		newValue = newValue-1; // Compile-time error.
		System.out.println(newValue);
	}

}
