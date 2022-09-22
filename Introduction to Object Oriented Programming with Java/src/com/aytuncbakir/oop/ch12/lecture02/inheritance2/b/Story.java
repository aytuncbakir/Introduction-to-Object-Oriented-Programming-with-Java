package com.aytuncbakir.oop.ch12.lecture02.inheritance2.b;

import com.aytuncbakir.oop.ch12.lecture02.inheritance2.a.Book;

public class Story extends Book{
	
	public static final int staticVariableStory = 789;

	public Story(String name, String paperQuality, int pages, int count) {
		super(name, paperQuality, pages, count);
		System.out.println("Story");
	}
	
	public void method() {
		
		System.out.println(name);
		System.out.println(pages);
		System.out.println(staticVariableBook);
		
		publicMethod();
		protectedMethod();
		staticMethod();

	}

}
