package com.aytuncbakir.oop.ch12.lecture05.finals;

public class FFF {
	
	final public void instanceMethod() {}
	
	final public static void staticMethod() {}

}


class GGG extends FFF {
//	
//	public void instanceMethod() {}
//	public static void staticMethod() {}
	public void instanceMethodGGG() {}
	
}

class HHH extends GGG {
	
	// that is ok
	final public void instanceMethodGGG() {}
	
}

