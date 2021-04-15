package com.nt.main;

import com.nt.model.Address;
import com.nt.model.Customer;

public class TestCustomer {

	public static void main(String[] args) {	
		Customer cust = new Customer("John", new Address("1st Main HSR Layout", "Bengaluru"), new Address("Ist Main Electronics city ","Bangalore"));
		System.out.println(cust.getCustomerDetails());
	}

}
