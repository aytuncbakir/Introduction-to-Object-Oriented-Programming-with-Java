package com.aytuncbakir.oop.ch05.lecture1;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		// 1 - int i = 0
		// 2 - i < 10 ? 
		// 3-  Ok: System.out.print(i + " ");
		// 4 - i++
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		int i = 0;
		while(i < 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		forWithTwoCounter();
	}

	private static void forWithTwoCounter() {
		System.out.println("***************");
		for (int i = 0,  j = 10; i<6 & j>4; i++,j--) {
			if(i == 5 & j == 5)
				System.out.print(i + " "+ j+ " ");
		}
	}

}
