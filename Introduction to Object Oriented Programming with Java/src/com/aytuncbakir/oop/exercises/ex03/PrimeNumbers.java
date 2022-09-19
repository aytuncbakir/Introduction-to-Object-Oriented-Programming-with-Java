package com.aytuncbakir.oop.exercises.ex03;

public class PrimeNumbers {
public static void main(String[] args) {
		
		
		System.out.println(isPrime1(11));
		System.out.println(isPrime2(11));
		countNumberOfPrimesUpTo(1000);
	}

	private static boolean isPrime1(int p) {
		boolean isPrime = true;
		int i = 2;
		for (; i < p; i++) {
			if(p % i == 0) {
				isPrime = false;
				break;
			}
		}
//		System.out.println("Prime1 has worked "+ i + "times");
		return isPrime;
	}
	
	private static boolean isPrime2(int p) {
		boolean isPrime = true;
		int upperLimit = (int)(Math.sqrt(p)+1);   // number = a * b ;
		int i = 2;
		for (; i < upperLimit; i++) {
			if(p % i == 0) {
				isPrime = false;
				break;
			}
		}
//		System.out.println("Prime2 has worked "+ i + "times");
		return isPrime;
	}
	
	private static void countNumberOfPrimesUpTo(int n) {
		int numberOfPrimes = 0;
		for (int i = 2; i < n; i++) {
			if(isPrime2(i))
				numberOfPrimes++;
				
		}
		System.out.println(numberOfPrimes);
	}

}
