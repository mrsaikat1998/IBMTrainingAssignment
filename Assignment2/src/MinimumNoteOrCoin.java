import java.util.Scanner;

public class MinimumNoteOrCoin {
	
	public static int countRupes(int fees) {
		if(fees<0)
			return -1;
		int no=fees;
		int[] rupes=new int[7];
		rupes[0]=500;rupes[0]=100;rupes[0]=50;rupes[0]=10;rupes[0]=2;rupes[0]=1;
		int count=0;
		for(int i=0;i<7;i++) {
			while(no>rupes[i]) {
				count++;
				no=no-rupes[i];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Scool Fees");
		int fees=sc.nextInt();
		System.out.println(countRupes(fees));
	}

}
