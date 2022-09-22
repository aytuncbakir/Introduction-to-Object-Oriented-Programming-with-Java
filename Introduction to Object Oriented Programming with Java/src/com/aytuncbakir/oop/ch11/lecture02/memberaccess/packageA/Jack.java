package com.aytuncbakir.oop.ch11.lecture02.memberaccess.packageA;

public class Jack {
	
	
	// in same package  --   all kind of access allowed in the class
	
	public String name;
	private int id;
	protected String illnes;
	String hobby;

	public void publicMethod() {
		privateMethod();
		protectedMethod();
		defaultMethod();
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(name);
		System.out.println(illnes);
	}
	
	private void privateMethod() {
		publicMethod();
		protectedMethod();
		defaultMethod();
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(name);
		System.out.println(illnes);
	}
	
	protected void protectedMethod() {
		privateMethod();
		protectedMethod();
		defaultMethod();
		System.out.println(name);
		System.out.println(id);
		System.out.println(name);
		System.out.println(illnes);
	}
	
	void defaultMethod() {
		privateMethod();
		protectedMethod();
		publicMethod();
		System.out.println(name);
		System.out.println(id);
		System.out.println(name);
		System.out.println(illnes);
	}
	
	// in same package  --  access to another class allowed to access public, protected and default
	
	void sayHelloFriend() {
		John john = new John();
		
		/*
		 * 	public int name;
			private int id;
			protected String illnes;
			String hobby;
		 * 
		 */
		
		String name = john.name;
		String illness = john.illnes;
		String hobby = john.hobby;
		
		john.defaultMethod();
		john.publicMethod();
		john.protectedMethod();
	}

}
