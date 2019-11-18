package com.training.assignments.part1test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.service.BuiltInFunctionalInterface;
import com.training.assignments.service.Employee;

/**
 * @author swayadav
 *
 */
public class BuiltInFunctionalInterfaceTest {
	
	//BuiltInFunctionalInterface object = new BuiltInFunctionalInterface();;
	
	@Test
	public void testForSupplierInterface() {
		Employee employee = BuiltInFunctionalInterface.supplier.get();
		assertEquals("Priya", employee.getEmployeeName());
		
	}
	
	@Test
	public void testForIntSupplierInterface() {
		int employeeId = BuiltInFunctionalInterface.intSupplier.getAsInt();
		assertEquals(101,employeeId);	
	}
	
	@Test
	public void testForDoubleSupplierInterface() {
		double salary = BuiltInFunctionalInterface.doubleSupplier.getAsDouble();
		assertEquals(30000,salary,0.01);	
	}
	
	/**
	 * Boolean supplier test
	 */
	@Test
	public void testForBooleanSupplierInterface() {
		boolean result = BuiltInFunctionalInterface.booleanSupplier.getAsBoolean();
		assertEquals(true,result);	
	}
	
	/**
	 * Consumer Interface test
	 * It accept employee as parameter and show employee details
	 */
	@Test
	public void testForConsumerInterface() {
		Employee employee = new Employee(102,"Shrutwa",40000);
		BuiltInFunctionalInterface.consumer.accept(employee);
	}
	
	/**
	 * if the current employee salary is greater than 40000  then test return true 
	 * otherwise it return false
	 */
	@Test
	public void testForPredicateInterfaceRetuenFalseValue() {
		Employee employee = new Employee(102,"Shrutwa",40000);
		boolean result = BuiltInFunctionalInterface.predicate.test(employee);
		assertEquals(false, result);
	}
	
	/**
	 * if the current employee salary is greater than 40000  then test return true 
	 * otherwise it return false
	 */
	@Test
	public void testForPredicateInterfaceRetuenTrueValue() {
		Employee employee = new Employee(103,"Anagha",80000);
		boolean result = BuiltInFunctionalInterface.predicate.test(employee);
		assertEquals(true, result);
	}
	
	
	/**
	 * if the current employee salary is greater than 30000  then test return employee name list 
	 * otherwise it return false
	 */
	@Test
	public void testForFunctionInterfaceRetuenTrueValue() {
		Employee employee1 = new Employee(103,"Anagha",80000);
		Employee employee2 = new Employee(102,"Priya",30000);
		Employee employee3 = new Employee(101,"Krishna",20000);
		Employee employee4 = new Employee(104,"Veda",40000);
		
		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(employee1,employee2,employee3,employee4));
		List<String> result = BuiltInFunctionalInterface.function.apply(empList);
		
		List<String> expected = new ArrayList<String>(Arrays.asList("Anagha","Veda"));
		System.out.println(result);
		assertEquals(expected, result);
	}
	
	
	
	
	
	
	
	
	
	

}
