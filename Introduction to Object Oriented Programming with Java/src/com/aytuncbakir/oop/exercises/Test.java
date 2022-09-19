package com.aytuncbakir.oop.exercises;

import com.aytuncbakir.oop.ch09.lecture09.InizializationBlocks;

public class Test {
	
	public static void main(String[] args) {
		//System.out.println("y in main "+InizializationBlocks.y);
		
		InizializationBlocks initBlocks = new InizializationBlocks();
		
		System.out.println(initBlocks.x);
		
		System.out.println("*********************************************");
		
		// All initial blocks is copied into constructor whisch has no this();
		InizializationBlocks initBlocks1 = new InizializationBlocks(26);
		System.out.println(initBlocks1.x);
	}

}
