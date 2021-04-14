package com.nt.model;

public class Customer {
	// instance variable
	int customerId = 101;
	String customerName = "Saikat";

	// display method
	public void print() {
		System.out.println("Customer Id :" + customerId + "\n Customer Name : " + customerName);
	}

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.print();
	}
}
