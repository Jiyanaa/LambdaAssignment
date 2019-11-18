package com.training.assignments.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.training.assignments.model.Employee;

/**
 * @author swayadav
 *
 */
/**
 * @author swayadav
 *
 */
public class BuiltInFunctionalInterface {
	
	static Employee employee = new Employee();
	
	/**
	 * supplier interface test 
	 * by default supplier interface has get() method
	 * It returns employee object
	 */
	public static Supplier<Employee> supplier = () -> {
		return new Employee(102, "Priya", 50000);
	};
	
	
	/**
	 * IntSupplier interface test 
	 * by default intSupplier interface has getAsInt() method
	 * test for returns employee id from method
	 */
	public static IntSupplier intSupplier = () -> {
		return employee.getEmployeeId();
	};
	
		
	/**
	 * DoubleSupplier interface test 
	 * by default doubleSupplier interface has getAsDouble() method
	 * test for returns employee salary from method
	 */
	public static DoubleSupplier doubleSupplier = () -> {
		return employee.getSalary();
	};


	
	/**
	 * BooleanSupplier interface test 
	 * by default booleanSupplier interface has getAsBoolean() method
	 * test for returns employee salary from method
	 */
	public static BooleanSupplier booleanSupplier = () -> {
		if(employee.getSalary() > 20000)
			return true;
		else
			return false;
	};
	
	
	/**
	 * Consumer interface test 
	 * by default consumer interface has accept()  and andThen() method
	 * consumer interface does not return any value it takes only one parameter as argument
	 */
	public static Consumer<Employee> consumer = (emp) -> {
			System.out.println("Enployee Details:\n" +emp.getEmployeeId()+", "
					+emp.getEmployeeName()+", "+emp.getSalary());
	};

	/**
	 * predicate interface is used to check condition and return boolean result
	 */
	public static Predicate<Employee> predicate = (emp) -> {
		if(emp.getSalary() > 50000)
			return true;
		else
			return false;
	};
	
	/**
	 * function interface has apply() abstract method 
	 * which accept argument of type and return result of type r
	 */
	public static Function<List<Employee>,List<String>> function = (employees) -> {
		List<String> names = new ArrayList();
		for (Employee employee : employees) {
			if(employee.getSalary()>30000) {
				names.add(employee.getEmployeeName());
			}
		}
		return names;
	};
	
}
