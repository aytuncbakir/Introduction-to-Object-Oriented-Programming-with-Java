package com.aytuncbakir.oop.ch03.lecture06;

public class DefiningVariableByVar {
	
	// var is not a keyword, it is a reserved word
	//var v = "Instance-Member variable"; // is not allowed
	
	// var is only allowed to define local variables
	
	public static void main(String[] args) {
		// Type inference
		var i = 5;  // primitive OK
		
		//var x;   // error // not allowed to declare
		
		var student = new Student();  // Complex OK;
	}
	
	public void method( /* var arg */) {  // not allowed to declare
		// allowed to define
		var v = 1.2;
	}
	

}
