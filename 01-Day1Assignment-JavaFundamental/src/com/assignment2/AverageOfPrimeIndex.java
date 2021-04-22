package com.assignment2;
import java.util.Scanner;

public class AverageOfPrimeIndex {

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static int primeIndexSum(int[] array, int size) {
		int sum = 0;
		int count = 0;
		for (int i = 2; i < size; i++) {
			if (isPrime(i)) {
				count++;
				sum = sum + array[i];
			}
		}
		int avg = sum / count;
		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		if (size < 0) {
			System.out.println("Invalid Array Size");
			System.exit(size);
		}
		System.out.println("enter " + size + " array elements");
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Sum of prrime index : " + primeIndexSum(a, size));
	}

}
