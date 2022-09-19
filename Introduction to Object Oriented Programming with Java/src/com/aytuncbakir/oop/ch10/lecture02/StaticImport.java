package com.aytuncbakir.oop.ch10.lecture02;

import static java.lang.Math.PI; // It reads static import
import static java.lang.Math.pow; // But written import static
import static java.lang.Math.*; // Imports all static members

public class StaticImport {

	public static void main(String[] args) {
		double r = 2;
		double area1 = Math.PI * r * r; // before Java 5
		double area2 = PI * r * r; //  after Java 5, static import
		System.out.println(area1);
		System.out.println(area2);
		
		System.out.println(Math.pow(3, 4)); // before Java 5
		System.out.println(pow(3, 4)); // after Java 5, static import
		
		double e1 = Math.E;
		System.out.println(e1);
		
		double e2 = E;
		System.out.println(e2);
	}
}



