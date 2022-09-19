package com.aytuncbakir.oop.ch08.lecture05;


//Refactoring or Code Refactoring is defined as systematic process of improving existing computer code, 
	// without adding new functionality or changing external behaviour of the code
public class MethodDRY {
	
	
	// Methods have to be atomic
	
	//Instead of copy-paste, delete or cut-paste should be done.
	
	//Don't repeat yourself - DRY
	public int sum(int a , int b) {
		int result =0; 
		if(a > 0 & b > 0)			// 2
			result = a + b;
		System.out.println("Result = "+result);// 1
		
		return result;
		
	}
	
	public int sub(int a , int b) {
		
		int result =0; 
		if(a > 0 & b > 0)			// 2
			result = a - b;
		System.out.println("Result = "+result);//1
		
		return result;
		
	}
	
	public int mul(int a , int b) {
		
		int result =0; 
		if(a > 0 & b > 0) 				// 2
			result = a * b;
		System.out.println("Result = "+result);//1
		
		return result;
		
	}
	
	public double div(int a , int b) {
		double result = 0 ;
		if(a > 0 & b > 0)				// 2
			result = (double)a / b;
		System.out.println("Result = "+result);//1
		
		return result;
		
	}

}
