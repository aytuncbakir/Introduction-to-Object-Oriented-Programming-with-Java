package com.aytuncbakir.oop.ch08.lecture05;

//Refactoring or Code Refactoring is defined as systematic process of improving existing computer code, 
// without adding new functionality or changing external behaviour of the code
public class MethodSRP {
	
	// Methods have to be atomic
	
	// Ideal method should include 15-20 statements, 7-8 decisions and  2 arguments
	
	// Single Responsibility Principle - SRP
	public int method1(int a , int b) {
		int bigger = 0;
		if(a > 0 & b > 0) {   // 1
			bigger = a > b ? a : b; //2
		}
		
		int sum = a + b; //3
		System.out.println(a + "+" + b + " = "+ sum);//4
		
		return bigger;
		
	}
}
