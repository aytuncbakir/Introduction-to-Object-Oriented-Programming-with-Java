package com.aytuncbakir.oop.ch08.lecture06;

public class VarArgsMethods {
	
	//the number of parameters of a method is called "arity".
	void sum(int a, int b) {}  				//2
	void sum(int a, int b, int c){}			//3
	void sum(int a, int b, int c, int d){}	//4
	void sum(int a, int b, int c, int d, int e ) {}   // ,int z  //5
	
	

	void run() {
//		sum(1, 2, 3, 4, 5, 6);  //6
//		sum(1, 2, 3, 4, 5, 6, 7);  //7
		int[] arr = {1,2,3,4,5,6,7,8};
		sum(arr);
		
	}
	
	// variable arity method   -  var-args methods
//	void sum (int ...numbers) {}
	
	
	// double parameter ok
	void sum (double ...numbers) {}
	//array
	void sum (int[] numbers) {}
	
	// varargs method ve sum imzalari ayni olacak sekilde kullanilamaz neden??? Focus on  parameter;
	

}
