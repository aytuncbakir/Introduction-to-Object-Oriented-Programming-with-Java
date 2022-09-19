package com.aytuncbakir.oop.ch05.lecture6;

public class UnreachableCodeAndDeadCode {
	
	public static void main(String[] args) {
		unreachableCodeAndDeadCode();
		unreachableMethod();
		deadCodeMethod();
	}
	
	/*
	 * Unreachable code - code that will never be reached regardless of logic flow. 
	 * Difference is it's not executed.
	 * Code that due to other logic will never be executed. This is usually the sign of an error.
	 */
	private static int unreachableMethod() {
		int x = 5;
		int b = 3;
		int c = 4;
		int a;
		return x;

//		a = b + c;  // unreachable code
		
	}
	
	//Dead code - code that is executed but redundant, either the results were never used or 
	//adds nothing to the rest of the program. Wastes CPU performance.
	// Code that performs functions that have no effect. Basically stuff that wouldn't make a difference if removed.
	private static void deadCodeMethod() {
		 // dead code since it's calculated but not saved or used anywhere
//		int a = 5;
//		int b = 9;
		if(9 < 5)
			System.out.println();  // Dead code
		
	}

	private static void unreachableCodeAndDeadCode() {
		
		if(false)
			System.out.println();  // Dead code
		
		
//		while(false)
//			System.out.println();   // unreachable code
		
		return ;
//		System.out.println();		 // unreachable code
	}
}
