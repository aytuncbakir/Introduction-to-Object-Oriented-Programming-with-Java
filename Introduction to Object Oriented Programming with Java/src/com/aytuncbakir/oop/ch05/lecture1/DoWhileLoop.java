package com.aytuncbakir.oop.ch05.lecture1;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		
		int i = 0;
		while(i < 20) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println();
		boolean b= true;
		i = 0;
		while(b) {
			System.out.print(i+ " ");
			if(i == 5)
				b = false;
			i++;
		}
	}

}
