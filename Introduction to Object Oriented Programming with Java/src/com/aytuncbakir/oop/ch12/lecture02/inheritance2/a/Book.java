package com.aytuncbakir.oop.ch12.lecture02.inheritance2.a;

public class Book {
	
	// instance variables and methods
	// class variables and methods
	// constructor can not be inherited
	// private variables and methods can not be inherited
	
	// public, protected and if in same package default can be inherited.
	
	public String name;
	private String paperQuality;
	protected int pages;
	int count;
	public static final int staticVariableBook = 123;
	
	public Book(String name, String paperQuality, int pages, int count) {
		super();
		this.name = name;
		this.paperQuality = paperQuality;
		this.pages = pages;
		this.count = count;
		System.out.println("Book");
	}
	
	public Book() {}

	public void publicMethod() {
		
	}
	
	private void privateMethod() {
		
	}
	
	protected void protectedMethod() {
		
	}
	
	void defaultMethod() {
		
	}
	
	public static void staticMethod() {
		
	}
	
	protected static void protectedStaticMethod() {
		
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", paperQuality=" + paperQuality + ", pages=" + pages + ", count=" + count + "]";
	}
	
	
	

}
