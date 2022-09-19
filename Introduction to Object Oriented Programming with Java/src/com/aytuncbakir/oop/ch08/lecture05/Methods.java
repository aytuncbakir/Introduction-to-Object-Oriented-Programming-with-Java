package com.aytuncbakir.oop.ch08.lecture05;

import java.util.ArrayList;
import java.util.List;

public class Methods {
	
	/* <modifier/modifiers> <return type> <name>(<Parameter/Parameters>) throws <exception/exceptions>* {
		<statement / statements>*
	} */
	
	
	
	public int sum(int x, int y) {  // x and y method parameters
		int s =  x + y;
		return s;
	}
	
	public void print() { // there is not any formal parameter 
		System.out.println("Methods can not return a value!");
	}
	
	// Access to object's method
	public void run() {
		Methods m = new Methods();
		m.sum(3, 7);
		m.print();
	}
	
	public int multiply(int x, int y) {  // x and y method parameters  (Formal parameter)
		int mul =  x * y;
		return mul;  // return value
	}
	
	public void callMethod(Methods m) {  // m is a method parameter (Formal parameter)
		m.multiply(4, 5);    // 4, 5 are arguments - actual parameter
		m.sum(6, 9);		// 6, 9 are arguments - actual parameter
		m.print();			// there is not any actual argument  
	}
	
	
	public int square(int x) {
		return x * x;
	}
	  
	public void method5(Methods m) {  
		int result = m.multiply(4, 5);    
		System.out.println(result);
		result = m.sum(6, 9);		
		System.out.println(result);
		// if wo do not care return value, we can not hold it anywhere
		m.square(4); //(calling a method for its side effect)
	}
	
	// methods can return if and only if one value
	public Methods method6() {
		Methods m = new Methods();
		return m;  // return value may be an object
	}
	
	
	public List<Methods> method7() {
		List<Methods>  list  = new ArrayList<Methods>();
		return list;  // return value may be objects
	}
	
	// Method returns a value if a return value is waited from place which method is called 
	// If return value is meaningful returns a value
	public double calculate(int amount, int tax) {
		double d = amount + (amount * tax / 100);
		return d;
	}
	
	// If return value is not meaningful method returns nothing
	public void print1() { // there is not any formal parameter 
		System.out.println("Print result!");
	}
	
	public void set() { // there is not any formal parameter 
		System.out.println("Value setted!");
	}
	
	public void method8() {//-> start of implementation / method bodt
		 // statement / statements;
	
		}// -> end of implemantation / method body
	
	public double interest() {
		return 8;
	}

}
