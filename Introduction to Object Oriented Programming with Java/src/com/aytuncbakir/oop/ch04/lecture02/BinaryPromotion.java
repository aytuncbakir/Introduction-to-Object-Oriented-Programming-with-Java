package com.aytuncbakir.oop.ch04.lecture02;


public class BinaryPromotion {

	public static void main(String[] args) {
		
		// Binary promotion
		// + - * / %
		//  < <= > >= == !=
		// & | ^
		// Bazen de ?:
		
		byte b1 = 3;
		byte b2 = 7;
//		byte b3 = b1 + b2; // compile error: possible loss of precision  Type mismatch: cannot convert from int to byte
//		byte b3 = b1 - b2; // compile error: possible loss of precision  Type mismatch: cannot convert from int to byte
//		byte b3 = b1 * b2; // compile error: possible loss of precision  Type mismatch: cannot convert from int to byte
//		byte b3 = b1 / b2; // compile error: possible loss of precision  Type mismatch: cannot convert from int to byte
//		byte b3 = b1 % b2; // compile error: possible loss of precision  Type mismatch: cannot convert from int to byte

		byte b3 = (byte) (b1 + b2); // casting is essential
		b3 = (byte) (b1 - b2); // casting is essential
		b3 = (byte) (b1 * b2); // casting is essential
		b3 = (byte) (b1 / b2); // casting is essential
		b3 = (byte) (b1 % b2); // casting is essential
		System.out.println(b3);
		
		
		
		byte b4 = 5;
//		byte b5 = b4 >>> b4;
		byte b5 = (byte) (b4 >>> b4);
	}
}
