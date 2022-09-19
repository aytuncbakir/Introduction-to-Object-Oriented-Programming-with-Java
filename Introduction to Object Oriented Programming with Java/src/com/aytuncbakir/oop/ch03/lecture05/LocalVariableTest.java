package com.aytuncbakir.oop.ch03.lecture05;

public class LocalVariableTest {
	
	public static void main(String[] args) {
		LocalVariables local = new LocalVariables();
		
		//local.coefficent;  // local variables are not a part of object
		
		 local.price = 4 ;
		int total = LocalVariables.totalProduct;   // local.totalProduct;
		
		System.out.println(LocalVariables.totalProduct);
		System.out.println(local.calculate());
		
		local.sell();
		System.out.println(LocalVariables.totalProduct);
		
		
		LocalVariables local1 = new LocalVariables();
		
		local1.sell();
		System.out.println(LocalVariables.totalProduct);
		
		
	}

}
