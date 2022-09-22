package com.aytuncbakir.oop.ch11.lecture02.classaccess.packageA;

import com.aytuncbakir.oop.ch11.lecture02.classaccess.packageB.Dog;
import com.aytuncbakir.oop.ch11.lecture02.classaccess.packageB.Wolf;

public class Cat {
	
	public void whoAreYou() {
		System.out.println("Cat");
	}
	
	public void sayHello() {
		Fox fox = new Fox();
		Dog dog = new Dog();
		Wolf wolf = new Wolf();
//		Jackal jackal = new Jackal();
	}

}
