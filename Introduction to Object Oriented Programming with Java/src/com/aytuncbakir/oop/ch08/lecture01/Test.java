package com.aytuncbakir.oop.ch08.lecture01;

public class Test {

	public static void main(String[] args) {
		
		
		//Employee class test
		Employee emp = new Employee();   // new ???  and Employee(); ???
		emp.work();  
		
		// definition = declaration + initialization
		Employee emp1 = new Employee("Ali", "Software");  // // new ???  and Employee("Ali", "Software"); ???
		emp1.work();
		
		// is it possible to create object without using "new"?   Think -- String, Array
		 
		Employee emp3;  //declaration
		emp3 = new Employee(); // initialization
		emp3.work();
		
		Boss boss = new Boss();  // Check the class where is the constructor
		boss.command();    // we can access to objects by their references which are not null
		//command();
//		boss = null;
//		boss.command();
		
		//Note that objects are in Heap  ( Heap is in RAM and used by JVM dinamically)
		
		
	}
}
