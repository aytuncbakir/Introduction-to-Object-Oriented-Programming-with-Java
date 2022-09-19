package com.aytuncbakir.oop.ch03.lecture02;

public class PrimitiveTypeDetails {
	
	
	/* Primitive types - 8
	   - byte	 --- signed    --- tamsayi
	   - short   --- signed	   --- tamsayi
	   - int     --- signed    --- tamsayi
	   - char    --- unsigned
	   - long    --- signed    --- tamsayi
	   - float   --- signed    --- real number
	   - double  --- signed	   --- real number
	   - boolean --- logical
	  */ 
	
	// Complex/Reference type 
		// class, enum, interface
	
	
	// OOP de olmasi gereken sadece complex tiplerin olmasidir. ancak javada ilkel 
	// tiplerde bulunmaktadir.
	
	public static void main(String[] args) {
		
		// Sadece 2 deger alir
		boolean bl = true;
		bl = false;
		
		//Unicode  -- 16bitlik karakterler
		//Unicode karakterleri '\u00A7' seklinde gösterilir
		// 0 - 2 uzeri 16 - 1  = 0 - 65535
		// Karakterler negatif deger alamaz
		//https://unicode-table.com/en/
		char buyukA = 'A';	
		int x = buyukA;
		System.out.println(x);
		//char x = "c";
		//String x = 'c';
		
		
		// embedded 
		byte b = 1;
		
		b = 127;  // 128 ?
		int y = b;
		System.out.println(y);
		
		short s = 2;
		
		int i = 7;
		
		long l = 5l;
		
		int ikilikSayi = 0b100;
		System.out.println(ikilikSayi);
		
		int  sekizlikSayi = 0120;
		System.out.println(sekizlikSayi);
		
		int onAltilikSayi = 0XA;
		System.out.println(sekizlikSayi);
		
		
		
	
	}

}
