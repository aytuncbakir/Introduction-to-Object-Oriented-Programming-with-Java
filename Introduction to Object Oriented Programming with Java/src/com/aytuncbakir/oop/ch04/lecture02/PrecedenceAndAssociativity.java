package com.aytuncbakir.oop.ch04.lecture02;

import com.aytuncbakir.oop.ch03.lecture08.Student;

public class PrecedenceAndAssociativity {
	
	 

	public static void main(String[] args) {
		
		int sum = 3 + 7 * 8 ;  // 3 + (7 * 8)  => 3 + 56 => 59  => Precedence
		
		int x; 
		int y;
		int z;
		x = y = z = 5;  // x = ( y = ( z = 5) )  Associativity - Evaluation order
		
		
		// islecler calismadan önce tum islenenler islenir.
		int sum1 = (3 * 5 ) + (3 * 4 - 1);
		System.out.println(sum1);
		
		// &&, || ve ?: islecleri istisnadir. Cunku bu isleclerin bazen islenenleri islenmez .
		boolean a = false && true;
		boolean b = true || false;
		boolean c = 3 > 4 ? true : false;
		System.out.println(a + " " + b + " " + c);
		
		int t = 8; // From right to left
		
		t = t++; // From right to left
		t = t--; // From right to left
		
		t = ++t; // From left to right
		//The assignment to variable t has no effect
		
		// x = y = z = 4    => x = (y = (z = 4)) // From right to left
		
		// From left to right: The same meaning
		//x + y + z and (x + y) + z
		//x – y – z and (x - y) - z
		
		// From left to right
		new Student().addCourse("");
		(new Student()).addCourse("");
		
	}

}
