package com.training.assignments.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.training.assignments.exception.EmptyListException;

/**
 * @author swayadav
 *
 */
public class PrintNumberListUsingThread {
		
	/**
	 * Consumer interface test 
	 * by default consumer interface has accept()  and andThen() method
	 * consumer interface does not return any value it takes only one parameter as argument
	 * Runnable Interface is used to print the number list
	 */
	public static Consumer<List<Integer>> consumer = (list) -> {	
		if(list.isEmpty()) {
			throw new NullPointerException("List is empty");
		}
			Runnable runnable = () ->{
				for (Integer number : list) {
					System.out.print(number+" ");
				}
			};
			
			runnable.run();
	};
	
	
	
	/**
	 * here we use thread class and runnable interface to print list of numbers
	 */
	public static Consumer<List<Integer>> consumer1 = (list) -> {	
		if(list.isEmpty()) {
			throw new NullPointerException("List is empty");
		}
		Thread t = new Thread(new Runnable() {			
			@Override
			public void run() {
				for (Integer number : list) {
					System.out.print(number+" ");
				}
			}
		});
		t.start();	
	};

}
