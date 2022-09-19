package com.aytuncbakir.oop.ch02.lecture04;

public class ValuesOfExpressions {

	public static void main(String[] args) {
		int max_int_value = 2_147_483_647; 

		int addedOneToMaxIntValue = max_int_value + 1;
		System.out.println(addedOneToMaxIntValue);

		// That is not an unreachable code
		int degree = 20;
		int increaseDegree;
		if (degree < 20)
			increaseDegree = 20;

		System.out.println();

		// increaseDegree may not have been initialized!
		// System.out.println(increaseDegree);
	}
}

