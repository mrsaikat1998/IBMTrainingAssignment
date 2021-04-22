package com.assignment2;
import java.util.Scanner;

public class MaximumSumEvenOdd03 {
	
	public static int maximumSum(int numbers[], int size){
		int evenSum=0,oddSum=0;
		for(int i=0;i<size;i++) {
			if(numbers[i]%2==0)
				evenSum+=numbers[i];
			else
				oddSum+=numbers[i];
		}
		if(evenSum>oddSum)
			return evenSum;	
		else 
			return oddSum;
	}

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("How many no you want to enter :");
		int noCount = sc.nextInt();
		if (noCount < 0) {
			System.out.println("Invalid Array Size");
			System.exit(noCount);
		}
		
		System.out.println("Enter " + noCount + " Numbers");
		int[] nums = new int[noCount];
		
		for (int i = 0; i < noCount; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] < 0) {
				System.out.println("Invalid Input");
				System.exit(i);
			}
		}
		
		int maxSum = maximumSum(nums, noCount);

		System.out.println(maxSum);

	}

}

/*3.maximumSum
Read the question carefully and follow the input and output format.


Given an Integer array, find out sum of Even and odd Numbers individually and find the maximum.


Input and Output Format :
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. Output consist of maximum of odd and even sum.


1) Print "Invalid array size" when size of the array is a negative number and terminate the program.
2) Print "Invalid input" when there is any negative numbers available in the input array and terminate the program.




Include a method named maximumSum(int numbers[], int size) whose return type is an integer,.


Sample Input 1:
5
12
13
14
15
16


Sample Output 1:
42


Sample Input 2:
-13


Sample Output 2:
Invalid array size
Change using Minimal Coins / Notes*/

