package com.aytuncbakir.oop.ch12.lecture05.overloadingvsoverriding;

public class BB extends AA{
	
	@Override
	public void method1(int i) {
		
	}
	
	// overload   --- same name but different interface
	public void method1(String i) {
		
	}

}
