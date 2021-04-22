package com.assignment1;
import java.util.Scanner;

public class CubeOfNumbers1to10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no between 1 to 10 :");
		int no=sc.nextInt();
		int cube=no;
		for(int i=1;i<3;i++) {
			cube=cube*no;
		}
		System.out.println(cube);
	}

}
