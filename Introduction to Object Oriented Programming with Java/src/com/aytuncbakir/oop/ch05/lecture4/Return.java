package com.aytuncbakir.oop.ch05.lecture4;

public class Return {
	
	public static void main(String[] args) {
		methodWithNoReturnValue1();
		methodWithNoReturnValue2();
		methodWithNoReturnValue3(13);
		methodWithReturnValueInt();
		methodWithReturnValueLong();
		methodWithReturnValueFloat();
		methodWithReturnValueDouble();
		methodWithReturnValueBoolean();
		methodWithReturnValueString();
		
		// Methods also may return Object or Collection of objects
		// We will see that later
	}

	

	private static void methodWithNoReturnValue1() {
		System.out.println("methodWithNoReturnValue1 void implies that method returns nothing");
		return;  // no effect;
		
	}
	
	private static void methodWithNoReturnValue2() {
		System.out.println("methodWithNoReturnValue2 void implies that method returns nothing");
		boolean b = true;
		if(b)
			return;
		System.out.println();
	}
	
	private static void methodWithNoReturnValue3(int value) {
		System.out.println("methodWithNoReturnValue3 void implies that method returns nothing");
		int[] values = {2, 6 ,7 ,8, 9 ,12, 13, 21 ,34,23,34,45,67,89};
		int i = 0;
		for (; i < values.length; i++) {
			if(values[i] == value) {
				values[i] = -1;
				System.out.println("How many times worked: "+ i);
				//return;
				// break; // what is the difference?
			}
			
		}
		System.out.println("How many times worked: "+ i);
		
	}
	
	private static int methodWithReturnValueInt() {
		int i = 5;
		System.out.println("i "+i+" will be return");
		return i;
	}
	
	private static int methodWithReturnValueLong() {
		int i = 5;
		System.out.println("i "+i+" will be return");
		return i;
	}
	
	private static int methodWithReturnValueFloat() {
		int i = 5;
		System.out.println("i "+i+" will be return");
		return i;
	}
	
	private static int methodWithReturnValueDouble() {
		int i = 5;
		System.out.println("i "+i+" will be return");
		return i;
	}
	
	
	private static String methodWithReturnValueString() {
		String i = "5";
		System.out.println("i "+i+" will be return");
		return i;
	}
	
	private static boolean methodWithReturnValueBoolean() {
		boolean i = true;
		System.out.println("i "+i+" will be return");
		return i;
	}

}
