package com.numberutils.validation;

import java.util.Scanner;

public class ValidateMobileNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile Number: ");
		String mobile = sc.next();

		if (mobile.matches("[6-9]\\d{9}")) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("In-valid Mobile Number");
		}

	}

}
