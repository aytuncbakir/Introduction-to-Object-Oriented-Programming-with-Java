package com.aytuncbakir.oop.ch03.lecture03;

public class NullReference {
	
	public static void main(String[] args) {
		
		Student student = new Student("Efe Can", "123");
		
		 student = null;
		
		// student artik bir null reference.  
		// null ile dereferencing yapilir.  dereferencing?
		// Eger olusturulan nesneyi gösteren baska bir referans yoksa artik nesne "lost object"tir.
		// bu nesne daha sonra GC tarafindan temizlenir bu sekilde "memory leak"in önune gecilir.
		
//		System.out.println(student.name); // NullReference
		
		// Cözum
		if(student != null)
			System.out.println(student.name);
		else
			System.out.println("Null reference");
			
		
	}
	
	public int function(){
		int x, a, b,c;
		x = 5;
		
		Student student = new Student("Efe Can", "123");
		 student = StudentFactory.createStudent();//student = null;
		if(student != null)
			System.out.println(student.name);
		else
			System.out.println("Null reference");
		
	    return x;

	    // unreachable code since returned
//	    a = b + c;
	}

}

/*
Dead code is code that will never be executed, e.g.

boolean b = true
if (!b) {
   .... 
   // dead code here
}

*/

// https://en.wikipedia.org/wiki/Unreachable_code
// https://en.wikipedia.org/wiki/Dead_code


