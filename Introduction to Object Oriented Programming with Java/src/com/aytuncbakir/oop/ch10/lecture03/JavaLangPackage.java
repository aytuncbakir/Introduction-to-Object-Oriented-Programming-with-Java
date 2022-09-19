package com.aytuncbakir.oop.ch10.lecture03;

public class JavaLangPackage {

	// JavaLangPackage  - java.lang is imported to all classes automatically
	 //   - System, - String, - Math 
	
	
	public static void main(String[] args) {
		
		System.out.println(System.class);
		System.out.println(String.class);
		System.out.println(Math.class);
		
		// no import java.lang.NoClassDefFoundError
		NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError();
		
	}
}
