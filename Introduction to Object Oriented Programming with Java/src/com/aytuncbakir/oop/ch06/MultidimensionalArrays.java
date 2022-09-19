package com.aytuncbakir.oop.ch06;

public class MultidimensionalArrays {
	
	public static void main(String[] args) {
		
		// remove length
		int [][] values = new int[3][];
		
		
		int [][] values1 = {
								{1,2,3},
								{4,5,6},
								{7,8,9},
							};
		printArray1(values1);
		
		// You can create matrix by 2d array, but that is not obligation
		int[] arr1 = {9,8,7};
		int[] arr2 = {6,5,4};
		int[] arr3 = {3,2,1};
			
		int [][] values2 = {arr1, arr2,arr3};
		printArray1(values2);
		
		
		// 
		int[] arr4 = {9,8,7,11};
		int[] arr5 = {6,5,4,3,2,1,0};
		int[] arr6 = {10, 12, 13, 14, 15,16, 17,18};
			
		int [][] values3 = {arr4, arr5,arr6};
		printArray2(values3);
		
//		int [][][] values4 = new int[4][][];  // at least first cell length have to be assign
		int [][][] values4 = new int[4][4][4];
		
		int [][][] values5 = create3DArray();
		print3Darray(values5);
		
		
		
	}
	
	private static void print3Darray(int[][][] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				for (int k = 0; k < values[i][j].length; k++) {
					System.out.print(values[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

	private static int[][][] create3DArray() {
		int[][][] arr = {
	            {
	              {1, -2, 3}, 
	              {2, 3, 4}
	            }, 
	            { 
	              {-4, -5, 6, 9}, 
	              {1}, 
	              {2, 3}
	            } 
	        };
		
		return arr;
	}

	private static void printArray1(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++) {
				System.out.print(values[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void printArray2(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	

}
