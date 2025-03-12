package com.numberutils.validation;

import java.util.Scanner;

public class MaskMobileNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile Number: ");
		String mobile = sc.next();

		// Check if mobile number is exactly 10 digits
		if (mobile.matches("\\d{10}")) {
			String masked = mobile.substring(0, 2) + "******" + mobile.substring(8);
			System.out.println("Masked Number: " + masked);
		} else {
			System.out.println("Invalid Number");
		}

	}

}
