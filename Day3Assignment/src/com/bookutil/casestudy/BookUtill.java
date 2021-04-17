package com.bookutil.casestudy;

import com.book.casestudy.Book;
import com.book.casestudy.BookStore;

public class BookUtill {

	public static void main(String[] args) {

		BookStore bookStore = new BookStore();
		
		bookStore.addBook(new Book("B101", "Java", "Bala", "Technology", 599.0f));
		bookStore.addBook(new Book("B102", "Physics", "Maity", "Science", 745.0f));
		bookStore.addBook(new Book("B103", "Math", "DKroy", "Fiction", 699.0f));

		bookStore.searchByTitle("Math");
		System.out.println();
		bookStore.searchByAuthor("Maity");
		System.out.println();
		bookStore.display();
	}

}
