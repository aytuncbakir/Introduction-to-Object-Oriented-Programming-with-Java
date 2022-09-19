package com.aytuncbakir.oop.ch05.lecture1;

public class ForLoop {
	
	public static void main(String[] args) {
		
		int i = 0;
		do {
			System.out.print(i + " ");
			i++;
		}while(i < 20);
		
		System.out.println();
		 
		i = 21;
		while(i < 20) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println();
		
		do {
			System.out.println("do lause works at least one time"+i);
			i++;
		}while(i < 20);
		
	}

}
