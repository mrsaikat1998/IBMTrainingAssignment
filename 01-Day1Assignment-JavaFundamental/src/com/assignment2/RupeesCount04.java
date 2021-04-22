package com.assignment2;
import java.util.Scanner;

public class RupeesCount04 {

	public static int countRupes(int no) {
		if (no <= 0)
			return -1;
		int[] a = { 500, 100, 50, 10, 5, 2, 1 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			while (no >= a[i]) {
				no = no - a[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter School fees");
		int fees = sc.nextInt();
		System.out.println("Rupees Count : " + countRupes(fees));
	}

}

/*4. Ram needs to pay the school fees of his 6 year old kid. As he is busy with his work, he is not finding time to go to the school to make payment. His kid's school doesn't accept online payment. So he decided to send the fee amount through his kid. The available denominations of rupees or coins is 500, 100, 50, 10, 5, 2 and 1. Can you write a program to find the minimal number of coins or notes to be given to his kid?
		 
Include a function named countRupees that accepts an integer and returns an integer that corresponds to the minimal number of coins/rupee notes. The function returns -1 if the input is negative.
 
Input and Output Format:

Input consists of a single integer that corresponds to the fee amount to be paid.
Output consists of an integer that corresponds to the minimal number of coins or rupee notes.
 
Print Invalid Input if the input value is negative.
 
 
Sample Input 1:
682
 
Sample Output 1:
8
 
Sample Input 2:
-2345
 
Sample Output 2:
Invalid Input
*/
