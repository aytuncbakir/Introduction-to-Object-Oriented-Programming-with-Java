package com.aytuncbakir.oop.ch05.lecture2;

public class DrawShapes {
	
	public static void main(String[] args) {
		
		int length = 10;
		//drawSquare( length);
		//drawTriangle(length);
		//drawTraverseTriangle(length);
		drawEmptySquare(length);
	}

	private static void drawEmptySquare(int length) {
		for (int i = 0;  i < length; i++) {
			for (int j = 0; j < length; j++) {
				if(i == 0 | j == 0 | i == length-1  | j == length-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
				System.out.println();
		}
		
	}

	private static void drawTraverseTriangle(int length) {
		for (int i = 0;  i < length; i++) {
			for (int j = 0; j < length-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void drawTriangle(int length) {
		
		for (int i = 0;  i < length; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void drawSquare(int length) {
		for (int i = 0;  i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
