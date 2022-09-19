package com.aytuncbakir.oop.ch03.lecture06;

public class HowToWorkStackTest {
	
	public static void main(String[] args) {
		HowToWorkStack.stack.add("main");
		HowToWorkStack.print();
		HowToWorkStack stack = new HowToWorkStack();
		stack.method1();
		
		HowToWorkStack.stack.remove(HowToWorkStack.stack.size() - 1);
		HowToWorkStack.print();
	}
	
	

}
