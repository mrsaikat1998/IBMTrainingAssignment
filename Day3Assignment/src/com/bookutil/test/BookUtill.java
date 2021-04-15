package com.bookutil.test;

import com.book.model.Book;
import com.book.model.BookStore;

public class BookUtill {

	public static void main(String[] args) {
		
		BookStore bookStore=new BookStore();
		bookStore.addBook(new Book("B101", "Java", "Bala", "Technology", 599.0f));
		bookStore.addBook(new Book("B102", "Physics", "Maity", "Science", 745.0f));
		bookStore.addBook(new Book("B101", "Math", "DKroy", "Friction", 699.0f));
		
		bookStore.searchByTitle("Math");
		bookStore.searchByAuthor("Maity");
		bookStore.display();

	}

}
