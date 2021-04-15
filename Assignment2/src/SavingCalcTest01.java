import java.util.Scanner;

public class SavingCalcTest01 {

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

/*Karen got salary for this month and she spends 20% of her salary for food and 30% of her salary for travel. If she takes care of other shifts she will get 2% of the salary per day. Given her salary and the number of shifts she handled. Calculate how much she can save in her pocket after spending all these?


Input and Output Format :
First line of input consists of an integer, salary. Next line correspond to the number of shifts. Output consist of an integer, which is saving.


1) Print "Salary too large" when salary is greater than 8000.
2) Print "Shifts too small" when the shift is less than 0.
3) Print "Salary too small" when the salary is less than 0.


Include a method named calculateSal(int salary, int shifts) whose return type is an integer, which is the saving.


Sample Input 1:
7000
5
Sample Output 1:
4200


Sample Input 2:
8001


Sample Output 2:
Salary too large*/

