package com.assignment2;
import java.util.Scanner;

public class FahrenheitToCelsius {
	public static float convertToCentigrade(int fahrenheit){
		float celsius = ((fahrenheit - 32) * 5) / 9;
		return celsius;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in fahrenheit");
		int fahrenheit=sc.nextInt();
		if(fahrenheit<0) {
			System.out.println("Invalid input");
			System.exit(fahrenheit);
		}
		System.out.println(convertToCentigrade(fahrenheit));
	}

}
