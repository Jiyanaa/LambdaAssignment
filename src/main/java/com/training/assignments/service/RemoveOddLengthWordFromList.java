package com.training.assignments.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.assignments.exception.EmptyListException;
import com.training.assignments.interfaces.IRemoveOddLengthWord;

public class RemoveOddLengthWordFromList{
	
	/**
	 * removeIf() method is used to remove element from list based on condition
	 */
	public static IRemoveOddLengthWord removeWords = (list) -> {
		if(list.isEmpty() || list.size()==0) {
			throw new EmptyListException("List should not be empty");
		}
		list.removeIf((s-> s.length()%2!=0));
		return list;
	};

	
	
}
