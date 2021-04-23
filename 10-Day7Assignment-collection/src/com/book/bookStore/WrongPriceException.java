package com.book.bookStore;

public class WrongPriceException extends Exception {
	public WrongPriceException() {
	}

	public WrongPriceException(String s) {
		super(s);
	}
}
