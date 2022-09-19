package com.aytuncbakir.oop.ch05.lecture3;

public class BreakAndContinueWithLabel {
	
	public static void main(String[] args) {
//		breakWithLabel();
//		continueWithLabel1();
//		continueWithLabel2();
		
		
	}

	private static void continueWithLabel2() {
		// label has effect
		here: for (int i = 0; i < 2; i++)
			for (int j = 0; j < 5; j++) {
				if (j == 2)
					continue here;

				System.out.print("i = " + i + " ");
				System.out.println(" j =" + j);
			}
	}

	private static void continueWithLabel1() {
		
		// label has no effect
		here:
	         for (int i = 0; i < 3; i++) {
	            for (int j = 0; j< 3; j++){
	               if(i == 1){
	                  continue here;
	               }      
	               System.out.println(" [i = " + i + ", j = " + j + "] ");
	            }
	         }
		
	}

	private static void breakWithLabel() {
		int[][] values = { { 1, 2 }, { 13, 4 }, { 5, 9 }, { 7, 8 },{ 63, 10 },{ 23,17 }};
		boolean found = false;
		int row = 0;
		int column = 0;
		// find index of first int greater than 10
		searcHint:

		for (row = 0; row < values.length; row++) {
			for (column = 0; column < values[row].length; column++) {
				if (values[row][column] > 10) {
					found = true;
					break searcHint;// using break label to terminate outer statements
				}
			}
		}
		if (found) {
			System.out.println("First int greater than 10 is found at index: [" + row + "," + column + "]");
			System.out.println("Value: " + values[row][column]);
		}
	
		
	}

}
