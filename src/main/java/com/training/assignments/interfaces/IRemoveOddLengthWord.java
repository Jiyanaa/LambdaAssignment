package com.training.assignments.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.training.assignments.exception.EmptyListException;

public interface IRemoveOddLengthWord {
	
	public List<String> removeWord(List<String> input) throws EmptyListException;

}
