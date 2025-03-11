package com.numutils.factorial;

import java.util.Scanner;

public class User_Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " = " + fact);
		sc.close();
	}

}
