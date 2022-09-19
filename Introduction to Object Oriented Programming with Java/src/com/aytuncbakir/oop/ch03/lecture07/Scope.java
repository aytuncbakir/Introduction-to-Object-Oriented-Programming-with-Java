package com.aytuncbakir.oop.ch03.lecture07;

// Javada static scoping / lexical scoping  -- compile time da belirlenir ve degistirilemez
// the biggest scope is class scope
public class Scope { // start of Class scope
	
	public void method() { // start of method scope
		
		if(true) {// start of if scope
			
		}// end of if scope
		
		
	}// end of method scope

}// end of Class scope
