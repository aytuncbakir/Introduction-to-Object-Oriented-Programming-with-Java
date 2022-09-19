package com.aytuncbakir.oop.ch08.lecture08;

public class Test {
	
	public static void main(String[] args) {
		StatelessCalculator statelessCalculator = new StatelessCalculator();
		int a = 45;
		int b = 4;
		System.out.println(a + " + " + b + " = " + statelessCalculator.addition(a, b));
		System.out.println(a + " - " + b + " = " + statelessCalculator.subtraction(a, b));
		System.out.println(a + " * " + b + " = " + statelessCalculator.multiplication(a, b));
		System.out.println(a + " / " + b + " = " + statelessCalculator.division(a, b));
		
		System.out.println();
		
		StatefulCalculator statefulCalculator = new StatefulCalculator("Casio");
		
		statefulCalculator.setFirstOperand(12);
		statefulCalculator.setSecondOperand(4);
		statefulCalculator.setOperator('+');
		
		System.out.println(statefulCalculator.getResult());
		System.out.println(statefulCalculator.getLastResult());
		statefulCalculator.clearResults();
		System.out.println(statefulCalculator.getLastResult());
		
		statefulCalculator.setFirstOperand(12);
		statefulCalculator.setSecondOperand(4);
		statefulCalculator.setOperator('!');
		System.out.println(statefulCalculator.getResult());
		
	}

}
