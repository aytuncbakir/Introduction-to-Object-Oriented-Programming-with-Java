package com.aytuncbakir.oop.ch10.lecture01;

import com.aytuncbakir.oop.ch10.lecture02.ClassesWithSameName;


import com.aytuncbakir.oop.ch09.lecture01.Boss;  // close this
//import com.aytuncbakir.oop.ch09.*; // open this observe line 19 - Boss boss = new Boss();

// if only an if package and import can be out of class

public class ClassImport {
	
	public static void main(String[] args) {
		
		// in same package
		CompileClass compileClass = new CompileClass();
		
		// import all
		Boss boss = new Boss();
		
		
		
		// in different package
//		com.aytuncbakir.oop.ch10.lecture02.ClassesWithSameName c= 
//				new com.aytuncbakir.oop.ch10.lecture02.ClassesWithSameName();
		
		// in different package
		ClassesWithSameName c = new ClassesWithSameName();
		c.whoAmI();
	}

}
