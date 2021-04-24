package com.sm.fibbonachi;

public class FibbonachiFirst10NatTest {

	public static void main(String[] args) {
		int firstNo=0, secoundNo=1,nextNo=0;
		System.out.print(firstNo+" "+secoundNo+" ");
		for(int i=0;i<10;i++) {
			nextNo=firstNo+secoundNo;
			System.out.print(nextNo+" ");
			firstNo=secoundNo;
			secoundNo=nextNo;
		}

	}

}
