package assignment2;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Book book1=new Book();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Book No");
		book1.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Title");
		book1.setTitle(sc.nextLine());
		System.out.println("Enter Author Name");
		book1.setAuthor(sc.nextLine());
		System.out.println("Enter Book Price");
		book1.setPrice(sc.nextFloat());
		
		System.out.println("--------------------------------------");
		//by using super class object what methods we can access
		System.out.println(book1.getBookNo());
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPrice());
		System.out.println("--------------------------------------");
		
		//=============================================
		EngineeringBook ebook=new EngineeringBook();
		System.out.println("Enter Book No");
		ebook.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Title");
		ebook.setTitle(sc.nextLine());
		System.out.println("Enter Author Name");
		ebook.setAuthor(sc.nextLine());
		System.out.println("Enter Book Price");
		ebook.setPrice(sc.nextFloat());
		System.out.println("Enter Book category");
		ebook.setCategory(sc.next());
		
		//What methods we can access by using chield class object
		System.out.println("-------------------------------------");
		System.out.println(ebook.getBookNo());
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getCategory());
		System.out.println(ebook.getPrice());
		System.out.println("-----------------------------------------");
		
		//============================================================
		Book book2=new EngineeringBook();
		System.out.println("Enter Book No");
		book2.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Book Title");
		book2.setTitle(sc.nextLine());
		System.out.println("Enter Author Name");
		book2.setAuthor(sc.nextLine());
		System.out.println("Enter Book Price");
		book2.setPrice(sc.nextFloat());
		
		System.out.println("--------------------------------------");
		//here we use chield class object but reference type is super class then we only access super class methods
		System.out.println(book2.getBookNo());
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		System.out.println(book2.getPrice());
		

	}

}
