package com.training.assignments.interfaces;

/**
 * @author swayadav
 *
 */
@FunctionalInterface
public interface IArithmeticOperation {

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public int calculate(int number1, int number2);
}
