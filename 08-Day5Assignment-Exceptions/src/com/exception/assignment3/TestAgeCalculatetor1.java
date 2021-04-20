package com.exception.assignment3;

import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculatetor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB (dd/mm/yyyy) : ");
		String dob = sc.next();
		int age = AgeCalculator1.calculateAge(dob);
		if (age != 0)
			System.out.println(age);
	}
}
