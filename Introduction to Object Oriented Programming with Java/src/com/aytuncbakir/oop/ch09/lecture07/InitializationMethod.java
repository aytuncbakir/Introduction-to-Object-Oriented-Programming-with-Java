package com.aytuncbakir.oop.ch09.lecture07;

public class InitializationMethod {
	
	public static void main(String[] args) {
		Television tv = new Television();
		System.out.println(tv.year);
		System.out.println(tv.getYear());
	}

}


class Television{
	
	
//	 int year = value; "// Error! Forward reference
	
	// Not a forward reference but can be misleading!
	int  year = getYear(); //j is 0 yet!
	int value = 2021;
	int getYear(){ return value;}   // default int value (0) returned!
}
