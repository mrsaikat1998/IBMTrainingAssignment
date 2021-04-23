package com.collection.demo;

public class Book {
	private String bookID;
	private String bookTitle;
	private String author;
	private String category;
	private float price;

	public Book(String bookID, String bookTitle, String author, String category, float price) {
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "bookID : " + bookID + "\n bookTitle : " + bookTitle + "\nauthor : " + author + "\ncategory : "
				+ category + "\nprice=" + price;
	}

}
