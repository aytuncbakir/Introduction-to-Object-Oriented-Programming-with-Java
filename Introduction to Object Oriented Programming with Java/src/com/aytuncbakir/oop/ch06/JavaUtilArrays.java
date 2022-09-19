package com.aytuncbakir.oop.ch06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaUtilArrays {
	
	public static void main(String[] args) {
		
        int intArray[] = { 5, 7, 11, 12, 2 };
        printArray(intArray);
     
        Arrays.sort(intArray);
        printArray(intArray);
        
        int key = 12;     
        // Print the key and corresponding index
        System.out.println(
            key + " found at index = "
            + Arrays.binarySearch(intArray, key));
        
       
        int intArray2[] = { 5, 7, 11, 12, 2 };
        int intArray3[] = { 3, 8, 9 };
  
        // To compare both arrays : if equal returns 0 else 1
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.compare(intArray2, intArray3));
        
        System.out.print("\nNew Arrays by copyOf:\n");
        printArray(Arrays.copyOf(intArray2, 7));
        
        System.out.print("\nNew Arrays by copyOf:\n");
        printArray(Arrays.copyOfRange(intArray2, 3, 5));
        
        
        System.out.println("Integer Arrays on comparison: ");        
        System.out.println(Arrays.equals(intArray2, intArray3));
        
        
        int value = 1;
        Arrays.fill(intArray2, value);
        printArray(intArray2);
        
        
        boolean booleanArray[] = new boolean[10];
        printBooleanArray(booleanArray);
        Arrays.fill(booleanArray, true);
        printBooleanArray(booleanArray);
        
        int intArray4[] = { 5, 7, 11, 12, 2 };
        int intArray5[] = { 5, 7, 9 };
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArray4, intArray5));
        
         IntStream s = Arrays.stream(intArray5);
        
     // IntStream -> int[]
        int[] stream1 = IntStream.rangeClosed(0, 4).toArray();
        System.out.println(Arrays.toString(stream1));

      
      
	}

	private static void printArray(int[] intArray) {
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void printBooleanArray(boolean[] booleanArray) {
		for (boolean i : booleanArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
