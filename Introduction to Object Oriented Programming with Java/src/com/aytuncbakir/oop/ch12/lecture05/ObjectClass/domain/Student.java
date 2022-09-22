package com.aytuncbakir.oop.ch12.lecture05.ObjectClass.domain;


public class Student  implements Cloneable{
	int no;
	String name;
	double grade;

	public Student(int no, String name, double grade) {
		this.no = no;
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + "]";
	}

	@Override
	public boolean equals(Object o) {
		Student p1 = (Student)o;
		boolean b = false;
		if (no == p1.no & grade == p1.grade & name.equals(p1.name))
			b = true;
		return b;
	}
//	
	public int hashCode(){
		return no + (int) grade + name.hashCode();
	}
	
	@Override
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}
}
