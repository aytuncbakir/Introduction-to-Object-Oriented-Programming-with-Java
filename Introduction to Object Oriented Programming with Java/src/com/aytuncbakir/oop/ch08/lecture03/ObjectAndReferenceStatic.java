package com.aytuncbakir.oop.ch08.lecture03;

public class ObjectAndReferenceStatic {
	
	public static void main(String[] args) {
		
		ObjectAndReferenceStatic reference1 = new ObjectAndReferenceStatic();
		reference1.method();
		ObjectAndReferenceStatic reference2;
		ObjectAndReferenceStatic reference3, reference4;
		
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
	
	public static void method() {
		System.out.println("ObjectAndReference object");
	}
	
}
