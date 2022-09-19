package com.aytuncbakir.oop.ch05.lecture5;

public class Recursion {
	
	public static void main(String[] args) {
		int n = 6;
		int result = factorial(n);
		System.out.println("Factorial "+n+": "+result);
		
		n = 8;
		result = fibonacci(n);
		System.out.println("Fibonacci "+n+": "+result);
		
		n = 10;
		result = sum(n);
		System.out.println("Sum "+n+": "+result);
	}
	
	private static int sum(int n) {
		if(n == 1)
			return 1;
		else
			return n + sum(n-1);		
	}

	private static int fibonacci(int n) {
		if(n == 1 | n == 2)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}

	private static int factorial(int n) {
		if(n ==0 | n == 1)
			return 1;
		else
			return n * factorial(n-1);
	}

}
