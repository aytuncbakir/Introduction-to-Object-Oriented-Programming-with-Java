package com.aytuncbakir.oop.ch04.lecture02;

public class OperatorOverloading {
	
	public static void main(String[] args) {
		
		// There is ni  operator overloading in Java.
		
		
		// But + is overloaded
		int x = 3  + 9 ;
		System.out.println(x);
		
		// String concat
		String s = "Hello " + " World!";
		System.out.println(s);
		
		int t = 'a' + 'b';
		System.out.println(t);
		
		String s1 = "Ahme" + 't';
		System.out.println(s1);
		
		int k = 'c' + 54;
		System.out.println(k);
		
		// also & and | is overloaded
		int a = 1 & 2;
		System.out.println(a);
		a = 1 | 2;
		System.out.println(a);
		
		boolean z = true & false;
		System.out.println(z);
		z = true | false;
		System.out.println(z);
		
	}

}
