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
	//display method
	public  void print() {
		System.out.println("Customer Id :" + customerId + "\n Customer Name : " + customerName);
	}
	public static void main(String[] args) {
		Customer customer1 = new Customer(101, "Saikat");
		customer1.print();
	}
}
