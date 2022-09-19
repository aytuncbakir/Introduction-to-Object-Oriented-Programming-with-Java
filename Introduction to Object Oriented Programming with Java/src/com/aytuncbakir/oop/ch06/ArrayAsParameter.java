package com.aytuncbakir.oop.ch06;

public class ArrayAsParameter {
	
	public static void main(String[] args) {
		
		int[] values1 = {1, 2, 3};
		
		sendAsParameterToMethodArrayName(values1);
		passingArrayWithDefaultValues(new int[3]);
		passingArrayWithAssignedValues(new int[] {3,4,5});
		
//		passingArrayWithAssignedValues({3,4,5});
	}

	private static void passingArrayWithAssignedValues(int[] values) {
		for(int i : values) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static void passingArrayWithDefaultValues(int[] values) {
		for(int i : values) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	private static void sendAsParameterToMethodArrayName(int[] values) {
		for(int i : values) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
