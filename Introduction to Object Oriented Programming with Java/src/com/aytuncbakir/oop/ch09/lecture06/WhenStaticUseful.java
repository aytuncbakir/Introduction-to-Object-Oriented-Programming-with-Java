package com.aytuncbakir.oop.ch09.lecture06;

import com.aytuncbakir.oop.ch03.lecture08.Student;

public class WhenStaticUseful {
	
	
	public static void main(String[] args) {
		
		//If there is no point in creating an object and only one 
		//object will be created even if it is, then static should be used.
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.addExact(4, 5));
		
		// Think business objects; Employee, Customer and Student. All of them has lots of instance
		// anD all them has own properties. So in these conditions it makes sense to create an object.
		
		Student efe = new Student("Efe Can", "345");
		Student ece = new Student("Ece Pat", "247");
		 // ...
		Student cem = new Student("Cem Cenk", "168");
		
		/*
		 *  -- Utility Class --- 
		  java.lang.Math
		  java.lang.System
		  java.util.Arrays
		  java.util.Collections
		  
		  These classes have utility methods (static methods)
		  
		  */
		
	} 

}
