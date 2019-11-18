
package com.training.assignments.part1test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.training.assignments.exception.EmptyListException;
import com.training.assignments.service.RemoveOddLengthWordFromList;

public class RemoveOddLengthWordFromListTest {

	RemoveOddLengthWordFromList object = new RemoveOddLengthWordFromList();
	
	@Test
	public void testToRemoveOddLegthWordFromList() throws EmptyListException {
		 List<String> input = new ArrayList<>();
	     input.add("Anagha");
	     input.add("Priya");
	     input.add("Aradhya");
	     input.add("Shubra");
	     List<String> result= RemoveOddLengthWordFromList.removeWords.removeWord(input);
	     System.out.println(result);
	     
	     List<String> expected = Arrays.asList("Anagha","Shubra");
	     assertEquals(expected, result);		
	}

	@Test(expected = EmptyListException.class)
	public void testToRemoveOddLegthWordFromEmptyList() throws EmptyListException {
		 List<String> input = new ArrayList<>();
		 RemoveOddLengthWordFromList.removeWords.removeWord(input);		
	}
}
