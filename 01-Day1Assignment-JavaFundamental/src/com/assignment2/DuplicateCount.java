package com.assignment2;
import java.util.Scanner;

public class DuplicateCount {
	
	public static int findElementCount(int a[],int size,int search) {
		int count=0;
		for(int i=0;i<size;i++) {
			if(a[i]==search)
				count++;
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		System.out.println("Enter " + size + " integer elements");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		 System.out.println("Enter searching element :");
		 int search=sc.nextInt();
		 
		System.out.println(findElementCount(arr,size,search));
	}

}
