package com.book.testcase;

import java.util.ArrayList;

public class BookStore {

	ArrayList<Book> books;
	
	public BookStore() {
		books=new ArrayList<>();
	}

	public void addBook(Book b) {
		books.add(b);
	}

	public void searchByTitle(String title) {
		if(books.contains(title))
			System.out.println(books.get(books.indexOf(title)));
	}

	public void searchByAuthor(String author) {
		if(books.contains(author))
			System.out.println(books.get(books.indexOf(author)));
	}

	public void display() {
		System.out.println(books);
	}

}
