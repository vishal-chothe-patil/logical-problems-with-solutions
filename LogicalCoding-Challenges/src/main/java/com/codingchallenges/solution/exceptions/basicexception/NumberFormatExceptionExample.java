// Write a program to demonstrate NumberFormatException in Java. & Use try-catch-finally to handle it.

package com.codingchallenges.solution.exceptions.basicexception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String str = "abc";
		try {
			int num = Integer.parseInt(str); // Invalid conversion
		} catch (NumberFormatException e) {
			System.out.println("Caught NumberFormatException: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
