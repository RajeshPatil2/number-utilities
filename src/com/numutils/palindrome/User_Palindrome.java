package com.numutils.palindrome;

import java.util.Scanner;

public class User_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int original_Number = number, reversed_Number = 0;
		
		while(number > 0) {
			int digit = number % 10;
			reversed_Number = reversed_Number * 10 + digit;
			number = number / 10;
		}
		
		if (original_Number == reversed_Number) {
			System.out.println(original_Number + " is a palindrome Number");
		} else {
			System.out.println(original_Number + " is a Not palindrome Number");
		}
	}

}
