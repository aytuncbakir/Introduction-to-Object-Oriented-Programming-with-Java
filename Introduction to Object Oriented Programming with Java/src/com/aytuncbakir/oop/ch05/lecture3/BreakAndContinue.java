package com.aytuncbakir.oop.ch05.lecture3;

public class BreakAndContinue {

	public static void main(String[] args) {
		
//		breakExample1();
		continueExample1();
	}

	private static void continueExample1() {
		for (int i = 0; i <= 10; i++) {  
			if (i == 5)
				continue; // the rest of code will skip
			System.out.println(i);
		} 
		
		int i = 0;
		while(i < 10) {
			i++;
			if(i == 5)   // add i++ before continue;
				continue;  // when i 5, the rest of code does not work
			
			System.out.println("i: "+i);
//			i++;     // observe what will happen
			
		}
	}

	private static void breakExample1() {
		
		int i = 0;
		while(i < 10) {
			
			if(i == 5) 
				break;
			
			System.out.println("i: "+i);
			i++;
			
		}
		System.out.println();
		for (int j = 0; j <10; j++) {
			if(j == 5) 
				break;
			
			System.out.println("j: "+j);
		}
	}

}
