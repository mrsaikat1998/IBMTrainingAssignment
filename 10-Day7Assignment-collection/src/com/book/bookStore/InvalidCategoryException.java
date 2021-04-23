package com.book.bookStore;

public class InvalidCategoryException extends Exception {
	public InvalidCategoryException() {
	}

	public InvalidCategoryException(String s) {
		super(s);
	}
}
