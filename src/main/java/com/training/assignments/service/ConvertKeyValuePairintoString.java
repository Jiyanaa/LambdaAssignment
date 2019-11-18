package com.training.assignments.service;

import com.training.assignments.exception.EmptyListException;
import com.training.assignments.interfaces.IConvertKeyValuePairIntoString;

public class ConvertKeyValuePairintoString {
	
	public static IConvertKeyValuePairIntoString convert = (map) -> {
		if(map.isEmpty()) {
			throw new EmptyListException("Map is empty");
		}
		StringBuilder builder = new StringBuilder();
		map.entrySet().stream().forEach(s->builder.append(s));
		return builder;
	};

}
