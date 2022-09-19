package com.aytuncbakir.oop.ch09.lecture01;

public class AllClassHasAtLeastOneConstructor {
	
	// It can not be a constructor in Java Source File
	// But there is a constructor in "class" file
	// If there is no constructor in the java source file, compiler provide a default constructor.
	
	public void method() {
		AllClassHasAtLeastOneConstructor a = new AllClassHasAtLeastOneConstructor();
		
//		Human human = new Human();
	}

}
