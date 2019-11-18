package com.training.assignments.part1test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.training.assignments.exception.EmptyListException;
import com.training.assignments.service.ConvertKeyValuePairintoString;

public class ConvertKeyValuePairintoStringTest {

	@Test
	public void testToPrintStringForValidInput() throws EmptyListException {
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("name1", "Aradhya");
		map.put("name2","Bindu");
		map.put("name3", "Anagha");
		
		StringBuilder s = ConvertKeyValuePairintoString.convert.convertToString(map);
		System.out.println(s);
	}

	@Test(expected = EmptyListException.class)
	public void testForEmptyMap() throws EmptyListException {
		HashMap<String,String> map = new HashMap<String, String>();
		
		StringBuilder s = ConvertKeyValuePairintoString.convert.convertToString(map);
		System.out.println(s);
	}

}
