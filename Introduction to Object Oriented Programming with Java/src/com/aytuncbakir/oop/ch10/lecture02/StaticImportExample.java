package com.aytuncbakir.oop.ch10.lecture02;

import static com.aytuncbakir.oop.ch10.lecture02.ClassWithStaticVariablesAndMethods.*;
//import static com.aytuncbakir.oop.ch10.lecture02.ClassWithStaticVariablesAndMethods.MY_PI;
//import static com.aytuncbakir.oop.ch10.lecture02.ClassWithStaticVariablesAndMethods.aStaticVariable;
//import static com.aytuncbakir.oop.ch10.lecture02.ClassWithStaticVariablesAndMethods.anotherStaticVariable;
//import static com.aytuncbakir.oop.ch10.lecture02.ClassWithStaticVariablesAndMethods.doSomething;
//import static com.aytuncbakir.oop.ch10.lecture02.ClassWithStaticVariablesAndMethods.saySomething;
//import static com.aytuncbakir.oop.ch10.lecture02.ClassWithStaticVariablesAndMethods.printSomething;

public class StaticImportExample {
	
		public static void main(String[] args) {
			
			System.out.println(aStaticVariable);
			System.out.println(anotherStaticVariable);
			
			System.out.println(MY_PI);
			
			saySomething();
			doSomething();
			printSomething();
			
			System.out.println();
			
		}
	
}
