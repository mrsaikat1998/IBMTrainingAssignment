import java.util.Scanner;

public class MaximumSumEvenOdd {
	
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
