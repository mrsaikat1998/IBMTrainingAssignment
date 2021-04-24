package com.booksort.arraylist;

public class Book implements Comparable<Book>{
	private String bookID;
	private String bookTitle;
	private String author;
	private float price;

	public Book() {

	}

	public Book(String bookID, String bookTitle, String author, float d) {
		super();
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.author = author;
		this.price = d;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "bookID=" + bookID + ", bookTitle=" + bookTitle + ", author=" + author + ", price=" + price + "\n";
	}

	@Override
	public int compareTo(Book o) {
		return this.bookID.compareTo(o.bookID);
	}

}
