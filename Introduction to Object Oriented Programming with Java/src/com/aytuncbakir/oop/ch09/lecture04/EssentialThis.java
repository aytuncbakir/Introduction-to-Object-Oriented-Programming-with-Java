package com.aytuncbakir.oop.ch09.lecture04;

public class EssentialThis {
	
	// 'This' is used to access Object as reference
	
	public static void main(String[] args) {
		Duck duck = new Duck("Myduck");
		duck.swim();
		
		duck.setAge(5);
		System.out.println(duck.getAge());   // Why age is 11 ?  check getAge()
	}

}

class Duck{
	
	private String name;
	private int age;
	
	public Duck(String name) {
		this.name = name;
	}

	public void swim() {
		String name = "Duck";
		System.out.println(name + " is swimming!");  // change name to this.name
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		int age = 11;
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
