package com.codingchallenges.solution.tofind;

public class FactorialOfNumber {

	public static void main(String[] args) {

		// Define the number for which we want to find the factorial
		int num = 7;

		// Initialize fact to 1, as the factorial of a number is the product of all numbers from 1 to num
		int fact = 1;

		// Loop to multiply each number from 1 to num
		for (int i = 1; i <= num; i++) {
			// Multiply the current value of fact by i to compute the factorial
			fact *= i;
		}

		System.out.println(num + " is Number and Factorial : " + fact);
	}
}
