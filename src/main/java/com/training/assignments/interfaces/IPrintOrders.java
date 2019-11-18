package com.training.assignments.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.training.assignments.model.Order;

@FunctionalInterface
public interface IPrintOrders {
	
	public ArrayList<Order> printOrders(List<Order> orderList);

}
