package com.aytuncbakir.oop.ch11.lecture02.classaccess.packageB;

import com.aytuncbakir.oop.ch11.lecture02.classaccess.packageA.Cat;
import com.aytuncbakir.oop.ch11.lecture02.classaccess.packageA.Fox;

public class Dog {

	public void whoAreYou() {
		System.out.println("Dog");
	}
	
	public void sayHello() {
		Fox fox = new Fox();
		Wolf wolf = new Wolf();
		Cat cat = new Cat();
		Jackal jackal = new Jackal();  // default access - friendly access
	}
}
