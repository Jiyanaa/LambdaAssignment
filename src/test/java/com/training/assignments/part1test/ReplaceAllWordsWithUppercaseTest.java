package com.training.assignments.part1test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.training.assignments.service.ReplaceAllWordsWithUppercase;
import com.training.assignments.service.StringBuilderFromListOfStrings;

public class ReplaceAllWordsWithUppercaseTest {

	@Test
	public void testForReplacingEachWordWithUpperCaseEquivallance() {
		List<String> list = new ArrayList<String>();
		list.add("Harshal");
		list.add("eliyanaa");
		list.add("lusy");
		list.add("lucifer");
		list.add("om");
	
		List<String> result =  ReplaceAllWordsWithUppercase.unaryOperator.apply(list);
		System.out.println(result);
		
		List<String> expected = new ArrayList<String>(Arrays.asList("HARSHAL","ELIYANAA","LUSY","LUCIFER","OM"));
		assertEquals(expected, result);
	}
	
	@Test(expected = NullPointerException.class)
	public void testForReplacingEachWordInTheEmptyList() {
		List<String> list = new ArrayList<String>();
		List<String> result =  ReplaceAllWordsWithUppercase.unaryOperator.apply(list);
	}

}
