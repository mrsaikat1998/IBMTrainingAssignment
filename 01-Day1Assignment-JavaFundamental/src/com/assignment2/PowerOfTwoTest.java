package com.assignment2;
import java.util.Scanner;

public class PowerOfTwoTest {

	public static int powerOfTwo(int n) {
		if (n <= 0)
			System.out.println("Number too small");
		else if(n>32767)
			System.out.println("Number too large");
		while (n !=1) {
			if (n % 2 != 0)
				return -1;
			n = n / 2;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No :");
		int no = sc.nextInt();
		int i=powerOfTwo(no);
		if(i<0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
