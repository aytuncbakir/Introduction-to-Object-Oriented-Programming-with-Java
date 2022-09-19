package com.aytuncbakir.oop.ch06;

import com.aytuncbakir.oop.ch06.polymorfizm.Animal;
import com.aytuncbakir.oop.ch06.polymorfizm.Cat;
import com.aytuncbakir.oop.ch06.polymorfizm.Mouse;

public class Arrays {
	
	public static void main(String[] args) {
		
		// array legnth is constan
		// values are homogeneous
		
		int[] values = new int[5]; // after type
		values[0]=12;
		values[1]=8;
		values[2]=7;
		values[3]=11;
		values[4]=9;
		
		// array first cell - index = 0
		// array last cell - index = length - 1 => 5 - 1 = 4
		
		int values1[]= {12, 8 , 7, 11, 9 };  //after array name []
		
		String words[] = {"Hello","World!"};
		
		// can not seperate declaration and initialization
//		int[] values2;
//		values2 = {1,2,3,4,5};
		
		//Variable must provide either dimension expressions or an array initializer
//		int[] x = new int[];
		
		System.out.println(values[4]);
		System.out.println(values[5]);  // ArrayIndexOutOfBoundsException
		
		int intArray[] = new int[10];
		printArray(intArray);
		double dArray [] = new double[10];
		printArray(dArray);
		boolean bArray [] = new boolean[10];
		printArray(bArray);
		
		
		long l = 4;
		// Type mismatch: cannot convert from long to int 	
//		System.out.println(values[l]);
		// add cast
		System.out.println(values[(int)l]);
		
		double d = 3.14;
		System.out.println("double d: "+values[(int)d]);
		
		byte b = 4;
		System.out.println("byte b: "+values[b]);
		
		short s = 4;
		System.out.println("short s: "+values[s]);
		
		// values are homogeneous  ??? Polymorfizm
		Animal cat =  new Cat("Tom");
		Animal maouse = new Mouse("Jerry");
		Animal animals[] = {cat,maouse};
		System.out.println(animals[0].getName());
		System.out.println(animals[1].getName());
		
	}

	private static void printArray(int[] arr) {
		System.out.println("Int default values");
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	private static void printArray(double[] arr) {
		System.out.println("Double default values");
		for (double i : arr) {
			System.out.println(i);
		}
	}
	
	private static void printArray(boolean[] arr) {
		System.out.println("boolean default values");
		for (boolean i : arr) {
			System.out.println(i);
		}
	}


}
