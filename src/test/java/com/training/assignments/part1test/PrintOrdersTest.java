package com.training.assignments.part1test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.model.Order;
import com.training.assignments.service.PrintOrders;

public class PrintOrdersTest {
	Order order1,order2,order3,order4;
	ArrayList<Order> orderList;
	@Before
	public void setup() {
		order1 = new Order(30000, "ACCEPTED");
		order2 = new Order(10000,"REJECTED");
		order3 = new Order(5000,"REJECTED");
		order4 = new Order(50000,"ACCEPTED");
		orderList = new ArrayList<Order>();
		
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
	}
	@Test
	public void testForPrintOrders() {
		Order[] expected = {order1,order4};
		ArrayList<Order> result = PrintOrders.print.printOrders(orderList);
		for (Order order : result) {
			System.out.println("Order price:"+order.getPrice()+" Order Status:"+order.getStatus());
		}
		assertArrayEquals(expected, PrintOrders.print.printOrders(orderList).toArray());
		
	}

}
