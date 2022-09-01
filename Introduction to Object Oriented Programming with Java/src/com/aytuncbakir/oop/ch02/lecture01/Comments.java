package com.aytuncbakir.oop.ch02.lecture01;

import java.util.ArrayList;
import java.util.List;

/**
* Javadoc
* @author Aytunc Bakir
* @version 1.0.0
"
 * @param <E>*/
public class Comments<E> {
	
	// end-of-line comment
	
	/* block comment */ 
	
	/*
	 * Multiple line of
	 * comments
	 * */
	
	
	
	/**
	 * @param x
	 * @param y
	 * @return x + y
	 */
	public double sum(double x , double y) {
		
		
		double sum = x + y;  // add x to y
		return sum;
	}
	
	public double multiply(double x , double y) {
		double multiply = x * y;  
		return multiply;
	}

}
