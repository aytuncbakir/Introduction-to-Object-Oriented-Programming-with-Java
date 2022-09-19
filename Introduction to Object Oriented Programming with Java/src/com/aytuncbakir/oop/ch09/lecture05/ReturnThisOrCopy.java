package com.aytuncbakir.oop.ch09.lecture05;

public class ReturnThisOrCopy {

	public static void main(String[] args) {
		
		Bird bird = new Bird("Eagle", 1000);
		bird.print();
		
		Bird copyBird = bird.copyOfBird();
		bird.print();
		System.out.println("Bird is copied!");
		if(copyBird == bird) {
			System.out.println("Same bird!");
		}else {
			System.out.println("Different bird!");
		}
		
		Bird thisBird = bird.fly();
		thisBird.print();
		System.out.println("Bird is flyed!");
		if(thisBird == bird) {
			System.out.println("Same bird!");
		}else {
			System.out.println("Different bird!");
		}
	}
}

class Bird{
	
	private String name;
	private int flyRange;
	
	public Bird(String name, int flyRange) {
		
		this.name = name;
		this.flyRange = flyRange;
	}

	public Bird copyOfBird() {
		Bird bird = new Bird(name, flyRange);
		return bird;
	}
	
	public Bird fly() {
		flyRange = flyRange + 100;
		return this;
	}
	
	void print() {
		System.out.println(name + ": " + " range "+ flyRange);
	}
	
	
}