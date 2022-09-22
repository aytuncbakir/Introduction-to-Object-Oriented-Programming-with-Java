package com.aytuncbakir.oop.ch12.lecture02.inheritance2.b;

public class Newspaper {
	
	public void method(){
		Story story = new Story(null, null, 0, 0);

		// Newspaper can not access to protected variables and methods 
		System.out.println(story.name);
		story.publicMethod();
		story.method();
		Story.staticMethod();
		
	}

}
