package com.exception.assignment4;

import java.text.ParseException;
import java.util.Scanner;

public class TestAgeCalculatetor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB (dd/mm/yyyy) : ");
		int age = 0;
		String dob = sc.next();
		try {
			age = AgeCalculator2.calculateAge(dob);
		} catch (InvalidDOBException e) {
			System.out.println(e.getMessage());
		}
		if (age != 0)
			System.out.println("Current age : " + age);
	}
}
