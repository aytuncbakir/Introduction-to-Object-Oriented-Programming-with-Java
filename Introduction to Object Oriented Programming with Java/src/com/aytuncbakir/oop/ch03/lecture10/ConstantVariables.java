package com.aytuncbakir.oop.ch03.lecture10;

import com.aytuncbakir.oop.ch03.lecture08.Student;

public class ConstantVariables {

	public static void main(String[] args) {
		
		final int i = 8;  // Constant variable
		System.out.println(i);

		// Illegal : The final local variable i cannot be assigned. It must be blank and not using a compound assignment
//		 i = 5;
//		i--;
//		i *= 2;
//		i /= 2;
//		 i++;

		// Legal
		final long j; // Blank final but it is not a constant variable
		j = 8;
//		j = 8; // illegal
		System.out.println(j);
		
		// constant expressions
		final boolean b = false && true;
		final int sum = 1 + 23 + 45 * 4;
		System.out.println("sum: " + sum);
		final float f = (float) (3 * Math.PI) / 4;
		final double d = 3.0 * Math.PI;
		
		
		final String s1 = "Hello world!"; // Constant variable!
		final String s2 = "Welcome to " + "Finland";	// Constant variable!
		
		final String s3 = new String("Hei hei!"); // Not a constant variable!
		
//		That is ok.
		int a = 5;
		int c = 9;
		final int z;  // Blank final but not a constant variable

		if (a < c)
			z = a;
		else
			z = c;
		System.out.println(z);
		
		// Burada ki sabitlik atanan deger acisindan sabitlik. Nesneler constant olamaz.
		// cunku nseneler heapte olusturulur
		// constant degerler ise JVMin belirledigi bir havuza (pool) konur.
		final Student st1 = new Student();  // Not a constant variable
//		st1 = new Car();
		
		final Student st2; // Blank final, not a constant variable
		st2 = new Student();
//		st2 = new Student();
	}
}
