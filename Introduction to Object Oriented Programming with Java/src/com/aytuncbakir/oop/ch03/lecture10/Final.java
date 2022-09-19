package com.aytuncbakir.oop.ch03.lecture10;

import com.aytuncbakir.oop.ch03.lecture08.Student;

public class Final {
	
	public static void main(String[] args) {
		// final's mean is to create a constant variable
		// after definition you can not change the value which is given.
		
		//primitive final
		final int x = 10;
//		x = 12;  // try to change
		
		final int y;
		y = 5; //  No compiler error is given.
//		y = 7; // Compiler error : The final local variable y may already have been assigned
		
		// final reference shows only one object which is assigned first
		final Student student = new Student();
//		student = new Student(); // Compile time error: he final local variable student cannot be assigned. 
														//It must be blank and not using a compound assignment
		
		final Student student1;
		student1 = new Student(); // it is ok. it can be initialize after devlaration.
//		c = new Car();
		
		
		
	}

}
