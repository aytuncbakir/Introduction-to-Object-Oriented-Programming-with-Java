package com.aytuncbakir.oop.ch03.lecture09;

import java.math.BigDecimal;

public class WideningConversions {
	
	public static void main(String[] args) {
		
		
		// Genisleten cevrimlerde bilgi kaybi olmaz dusuncesi hatalidir.
		
		// no data lost
		int i = 1223434454;
		long l = i;
		//System.out.println(l);
		
		// no data lost
		float f = 3.12343434334f;  // Burada f atama yapilirken kayip olusuyor, sonrasinda kayip yok
		double d = f;
		//System.out.printf("%.11f",d);
		checkThisExampleMethod();
		
  
        // Display the result
        System.out.println(f);
		
		
		
		// maybe --> data lost
		int x = 223333223;
		float f1 = x;
		System.out.println((int)f1);
		
		// maybe --> data lost
		long y = 9223372036854775807l;
		double f2 = y;
		System.out.println(f2);
		
	}

	private static void checkThisExampleMethod() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Inside checkThisExampleMethod");
		float f = 3.12343434334f;
		//System.out.printf("%.11f",f);
		System.out.println();
		double d = 3.12343434334;
		//System.out.printf("%.11f",d);
		
		
		BigDecimal bd = BigDecimal.valueOf(f); 
		
        System.out.printf("%.11f",f);
        System.out.println();
        
        BigDecimal bd1 = BigDecimal.valueOf(3.12343434334d); 
		
        System.out.printf("%.11f",bd1.floatValue());
        System.out.println();
        
        System.out.println("------------------------------------------------------------------");
		
	}

}
