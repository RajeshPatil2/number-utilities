package com.numutils.missingnumber;

public class MissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5 }; // missing number = 4

		int n = 5; // sum of 1 to 5

		int expectedSum = n * (n + 1) / 2; // sum of first n natural numbers (1 to 5)
						 //15  =  5 * 6 / 2 = [expectedSum = 15]
		int actualSum = 0;

		for (int num : arr) {
			actualSum = actualSum + num;
					   // 0 + 1 = 1
					//    1 + 2 = 3
					//    3 + 3 = 6
					//    6 + 5 = 11
		}
		
		int missing = expectedSum - actualSum;
					// 15  - 11 = 4
 		System.out.println("Missing Number: " + missing);
	}

}
