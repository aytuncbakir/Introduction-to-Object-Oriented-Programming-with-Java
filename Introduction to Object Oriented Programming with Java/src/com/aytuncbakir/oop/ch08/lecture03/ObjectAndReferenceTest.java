package com.aytuncbakir.oop.ch08.lecture03;

public class ObjectAndReferenceTest {
	
	public static void main(String[] args) {
		
		ObjectAndReference reference1 = new ObjectAndReference();
		reference1.method();
		ObjectAndReference reference2;
		ObjectAndReference reference3, reference4;
		
		reference2 = reference1;
		reference2.method();
		reference3 = reference2;
		reference4 = reference1;
		reference3.method();
		reference4.method();
		
		reference1 = null;
		reference2 = null;
		reference3 = null;
		reference1.method();
		
		reference4.method();
	}
	
}
