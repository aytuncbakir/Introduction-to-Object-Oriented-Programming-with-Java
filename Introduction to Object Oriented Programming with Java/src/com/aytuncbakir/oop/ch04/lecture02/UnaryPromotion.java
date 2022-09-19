package com.aytuncbakir.oop.ch04.lecture02;

public class UnaryPromotion {
	
	public static void main(String ... args) {
		byte b = 7;
		
		// Remove casting to byte (byte), observe the warning
		b = (byte) +b;		// Unary promotion
		b = (byte) -b;		// Unary promotion
		b = (byte) ~b;		// Unary promotion
		
		// no need to cast byte because no promotion available
		byte b1 = ++b;      // 
		
		byte size = 5;
		
		
		int[] x = new int[size];  // size converted to int, promoted automaticaly
		
		double dSize = 5.2;
		int[] y = new int[(int)dSize];
	}

}
