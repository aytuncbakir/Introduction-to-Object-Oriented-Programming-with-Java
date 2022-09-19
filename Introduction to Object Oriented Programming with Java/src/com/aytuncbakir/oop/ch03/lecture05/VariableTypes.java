package com.aytuncbakir.oop.ch03.lecture05;

public class VariableTypes {
	
	// There are 3 types of variable
	// Instance (object) variables
	// Class variables
	// Local Variables
	
	/*
	 Instance variables in Java are non-static variables 
	 	which are defined in a class outside any method, constructor or a block.
	*/
	public int id;
	public String name;
	
	/*
	 Class variables also known as static variables are declared with the static keyword in a class, 
	 	but outside a method, constructor or a block.
	 */
	public static int count = 0;
	public static final  String capital= "Ankara";
	
	
	
	public void classMethod() {
		/*
		 Local variables are created when the method, constructor or block is entered 
		 	and the variable will be destroyed once it exits the method, constructor, or block.
		 */
		int x;  // public int x; ???
		int y;
		String s;
	}

}
