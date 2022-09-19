package com.aytuncbakir.oop.ch08.lecture02;

import com.aytuncbakir.oop.ch08.lecture01.WhatisClass;

public class ObjectVariables {
	
	public static int classVariable1 = 1;
	//......
	public static int classVariableN = 9;
	
	public int objectVariable1 ;   // field, property
	public String objectVariable2 ;
	public boolean objectVariable3 ; // primitive
	//......
	public boolean objectVariableN;
	public WhatisClass wic;         // complex
	
	// member variables = class variables  + object variables
	
	
	public ObjectVariables() {
		objectVariable2 = "ABCD";
	}
	
	public void method() {
		int localVariable = 5;
		//......
		String localVariableN = "Abcd";		
		System.out.println(localVariable + localVariableN);
		
	}
	
	private void method1() {
		objectVariable1 = 12;
	}
	
	private boolean method2() {
		return objectVariable3;
	}
	
	// How many object variables in this class?
	
	// Accessing the object look Test class

}
