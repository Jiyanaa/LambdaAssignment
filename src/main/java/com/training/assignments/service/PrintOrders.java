package com.training.assignments.service;


import java.util.ArrayList;
import java.util.Iterator;

import com.training.assignments.interfaces.IPrintOrders;
import com.training.assignments.model.Order;

public class PrintOrders {

	public static IPrintOrders print = (orderlist) -> {
		Iterator<Order> i = orderlist.iterator();
		ArrayList<Order> temp = new ArrayList<Order>();
		while(i.hasNext()) {
			Order current = i.next();
			if(current.getPrice() > 10000 && current.getStatus().equals("ACCEPTED")) {
				temp.add(current);
			}
		}
		return temp;
	};

}
