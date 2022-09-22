package com.aytuncbakir.oop.ch12.lecture04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class HidingExample {

	public static void main(String[] args) {
//		BaseClass b = new BaseClass(10, true);
//		System.out.println("b.i: " + b.i);
//		BaseClass.g();
//		b.printInfo();
//		
//		System.out.println();

		SubClass sc = new SubClass(20, false, 30, (byte) 120, 40);
		System.out.println("sc.i: " + sc.i);
//		System.out.println(sc.super.i); // Can't say this!
		sc.printInfo();	// Inherited method
		
		sc.printInfoUsingSuper();
	}
}
