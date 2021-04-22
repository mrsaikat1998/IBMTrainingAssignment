package com.assignment2;
import java.util.Scanner;

public class GenerateNewNo {

	public static int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rem = rem + 2;// 5+2
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = sc.nextInt();

		if (no < 0)
			System.out.println("Number too small");
		else if (no > 32767)
			System.out.println("Number too large");

		int i = reverse(no);
		System.out.println(rev(i));

	}

	public static int rev(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		return rev;
	}
}
