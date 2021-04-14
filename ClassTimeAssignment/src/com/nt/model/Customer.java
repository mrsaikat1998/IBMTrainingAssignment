package com.nt.model;

public class Customer {
	// instance variable
	int customerId;
	String customerName;

	//display method
	public  void print() {
		System.out.println("Customer Id :" + customerId + "\n Customer Name : " + customerName);
	}
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.customerId=101;
		customer1.customerName="Saikat";
		customer1.print();
	}
}
