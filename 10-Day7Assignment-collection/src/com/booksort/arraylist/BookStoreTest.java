package com.booksort.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookStoreTest {

	public static void main(String[] args) {
		//create ArrayList Object
		List<Book> bookList=new ArrayList<>();
		//adding some book
		bookList.add(new Book("A321", "Core Java", "PT Rao", 452.0f));
		bookList.add(new Book("M301", "Advanced Java", "KR Saw", 752.0f));
		bookList.add(new Book("P421", "Spring", "Bala Guru", 1252.0f));
		bookList.add(new Book("K321", "Hibernate", "John P", 352.0f));
		
		System.out.println(bookList);
		Collections.sort(bookList);
		System.out.println(bookList);
		Collections.sort(bookList, new BookTitleComparator());
		System.out.println(bookList);
		Collections.sort(bookList, new BookAuthorComparator());
		System.out.println(bookList);
		Collections.sort(bookList, new BookPriceComparator());
		System.out.println(bookList);
	}

}
