package com.book.casestudy;

public class Book {
	private String bookID;
	private String bookTitle;
	private String author;
	private String category;
	private float price;

	public Book(String bookID, String bookTitle, String author, String category, float price) {
		String s = "" + bookID.charAt(0);
		if (s.equals("B") && bookID.length() == 4)
			this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.author = author;
		if (category.equals("Science") && category.equals("Fiction") && category.equals("Technology")
				&& category.equals("Others"))
			this.category = category;
		if (price >= 0)
			this.price = price;
	}

	@Override
	public String toString() {
		return "bookID : " + bookID + "\n bookTitle : " + bookTitle + "\nauthor : " + author + "\ncategory : "
				+ category + "\nprice=" + price;
	}

}
