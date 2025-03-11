package com.numutils.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0, b = 1, n = 10;

		System.out.println("Fibonacci Series " + a + " = " + b);
		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;
		}
	}

}
