package com.numutils.missingnumber;

import java.util.Scanner;

public class User_MissingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Input: Range of numbers
		System.out.println("Enter total numbers (n): ");
		int n = sc.nextInt();

		int arr[] = new int[n - 1]; // Array of size (n - 1), one number is missing

		// Input: Numbers from the user
		System.out.println("Enter " + (n - 1) + " numbers:");
		for (int i = 0; i < n - 1; i++) {
			arr[i] = sc.nextInt();
		}

		// Calculate expected sum of numbers from 1 to n
		int expectedSum = n * (n + 1) / 2;

		// Calculate actual sum of input numbers
		int actualSum = 0;
		for (int num : arr) {
			actualSum = actualSum + num;
		}

		// Find the missing number
		int missing = expectedSum - actualSum;
		System.out.println("missing : " + missing);

		sc.close();
	}

}
