package com.assignment2;
import java.util.Scanner;

public class Car {

	private static int productDigits(int distance) {
		int no = distance;
		if (no < 0 && no > 32767)
			return -1;
		int product = 1;
		while (no > 0) {
			int rem = no % 10;
			product = product * rem;
			no = no / 10;
		}
		return product;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// take inputs from user
		System.out.println("Enter Your travelled Km");
		int distance = sc.nextInt();
		// call the methods and get game score
		int score = productDigits(distance);
		// formatt the o/p
		if (score < 0)
			System.out.println("Invalid Input");
		else
			System.out.println(score);

	}

}
