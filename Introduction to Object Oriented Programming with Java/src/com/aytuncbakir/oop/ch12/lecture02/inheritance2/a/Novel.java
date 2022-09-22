package com.aytuncbakir.oop.ch12.lecture02.inheritance2.a;

public class Novel extends Book{
	
	public static final int staticVariableNovel = 345;

	public Novel(String name, String paperQuality, int pages, int count) {
		super(name, paperQuality, pages, count);
		System.out.println("Novel");
	}
	
	public void method() {

		System.out.println(name);
		System.out.println(pages);
		System.out.println(count);
		
		
		publicMethod();
		protectedMethod();
		defaultMethod();
		staticMethod();
		

	}

}
