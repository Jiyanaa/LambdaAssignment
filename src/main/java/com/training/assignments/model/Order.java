package com.training.assignments.model;

public class Order {
	
	private double price;
	private String status;
	

	public Order(double price, String status) {
		super();
		this.price = price;
		this.status = status;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	

}
