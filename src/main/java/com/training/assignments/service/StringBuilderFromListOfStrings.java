package com.training.assignments.service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import com.training.assignments.exception.EmptyListException;
import com.training.assignments.interfaces.IStringBuilderFromListOfStrings;

public class StringBuilderFromListOfStrings {
	
	static IStringBuilderFromListOfStrings stringBuilder = (list) -> {
		StringBuilder tempString = new StringBuilder();
		list.stream().map(s->tempString.append(s.charAt(0))).toArray();
		return tempString;
	};

	public static Consumer<List<String>> consumer = (words) -> {
		try {
			StringBuilder result = stringBuilder.formString(words);
			System.out.println(result);
		} catch (EmptyListException e) {
			System.out.println("Empty list");
		}
	};


}
