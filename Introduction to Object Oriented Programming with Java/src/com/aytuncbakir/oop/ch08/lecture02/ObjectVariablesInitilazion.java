package com.aytuncbakir.oop.ch08.lecture02;

import com.aytuncbakir.oop.ch03.lecture08.Student;

public class ObjectVariablesInitilazion {
	
	public byte b;
	public short s;
	public int i;
	public long l;
	public float f;
	public double d;
	public boolean bb;
	public char c;
	public String str;
	public Student st;
	// no need to give initial value to object variables
	
	public void method() {
		// local variables have to given a initial value
//		int x;
//		System.out.println(x);
		
		// All values are default
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);
		System.out.println(c);
		System.out.println(str);
		System.out.println(st);
	}	
	
	// no need to give initial value to object variables
	// local variables have to given a initial value
	// ???
	// The object must ALWAYS be in a meaningful state. 
	// But holding a object in n a meaningful state responsibility is programmers' responsibility.
	
}
