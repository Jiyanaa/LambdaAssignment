package com.training.assignments.service;

import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceAllWordsWithUppercase {
	
	public static UnaryOperator<List<String>> unaryOperator = (list) -> {
		if(list.size() ==0 ) {
			throw new NullPointerException("Please provide non empty list");
		}
		list.replaceAll(s-> s.toUpperCase());
		return list;
	};

}
