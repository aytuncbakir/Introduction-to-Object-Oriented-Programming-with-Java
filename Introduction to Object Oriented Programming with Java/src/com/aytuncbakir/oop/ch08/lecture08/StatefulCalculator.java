package com.aytuncbakir.oop.ch08.lecture08;

import java.util.ArrayList;
import java.util.List;

public class StatefulCalculator {
	
	private String name;
	private List<Double> results;  // Problem!!!  n - value : full memory problem
	int firstOperand;
	int secondOperand;
	double result;
	char operator;	
	StatelessCalculator calculator = new StatelessCalculator();

	public StatefulCalculator(String name) {
		this.name = name;
		this.results = new ArrayList<Double>();
	}

	public double getLastResult() {
		if(results.size() > 0) {
			double last = results.get(results.size() - 1);
			results.remove(results.size() - 1);
			return last;
		}
		System.out.print("No results available : ");
		return 0;
	}
	
	public void clearResults() {
		results.removeAll(results);
		System.out.println("Results have cleared: " + results.size());
	}
	
	public double getResult() {
		boolean isOperandCorrect = true;
		switch(operator){
			case '+':	result = calculator.addition(firstOperand, secondOperand); break;
			case '-':	result = calculator.subtraction(firstOperand, secondOperand); break;
			case '*':	result = calculator.multiplication(firstOperand, secondOperand); break;
			case '/':	result = calculator.division(firstOperand, secondOperand); break;
			default : 
						System.out.println("Please insert a correct operand"); 
						isOperandCorrect = false;
						result = 0;
			
			break;
		}
		if(isOperandCorrect)
			results.add(result);
		return result;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFirstOperand() {
		return firstOperand;
	}

	public void setFirstOperand(int firstOperand) {
		this.firstOperand = firstOperand;
	}

	public int getSecondOperand() {
		return secondOperand;
	}

	public void setSecondOperand(int secondOperand) {
		this.secondOperand = secondOperand;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	public void setResult(double result) {
		this.result = result;
	}

	
}
