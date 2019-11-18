package com.training.assignments.part1test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.training.assignments.service.PrintNumberListUsingThread;

public class PrintNumberListUsingThreadTest {
	PrintNumberListUsingThread obj = new PrintNumberListUsingThread();

	/**
	 * test to print number list using runnable Interface
	 */
	@Test
	public void testForPrintNumbersUsingRunnable() {
		List<Integer> list =new ArrayList<Integer>(Arrays.asList(3,15,90,56,34));
		PrintNumberListUsingThread.consumer.accept(list);
	}
	
	
	/**
	 * test to print number list using Thread  class and runnable Interface
	 */
	@Test
	public void testForPrintNumbersUsingThreadClass() {
		List<Integer> list =new ArrayList<Integer>(Arrays.asList(3,15,90,56,34));
		PrintNumberListUsingThread.consumer1.accept(list);
	}
	
	/**
	 * test to print empty number list 
	 */
	@Test(expected = NullPointerException.class)
	public void testForEmptyPrintNumbers() {
		List<Integer> list =new ArrayList<Integer>(Arrays.asList());
		PrintNumberListUsingThread.consumer1.accept(list);
	}
	
	
	
	
	
	


}
