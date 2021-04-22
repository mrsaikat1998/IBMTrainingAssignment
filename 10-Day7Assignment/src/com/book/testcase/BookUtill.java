package com.book.testcase;

import java.util.Scanner;

public class BookUtill {

	public static void main(String[] args) {

		BookStore bookStore = new BookStore();
		System.out.println("Please Tell How Many Book You want to Enter");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.println("Book Details : " + i);
			System.out.println("Book Id : Starts with B and length is 4 ");
			String bookId = sc.next();
			sc.nextLine();
			System.out.println("Enter Book Title : ");
			String bookTitle = sc.nextLine();
			System.out.println("Enter Author Name : ");
			String bookAuthor = sc.nextLine();
			System.out.println("Enter book Category : Science | Fiction | Technology | Other ");
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

