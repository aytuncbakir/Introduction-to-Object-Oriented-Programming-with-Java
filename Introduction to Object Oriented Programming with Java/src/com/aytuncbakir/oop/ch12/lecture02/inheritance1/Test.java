package com.aytuncbakir.oop.ch12.lecture02.inheritance1;

public class Test {

	public static void main(String[] args) {
		
		Bird bird = new Bird("Sparrow", "food");
		
		bird.move();
		
		System.out.println(Bird.blood);
	}

}
