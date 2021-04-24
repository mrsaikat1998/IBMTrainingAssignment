package com.sm.fibbonachi;

public class SumOfNoLessThan100 {

	public static void main(String[] args) {
		int firstNo = 0, secoundNo = 1, nextNo, sum = 0;

		for (int i = 0; i < 100; i++) {
			nextNo = firstNo + secoundNo;

			if (nextNo % 2 != 0)
				sum = sum + nextNo;

			firstNo = secoundNo;
			secoundNo = nextNo;

			if (nextNo >= 100)
				break;
		}
		System.out.println("Sum = " + sum);
	}

}
