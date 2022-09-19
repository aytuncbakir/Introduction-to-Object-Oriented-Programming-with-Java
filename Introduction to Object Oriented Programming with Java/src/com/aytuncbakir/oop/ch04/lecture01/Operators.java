package com.aytuncbakir.oop.ch04.lecture01;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.aytuncbakir.oop.ch03.lecture08.Student;

public class Operators {

	public static void main(String[] args) {

		int x = 5;

		// unary operator
		// operator operand or operand operator
		x++;
		++x;
		// binary operator
		// operand operator operand
		x = x + x;
		// ternary operator
		// operand ? operand : operand
		x = x > 5 ? 7 : 9;

//			
//		assignmentOperator();
//		aritmeticOperators();
//		compoundAssignment();
//		aritmeticPromotion();
//		unaryAritmeticOperators();
//		decrementAndIncrementOperators();
//		unaryLogicalOperator();
//		relationalOperators();
//		conditionalOperators();
//		rangeComparision();
//		ternaryOperator();
//		bitwiseLogicalOperator();
		shiftOperators();
	}


	private static void assignmentOperator() {
		System.out.println("---------------------------------");
		System.out.println("Assignment Operator");
		// Value assigment
		int x = 5;
		boolean b = true;
		double d = 123.7;
		float f = 3.14f;

		System.out.println(x);
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);

		// Object assignment
		Student student = new Student();
		System.out.println(student.isActive);

		// Assignment is an expression, so it has a value.
		int z = (3 * 7 % 2) + 9 / 3;
		System.out.println(z);
		System.out.println("---------------------------------");

	}

	private static void aritmeticOperators() {
		System.out.println("---------------------------------");
		System.out.println("aritmetic Operators");
		// There are 5 aritmetic operators
		// addition + , substraction -, multiplication *, divition / and remainder %

		int x;
		int y = 56;
		int z = 6;

		x = y + z;
		System.out.println(x);
		x = y - z;
		System.out.println(x);
		x = y * z;
		System.out.println(x);
		x = y / z;
		System.out.println(x); // ???
		x = y % z;
		System.out.println(x);

//		y + z;  //Syntax error on token "+", invalid AssignmentOperator
		x = (y + z) % 5;
		System.out.println(x);
		System.out.println("---------------------------------");

	}

	private static void compoundAssignment() {
		// +, -, *, /, %, &, |, ^,<<, >> and >>> also =
		System.out.println("---------------------------------");
		System.out.println("Compound assignment");
		int x = 5;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		x += 1;
		System.out.println(x);
		x *= 5;
		System.out.println(x);
		x %= 3;
		System.out.println(x);
		x /= 2;
		System.out.println(x);
		System.out.println("---------------------------------");

	}

	private static void aritmeticPromotion() {

		// her hangi bir aritmetic islemin sonucu en azindan int bir degerdir.

		double doubleValue = 5;
		float floatValue = 1.4f;
		long longValue = 3l;
		int intValue = 7;

		doubleValue = doubleValue + floatValue + longValue + intValue; // if double is exist
		floatValue = floatValue + longValue + intValue;// if double is not exist but float is exist
		longValue = longValue + intValue; // if double and float is not exist but long is exist

		byte byteValue1 = 24;
		byte byteValue2 = 13;

//		byte sum = byteValue1 + byteValue1 ;  // error cast is needed
		// solution1
		// byte sum = (byte)byteValue1 + byteValue1; // is there still any error ?
		byte sum = (byte) (byteValue1 + byteValue1);
		int sum1 = byteValue1 + byteValue1;

	}

	private static void unaryAritmeticOperators() {
		// + (adding + does not turn to positive),
		// - (turn to negative) ,
		// ++ (increase 1),
		// -- (decrease 1)

		int a = -2;
//		+a;
//		-a;

		System.out.println("a: " + a);
		a++;
		System.out.println("a: " + a);
		++a;
		System.out.println("a: " + a);
		a--;
		System.out.println("a: " + a);
		--a;
		System.out.println("a: " + a);

//		++a--; // Invalid argument to operation ++/--

		int x = -5;
		int y = +x;
		System.out.println("+ operator does not turn to positive, " + y);

		y = -x;
		System.out.println("- operator turns to positive, " + y);

		byte byteValue1 = 4;
//		byte byteValue2 = -byteValue1; // Type mismatch: cannot convert from int to byte
		byte byteValue2 = (byte) -byteValue1;

//		byte byteValue3 = byteValue1;
//		byte byteValue3 = +byteValue1;   // tekli islecler de ikili islecler gibi en az bir int sonuc uretirler.
		byte byteValue3 = (byte) +byteValue1;

	}
	
	private static void decrementAndIncrementOperators() {
		// ++ , --
		
		// no promotion, bu operatorler ile yapilan islemlerde veri tipi aynen kalir.	
		byte b = 5;
		byte i = ++b; 
		
		byte b1 = 6;
//		byte j = -b1;
		
		int a = 0;
		++a; // pre-increment
		--a; // pre-decrement
		a++; // post-increment
		a--; // post-decrement
		
		int x = 5;
		System.out.println("Initial x: "+ x);
		System.out.print("Value of x after post-increment (x++) : ");
		System.out.println(x++);
		System.out.print("Value of x after pre-increment (++x) : ");
		System.out.println(++x);
		System.out.print("Value of x after post-decrement (x++) : ");
		System.out.println(x--);
		System.out.print("Value of x after pre-decrement (++x) : ");
		System.out.println(--x);
		
	}
	
	private static void unaryLogicalOperator() {
		// !
		
		boolean b = true;
		System.out.println(b);
		b = !b;
		System.out.println(b);
		b = !b;
		System.out.println(b);
		
		b = !(3 > 4 ? false : true);
		System.out.println(b);
		
	}
	
	private static void relationalOperators() {
		// >, <, >=, <=, ==, !=
		
		// result is boolean
		// >, <, >=, <= are takes primitive integer or real value, two boolean value or reference
		boolean b ;
		 b = 3 > 4.1f;
		 System.out.println("b: "+b);
		 b = 3d < 4;
		 System.out.println("b: "+b);
		 b = 3l <= 4;
		 System.out.println("b: "+b);
		 b = 3 >= 4;
		 System.out.println("b: "+b);
		 
		// result is boolean
		// ==, != are takes primitive integer or real value
		 
		 boolean b2 = true;
		 boolean b3 =  !(3 > 4 || 7 < 5);
		 
		 boolean b4 = (b2 == b3);
		 System.out.println("b4: "+b4);
		 b4 = (b2 != b3);
		 System.out.println("b4: "+b4);
		 
		 Student student = new Student("12345", "Efe Can");
		 Student student1 = new Student("12345", "Efe Can");
		 
		
		 // References
		 boolean b5 = (student==student1);
		 System.out.println("b5: "+b5);
		 
		 Student  student2 = student;
		 boolean b6 = (student2==student);
		 System.out.println("b6: "+b6);
		 
		 String s1 = new String("Hello World!");
		 String s2 = new String("Hello World!");
		 System.out.println(s1 == s2);
		 s1 = s2;
		 System.out.println(s1 == s2); 
		 
		 // constant variable
		 String s3 = "Hello World!";
		 System.out.println(s1 == s3);
		 System.out.println(s2 == s3);
		
		 
	}
	
	private static void conditionalOperators() {
		// and - &, or - |, xor - ^, not - !, andshortcut- && , orshortcut|| 
		
		boolean b1 = true;
		boolean b2 = true;
		if(b1 & b2)
			System.out.println("All is true");
		
		b1 = true;
		b2 = false;
		if(b1 | b2)
			System.out.println("At least one true");
		
		boolean b3 = false;
		if(!b3)
			System.out.println("Now b3 became true");
		
		boolean b4 = true;
		if(b4 && method())
			System.out.println("b4 true method will not work");
		
		if(b4 && method1())
			System.out.println(" print will not work");
		
		b4 = false;
		if(b4 && method1())
			System.out.println(" print will not work");
		
	}
	
	private static void rangeComparision() {
		
		int i = 6;
//		boolean b1 = 4 < i < 9; // compile error
		
		boolean b1 = (4 < i) & (i < 9) ;
		System.out.println(b1);
		
	}
	
	private static void ternaryOperator() {
		
		int i = 5;
		boolean b1 = 4 < i ? true : false ;
		System.out.println(b1);
		
		int x = 4 < i ? i++ : i-- ;
		System.out.println(x);
		x = 7;
		int y = 9;
		String whichMethodWorked = x < y ? method3() : method4() ;
//		String whichMethodWorked1 = 3 > 4 ? method3() : method4() ;
		System.out.println(whichMethodWorked);
		
	}
	
	private static void bitwiseLogicalOperator() {
		int a = 3; //  0011
		int b = 12; // 1100
		
		int c = a & b;  // 0000
		System.out.println(a + " & " + b + " = " + c);
		
		
		System.out.println(); 
		
		int d = a | b;//1111
		System.out.println(a + " | " + b + " = " + d);
		
		System.out.println();
		
		int e = a ^ b; //1111
		System.out.println(a + " ^ " + b + " = " + e);
		
		
		System.out.println();
		
	
		byte b1 = 5;   // 
		long l = ~b1;
		System.out.println("b1  = " + b1 + ", l = " + l);
		
		byte b2 = 7;   // 
		l = ~b2;
		System.out.println("b2  = " + b2 + ", l = " + l);
	}
	
	private static void shiftOperators() {
		
		//  >>  shift to right   --> divide by 2
		int x = 5;   //101
		x = x >> 1;   //10
		System.out.println(x);
		
		//  <<  shift to left --> multiply by 2
	    x = 5;   //101
		x = x << 1;   //1010
		System.out.println(x);
		
		//  >>>  shift to right without sign
		x = 5;   //101
		x = x >>> 1;   //010
		System.out.println(x);
		
		x = 16;   //1100
		x = x >>> 2;   //0011
		System.out.println(x);
		
	//  <<< shift to left without sign  -- böyle bir operator yok  :)
		
	}
	
	
	
	private static boolean method() {
		System.out.println("Method works");
		return true;
	}
	
	private static boolean method1() {
		System.out.println("Method1 works");
		return false;
	}
	
	private static String method3() {
		return "method3";
		
	}
	
	private static String method4() {
		return "method4";
	}

}
