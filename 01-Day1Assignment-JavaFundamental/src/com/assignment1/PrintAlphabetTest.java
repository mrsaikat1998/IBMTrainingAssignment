package com.assignment1;
import java.util.Scanner;

public class PrintAlphabetTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Current Alphabet :");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			for (char i = ch; i <= 'Z'; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (char i = ch; i <= 'z'; i++) {
				System.out.print(i + " ");
			}
		}
	}
}
