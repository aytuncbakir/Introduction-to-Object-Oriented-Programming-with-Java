package com.aytuncbakir.oop.ch02.lecture04;

public class Blocks {  // Class block
	
	public static void main(String[] args) { // main method block
		
		// Java is block-structured programming language
		
		int i = 0;
		if(i == 0) {
			System.out.println("0");
		}else if(i == 1){
			System.out.println("1");
		}else if(i == 2){
			System.out.println("2");
		}
		
	} // end of main method block
	
	public void function(int value) {  // method block
		System.out.println("Value: "+ value);
	}// end of method block

} // End of class block
