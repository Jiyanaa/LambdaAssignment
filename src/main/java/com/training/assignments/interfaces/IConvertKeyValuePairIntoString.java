package com.training.assignments.interfaces;

import java.util.HashMap;

import com.training.assignments.exception.EmptyListException;

public interface IConvertKeyValuePairIntoString {
	
	public StringBuilder convertToString(HashMap<String,String> map) throws EmptyListException;

}
