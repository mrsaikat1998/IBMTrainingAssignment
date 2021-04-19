package com.assignment.one;

public class ExceptionTest {

	public static void main(String[] args) {
		if (args.length == 0)
			System.out.println("No Input Received");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);

			System.out.println(num1 / num2);
		} catch (NumberFormatException nfe) {
			System.out.println("Only Intiger are allow");
		} catch (ArithmeticException ae) {
			System.out.println("Divisible with zero is not possible");
		}

	}
}