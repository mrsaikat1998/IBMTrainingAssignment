package com.lms.assignment1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("Enter Number Of student");
		int studentCount = sc.nextInt();
		for (int i = 0; i < studentCount; i++) {
			System.out.println("Enter Marks");
			int mark = sc.nextInt();
			al.add(mark);
		}
		
		Collections.sort(al);
		System.out.println("Highest Marks :"+al.get(al.size()-1));
		int total=0;
		double average=0.0;
		for(int i=0;i<al.size();i++) {
			int num=(int) al.get(i);
			total=total+num;
			average =total/studentCount;
		}
		System.out.println("Average Marks : "+average);
		System.out.println("3rd Student marks : "+al.get(2));
		System.out.print("Stored : ");
		for (int i = 0; i < studentCount; i++) {
			System.out.print((i+1)+" - "+al.get(i)+" ");
		}
	}

}
