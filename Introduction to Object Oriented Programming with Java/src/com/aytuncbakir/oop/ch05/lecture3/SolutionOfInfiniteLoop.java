package com.aytuncbakir.oop.ch05.lecture3;

public class SolutionOfInfiniteLoop {
	
	public static void main(String[] args) {
		
		System.out.println("Infinite while solution");
		int i = 0;
		while(true) {
			System.out.println("i: "+i );
			if(i > 14)
				break;
			i++;
		}
		System.out.println("Infinite for solution");
		i = 0;
		for (;;) {
			System.out.println("i: "+i );
			if(i > 14)
				break;
			i++;
		}
	}

}
