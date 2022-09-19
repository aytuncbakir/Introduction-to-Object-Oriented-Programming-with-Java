package com.aytuncbakir.oop.ch09.lecture05;

import com.aytuncbakir.oop.ch09.lecture06.Constants;

public class ThisMore {
	
	public static void main(String[] args) {
		A a1  = new  A();
		a1.method(5);     	// as if a1.method(a1,5);
		
		A a2  = new  A();
		a2.method(7); 		// as if a2.method(a1,5);
		

		
	}
}

class A{
	
	int i;
	void method(int i) {
		System.out.println(i);
	}
}
