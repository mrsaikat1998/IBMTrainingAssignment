package com.assignment.two;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer cust1=null;
		System.out.println("Enter Customer Id");
		String custId=sc.nextLine();
		System.out.println("Enter Customer Name");
		String custName=sc.nextLine();
		System.out.println("Enter Customer Category");
		String custCategory=sc.nextLine();
		try {
			cust1=new Customer(custName, custName, custCategory);
		} catch (InvalidInputException e) {
			System.out.println(e);
		}
	}

}
