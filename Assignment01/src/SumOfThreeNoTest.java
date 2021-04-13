import java.util.Scanner;

public class SumOfThreeNoTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First No :");
		int firstNo=sc.nextInt();
		System.out.println("Enter Secound No :");
		int secoundNo=sc.nextInt();
		System.out.println("Enter Third No :");
		int thirdNo=sc.nextInt();
		int sum=firstNo+secoundNo+thirdNo;
		System.out.println("Sum : "+firstNo+" + "+secoundNo+" + "+thirdNo+" = "+sum);

	}

}
