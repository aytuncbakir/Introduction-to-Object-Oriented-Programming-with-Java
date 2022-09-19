package com.aytuncbakir.oop.ch06;

import java.util.Random;

public class Foreach {
	
	public static void main(String[] args) {
		
		int[] values = {3,5,6,7,6,4,5,6,2};
		
		
		System.out.println();
		for(int i: values ) {
			System.out.print(i+ " ");
			
		}
		
		Random r = new Random();
		int randomValue ;
		int max = 9;
		int min = 1;
		System.out.println();
		// Following does not modify intArray's cells!
		for (int i : values) {
			randomValue = r.nextInt(max - min + 1) + min;
			i = randomValue;
			System.out.print(i+ " ");
		}
		
		System.out.println();
		for(int i: values ) {
			System.out.print(i+ " ");
			
		}
//		
		for(int i: values ) {
			if(i == 7) {    // values = {3,5,6,7,6,4,5,6,2}
				values[i] = 101;
			}
		}
		
		System.out.println();
		for(int i: values ) {
			System.out.print(i+ " ");
			
		}
	}

}
