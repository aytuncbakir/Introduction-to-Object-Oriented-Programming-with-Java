package com.aytuncbakir.oop.ch08.lecture04;

public class CompoundObject {
	
	// Compound object :  (composite/aggregate object)
	
	/*
	 * 
	 https://www.geeksforgeeks.org/association-composition-aggregation-java/
	 * 
	 * Association is a relation between two separate classes which establishes through their Objects. 
	 * Association can be one-to-one, one-to-many, many-to-one, many-to-many. 
	 * In Object-Oriented programming, an Object communicates to another object to use functionality and services provided by that object. 
	 * Composition and Aggregation are the two forms of association. 
	 */
	
	/*
		
	*/
	
	public static void main(String[] args) {
		
		Advisor advisor = new Advisor("John");
		Student student = new Student("Adam");
		student.setAdvisor(advisor);
		
		System.out.println("Student: "+student.getName());
		System.out.println("Advisor: "+student.getAdvisor().getName());
	}

}
