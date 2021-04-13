import java.util.Scanner;



public class LargestArray {
	
	public static void largestArray(int []first,int []secound) {
		int[] large=new int[first.length];
		for(int i=0;i<first.length;i++) {
			if(first[i]>secound[i])
				large[i]=first[i];
			else
				large[i]=secound[i];
		}
		System.out.println("Largest Array Is :");
		for(int i=0;i<large.length;i++) {
			System.out.print(large[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int size=sc.nextInt();
		System.out.println("enter "+size+" element for first array");
		int []firstArray=new int[size];
		for(int i=0;i<size;i++) {
			firstArray[i]=sc.nextInt();
		}
		System.out.println("enter "+size+" element for secound array");
		int []secoundArray=new int[size];
		for(int i=0;i<size;i++) {
			secoundArray[i]=sc.nextInt();
		}
		largestArray(firstArray, secoundArray);
	}

}
