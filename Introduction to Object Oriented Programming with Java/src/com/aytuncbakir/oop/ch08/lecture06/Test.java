package com.aytuncbakir.oop.ch08.lecture06;

public class Test {
	
	
	public static void main(String[] args) {
		
		MethodSignatureAndInterfaceOverloading  m = new MethodSignatureAndInterfaceOverloading();
		byte b = 5;
		char c= 'A';
		
		m.method(b);
		System.out.println();
		m.method(c);
	}

}
