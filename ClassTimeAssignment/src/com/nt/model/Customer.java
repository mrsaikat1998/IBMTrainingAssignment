package com.nt.model;

public class Customer {
	// instance variable
	int customerId;
	String customerName;
	
	// constructor
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public void print() {
		System.out.println("Customer Id :"+customerId+"\n Customer Name : "+customerName);
	}
}
