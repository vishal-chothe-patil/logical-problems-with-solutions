package com.codingchallenges.solution.exceptions.handlingexception;

public class FinallyExample {

	public static void main(String[] args) {

		try {
			int result = 10 / 0; // This will not throw an exception
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
		} finally {
			System.out.println("This block is always executed.");
		}
	}
}
