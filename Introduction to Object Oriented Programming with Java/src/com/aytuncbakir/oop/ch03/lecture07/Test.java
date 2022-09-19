package com.aytuncbakir.oop.ch03.lecture07;

public class Test {
	
	public static void main(String[] args) {
		InstanceVariableScope scope = new InstanceVariableScope();
		scope.run();
		System.out.println();
		LocalVariableScope scope1 = new LocalVariableScope();
		scope1.run();
	}

}
