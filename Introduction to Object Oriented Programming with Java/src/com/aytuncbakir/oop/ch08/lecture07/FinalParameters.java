package com.aytuncbakir.oop.ch08.lecture07;

public class FinalParameters {
	
	public static void main(String[] args) {
		final int a = 7;
//		a = 12; // Compile-time error.
		
		final String s = "Hello";
//		s = "Hello world!"; // Compile-time error.
		
		final int blankFinal; // Blank final is ok.
		blankFinal = 5;
//		blankFinal = 8; // Compile-time error.
		
		final String sBlankFianl; // Blank final is ok.
		sBlankFianl = "Hello";
//		sBlankFianl = "Hello world!"; // Compile-time error.
		
		
		//passing final parameter to method
		FinalParameterPassToMethod finalParameterPassToMethod = new FinalParameterPassToMethod();
		finalParameterPassToMethod.increase(4);
		finalParameterPassToMethod.assignNewValue("Hello!");
		
		int x = 14;
		finalParameterPassToMethod.increase(x);
		
		
		String s1 = "Hi";
		finalParameterPassToMethod.assignNewValue(s1);
		
		String s2 = "Good morning!";
		finalParameterPassToMethod.assignNewValue(s2);
		
		final int y = 5;
		finalParameterPassToMethod.decrease(y);
		System.out.println(y);
	}
	
	
	
	

}
