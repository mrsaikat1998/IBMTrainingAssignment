package com.assignment1;

public class PrimeCommandLineTest {

	public static void main(String[] args) {
		
		int no=Integer.parseInt(args[0]);
		boolean flag=false;
		for( int i=2;i<no-1;i++) {
			if(no%i==0) {
			flag=true;
			break;
			}
		}
		if(flag==true)
			System.out.println(no+" is Not a Prime No");
		else
			System.out.println(no+" is a Prime No ");
	}

}
