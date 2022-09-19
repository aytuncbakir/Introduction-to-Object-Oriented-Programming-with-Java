package com.aytuncbakir.oop.ch03.lecture09;

public class Conversions {
	
	/*
	 
	 	In Java, there are many primitive data types available with their corresponding wrapper classes.

		Next, let's compile a handy list of all possible lossy conversions in Java:
		
		short to byte or char
		char to byte or short
		int to byte, short or char
		long to byte, short, char or int
		float to byte, short, char, int or long
		double to byte, short, char, int, long or float
		
		Note that though short and char have the same size. 
		Still, the conversion from short to char is lossy because char is an unsigned data type.
	  
	 */
	
	public static void main(String[] args) {
		
		int a = 7;
		// int to long conversion
		long l = a;
		
		System.out.println(l);
		
		// imposible conversion
//		boolean b = 7;
		
		
		// byte and short signed but char unsigned
		byte by = 'c';
		short s = 'e';
		System.out.println(by);
		System.out.println(s);
		
		// byte and short signed but char unsigned
//		byte b1 = 100;
//		short s1 = 100;
//		char c = b1;
//		char c1 = s1;
		
		int x = 5;
		long l1 = x; // widening conversion
		
		long l2 = 12;
//		int x2 =l2;   // narrowing conversion
		
		double d = 3.21;
		int t = (int) d;
		System.out.println(t);
		
		float f = 3.14f;
		int z = (int) f;
		System.out.println(z);
		
		int i = 3456;
		double d1 = i;
		System.out.println(d1);
	}

}
