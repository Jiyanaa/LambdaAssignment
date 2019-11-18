package com.training.assignments.part1test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.training.assignments.exception.EmptyListException;
import com.training.assignments.service.StringBuilderFromListOfStrings;

public class StringBuilderFromListOfStringsTest {
	StringBuilderFromListOfStrings s = new StringBuilderFromListOfStrings();

	@Test
	public void test() throws EmptyListException {
		List<String> list = new ArrayList<String>();
		list.add("Harshal");
		list.add("eliyanaa");
		list.add("lusy");
		list.add("lucifer");
		list.add("om");
		
		StringBuilderFromListOfStrings.consumer.accept(list);
	
	}

}
