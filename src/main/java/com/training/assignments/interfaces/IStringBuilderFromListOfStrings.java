package com.training.assignments.interfaces;

import java.util.List;

import com.training.assignments.exception.EmptyListException;

public interface IStringBuilderFromListOfStrings {
	
	public StringBuilder formString(List<String> input) throws EmptyListException;
}
