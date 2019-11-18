package com.training.assignments.service;


import com.training.assignments.interfaces.IArithmeticOperation;

/**
 * @author swayadav
 *
 */
public class ArithmeticOperation {
	
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	 IArithmeticOperation add = (num1, num2) -> {	
			int result =num1 + num2;
			return result;
	};
	
	IArithmeticOperation subtract = (num1, num2) -> {
		int result = num1 - num2;
		return result;
	};
	
	
	IArithmeticOperation multiply = (num1, num2) -> {
		int result = num1 * num2;
		return result;
	};
	
		
	IArithmeticOperation division = (num1, num2) -> {
		if(num2 == 0) {
			throw new ArithmeticException("Can't be divided by Zero");
		}
		int result = num1 / num2;
		return result;
	};
	
	 public int addition(int num1,int num2) {return add.calculate(num1,num2);}
	 public int subtraction(int num1,int num2) {return subtract.calculate(num1,num2);}
	 public int multiply(int num1,int num2) {return multiply.calculate(num1,num2);}
	 public int division(int num1,int num2) {return division.calculate(num1,num2);}

	

}
