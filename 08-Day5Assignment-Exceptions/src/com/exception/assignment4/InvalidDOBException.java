package com.exception.assignment4;

public class InvalidDOBException extends Exception {
	@Override
	public String getMessage() {
		return "Date Of Birth can not be after current Date";
	}
}
