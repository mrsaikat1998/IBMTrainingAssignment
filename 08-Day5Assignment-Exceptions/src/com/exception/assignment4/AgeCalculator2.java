package com.exception.assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AgeCalculator2 {
	public static int calculateAge(String dob) throws InvalidDOBException {
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int year = 0;
		try {
			LocalDate ld = LocalDate.parse(dob, format2);
			LocalDate today = LocalDate.now();
			year = Period.between(ld, today).getYears();
		} catch (Exception e) {
			System.out.println("Date of Birth should be in dd/MM/yyyy format");
		}

		if (year <= 0)
			throw new InvalidDOBException();
		return year;

	}
}
