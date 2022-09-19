package com.aytuncbakir.oop.ch09.lecture04;

public class NotEssentialThis {
	
	private int field1 ;
	public String field2;
	protected boolean field3;
    char field4;
    public int field5 = this.field1 * 2;    // this can be omit
 //   public int field5 = field1 * 2;  
    
//    public int this.field6 = 6;  // compile error
    
    public void method() {
//    	this = new Duck();  // error
    	Duck duck = new Duck("DuckDuck");
    }
    
    public void method1() {
    	this.field2  = "Hello"; // this can be omit
    }
    
    void method2() {
    	this.field4 = 'C';// this can be omit
    	this.method3(); // this can be omit
    }
    
    private void method3() {
    	System.out.println(this.field5);// this can be omit
    }
    
//    public void method1() {
//    	field2  = "Hello"; 
//    }
//    
//    void method2() {
//    	field4 = 'C';
//    	method3(); 
//    }
//    
//    private void method3() {
//    	System.out.println(field5);
//    }

}
