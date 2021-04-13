package com.sm.fibbonachi;

public class EvenNo100To1000 {

	public static void main(String[] args) {
		int firstNo = 0, secoundNo = 1, nextNo = 0;

		for (int i = 0; i < 100; i++) {
			nextNo = firstNo + secoundNo;

			if (nextNo % 2 == 0) {
				if (nextNo >= 100 && nextNo <= 1000)
					System.out.print(nextNo + " ");
			}

			firstNo = secoundNo;
			secoundNo = nextNo;

		}
	}

}
