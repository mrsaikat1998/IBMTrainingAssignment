import java.util.Scanner;

public class RepeatedSalaryTest {

	public static int countRepeaters(int[] salary, int arraySize) {
		int count = 1;
		for (int i = 0; i < arraySize; i++) {
			for (int j = i + 1; j < arraySize - 1; j++) {
				if (salary[i] == salary[j])
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many persion salary you want to enter :");
		int persionCount = sc.nextInt();
		if (persionCount < 0) {
			System.out.println("Invalid Input");
			System.exit(persionCount);
		}
		
		System.out.println("Enter " + persionCount + " persion salary");
		int[] sals = new int[persionCount];
		
		for (int i = 0; i < persionCount; i++) {
			sals[i] = sc.nextInt();
			if (sals[i] < 0) {
				System.out.println("Invalid Input");
				System.exit(i);
			}
		}
		
		int count = countRepeaters(sals, persionCount);

		System.out.println(count);
	}

}
