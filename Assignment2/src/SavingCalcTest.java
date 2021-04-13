import java.util.Scanner;

public class SavingCalcTest {

	public static void calculateSal(int salary, int shifts)  {
		int foodCost, travelCost, shiftEarn, savingMoney;
		
		foodCost = salary * 20 / 100;
		travelCost = salary * 30 / 100;
		shiftEarn = salary * 2 / 100;
		savingMoney = ((salary + shiftEarn) - (foodCost + travelCost));
		
		System.out.println(savingMoney);
		if(savingMoney>8000)
			System.out.println("Salary too large");
		else if(salary<0)
			System.out.println("Salary too small");
		
		if(shifts<0)
			System.out.println("Shifts too small");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		System.out.println("Enter Shift Count :");
		int shifts = sc.nextInt();
		calculateSal(salary, shifts) ;

	}

}
