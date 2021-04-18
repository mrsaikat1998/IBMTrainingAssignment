package com.carpooling.object.test;

import java.util.Date;
import java.util.Scanner;

import com.carpooling.object.model.Member;

public class CarPoolingTest {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member=new Member();
		Member []array=new Member[2];
		// first member details
		for(int i=0;i>2;i++) {
			System.out.println("Member :  "+(i+1));
			System.out.println("Id : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("First Name : ");
			String firstName = sc.next();
			System.out.println("Last Name : ");
			String lastName = sc.next();
			System.out.println("Email : ");
			String email = sc.next();
			System.out.println("Mobile No : ");
			String mobileNo = sc.next();
			System.out.println("Lisence No : ");
			String lisenceNo = sc.next();
			System.out.println("Lisence Start Date : ");
			String d1=sc.next();
			Date startDate = new Date(d1);
			System.out.println("Lisence Last Date : ");
			String d2=sc.next();
			Date lastDate = new Date(d2);
			array[i] = new Member(id, firstName, lastName, email, mobileNo, lisenceNo, startDate, lastDate);

		}
		member.compareMember(array[0], array[1]);
	}
}
