package com.assignment2;
import java.util.Scanner;

public class CrecketerId06 {

	public static void findCricketerId(int []array,int size, int score) {
		System.out.print("Highest Score Cricketer Id : ");
		for(int i=0;i<size;i++) {
			while(score<array[i]) {
				System.out.print(array[i-1]+" ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		if (size < 0) {
			System.out.println("Invalid Size");
			System.exit(size);
		}
		int[] idScore = new int[size];
		System.out.println("Enter Id and Score ");
		for (int i = 0; i < size; i++) {
			idScore[i] = sc.nextInt();
			if (idScore[i] < 0) {
				System.out.println("Invalid Input");
				System.exit(i);
			}
		}
		System.out.println("Enter searching score ");
		int score =sc.nextInt();
		findCricketerId(idScore,size,score);
	}

}

/*6.findCricketerId
Read the question carefully and follow the input and output format.


Given an input array first Index indicates the cricketer’s id and second index indicates the score and so on……Find out the cricketer's id who scored more than given score


Input and Output Format:
First line of input consists of n, the number of elements. Next n lines correspond to the array elements. The next line of the input consists of an integer that corresponds to the given score. Output consists of an integer array, which contains cricketer's id who have scored more than the given score.


1) Print "Invalid array size" when size of the array is negative and terminate the program.
2) Print "Invalid input" when there are any negative numbers available in the input array and terminate the program.
3) Print "Invalid score" when the score is negative.


Include a method named findCricketerId (int array[], int size, int score) whose return type is void.
The output array is stored in a global variable named cricketer.


Sample Input 1:
6
1
1000
5
2000
3
4000
1000


Sample Output 1:
5
3


Sample Input 2:
6
1
1000
5
3000
3
4000
-1000


Sample Output 2:
Invalid score
*/
