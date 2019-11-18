package com.training.assignments.part1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.interfaces.IArithmeticOperation;
import com.training.assignments.service.ArithmeticOperation;

/**
 * @author swayadav
 *
 */
/**
 * @author swayadav
 *
 */
public class ArithmeticOperationTest {
	
	ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
	
	
	/**
	 * addition of two number
	 */
	@Test
	public void testForAdd() {
		assertEquals(25, arithmeticOperation.addition(12,13));
		
	}
	
	
	/**
	 * subtraction of two number
	 */
	@Test
	public void testForSubtraction() {
		assertEquals(30, arithmeticOperation.subtraction(70,40));
	}
	
	
	/**
	 * multiplication of two number
	 */
	@Test
	public void testForMultiplication() {
		assertEquals(1200, arithmeticOperation.multiply(30,40));
	}

	
	/**
	 * division of two number
	 */
	@Test
	public void testForDivision() {
		assertEquals(2, arithmeticOperation.division(80,40));
	}
	
	/**
	 * division of two number
	 * divided by zero exception
	 */
	@Test(expected = ArithmeticException.class)
	public void testForDivisionOfZero() {
		arithmeticOperation.division(30, 0);
	}
}
