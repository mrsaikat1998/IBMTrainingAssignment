package com.bookutil.casestudy;

import java.util.Scanner;

import com.book.casestudy.Book;
import com.book.casestudy.BookStore;
import com.book.exception.IlligalBookIdException;
import com.book.exception.InvalidCategoryException;
import com.book.exception.WrongPriceException;

public class BookUtill {

	public static void main(String[] args) {

		BookStore bookStore = new BookStore();
		System.out.println("Please Tell How Many Book You want to Enter");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println("Book Details : " + i);
			System.out.println("Book Id : ");
			String bookId = sc.next();
			System.out.println("Enter Book Title : ");
			String bookTitle = sc.nextLine();
			System.out.println("Enter Author Name : ");
			String bookAuthor = sc.nextLine();
			System.out.println("Enter book Category : ");
			String category = sc.next();
			System.out.println("Enter Book Price : ");
			float bookPrice = sc.nextFloat();
			try {
				bookStore.addBook(new Book(bookId, bookTitle, bookAuthor, category, bookPrice));
			} catch (IlligalBookIdException e) {
				System.out.println(e);
			} catch (InvalidCategoryException e) {
				System.out.println(e);
			} catch (WrongPriceException e) {
				System.out.println(e);
			}catch (Exception e) {
				System.out.println(e);
			}
		}	
		bookStore.searchByTitle("Math");
		System.out.println();
		bookStore.searchByAuthor("Maity");
		System.out.println();
		bookStore.display();
	}

}

