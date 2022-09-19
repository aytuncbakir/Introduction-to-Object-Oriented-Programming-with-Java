package com.aytuncbakir.oop.ch05.lecture2;

public class MakeDecisionWithEqualityOperartor {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
//		if(a = b) {
//			System.out.println("doSomething");
//		}

		if (a == b) 
			System.out.println("doSomething");

			boolean b1 = true;
			boolean b2 = false;
			if (b1 == b2) // if(b1 =b2) do not do this
				System.out.println("doSomething");

	}

}
