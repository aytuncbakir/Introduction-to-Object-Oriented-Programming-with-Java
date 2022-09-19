package com.aytuncbakir.oop.ch02.lecture07;

import java.math.BigDecimal;

public class FloatingPoints {
	
	// float (32bit) ve double(64)
	
	public static void main(String[] args) {
		
		
		//double sum = 0.1 + 0.1f;  // eger f konulmazsa default olarak 0.1 double kabul edilir.
		
		float sum = 0.1f + 0.1f+ 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f ;
		
		System.out.println(sum);  // result ? 0.8 
		
		double mul = 0.1 * 0.1;  // result ? 0.01
		System.out.println(mul);
		
		//  solution BigDecimal 
		BigDecimal sum1 = BigDecimal.valueOf(0.1d)
								.add(BigDecimal.valueOf(0.1d))
								.add(BigDecimal.valueOf(0.1d))
								.add(BigDecimal.valueOf(0.1d))
								.add(BigDecimal.valueOf(0.1d))
								.add(BigDecimal.valueOf(0.1d))
								.add(BigDecimal.valueOf(0.1d))
								.add(BigDecimal.valueOf(0.1d));
		
		
		System.out.println(sum1);
		
		// Exponential notation
		double dValue = 1.2e-12;
		float fValue = 2.1E13F;
		
//		int i = 10E3; // Cannot convert double to int
		
		long bigNumber = 1_000_000_000;
		
		String s = "1_000_000_000";
//		String s1 = "1000000000";
		
		long i = Long.parseLong(s)  ;
		
		System.out.println(i);
	}

}
