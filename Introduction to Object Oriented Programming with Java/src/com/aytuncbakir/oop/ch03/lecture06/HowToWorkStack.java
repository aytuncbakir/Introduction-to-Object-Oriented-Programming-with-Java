package com.aytuncbakir.oop.ch03.lecture06;

import java.util.ArrayList;
import java.util.List;

public class HowToWorkStack {
	
	public static List<String> stack = new ArrayList<String>();
	
	public  void method1() {
		HowToWorkStack.stack.add("method1");
		print();
		method2();
		method3();	
		HowToWorkStack.stack.remove(HowToWorkStack.stack.size() - 1);
		print();
		
	}
	
	public void method2() {
		HowToWorkStack.stack.add("method2");
		print();
		HowToWorkStack.stack.remove(HowToWorkStack.stack.size() - 1);
		print();
	}
	
	public  void method3() {
		HowToWorkStack.stack.add("method3");
		print();
		method4();
		HowToWorkStack.stack.remove(HowToWorkStack.stack.size() - 1);
		print();
	}
	
	public  void method4() {
		HowToWorkStack.stack.add("method4");
		print();
		HowToWorkStack.stack.remove(HowToWorkStack.stack.size() - 1);
		print();
	}
	
	public static void print() {
		System.out.println("---------------------------------------------");
		for(int i = stack.size() -1 ; i >= 0 ; i--)
			System.out.println(stack.get(i));
	}

}
