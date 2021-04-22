package com.assignment1;

public class FactorialTest {

	public static void main(String[] args) {
		int no=5;
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of 5 : "+fact);
	}

}
