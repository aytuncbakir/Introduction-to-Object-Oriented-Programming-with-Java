package com.aytuncbakir.oop.ch03.lecture09;

public class NarrowingConversions {
	
	public static void main(String[] args) {
		
		// Data lost
		long longValue = 21;
		int intValue1 = (int) longValue; 
		System.out.println(intValue1);
		
		//Data lost
		long longValue2 = 3000000000000l;
		int intValue2 = (int) longValue2; 
		System.out.println(intValue2);
		
		//Data lost
		double doubleValue1 = 232.45564543434;
		float floatValue1 = (float) doubleValue1; 
		System.out.println(floatValue1);
		
		//Data lost  
		double doubleValue2 = 3.14;
		float floatValue2 = (float) doubleValue2;
		System.out.println(floatValue2);
		
		///Data lost  (truncate - 0.XX omit)
		double doubleValue3 = 3.14;
		int intValue3 = (int) doubleValue3; 
		System.out.println(intValue3);
		
		// Problem : Unexpected results
		char charValue = (char)-95; 
		System.out.println(charValue);
		
	}

}
