// Write a program to demonstrate ArrayIndexOutOfBoundsException in Java & use try catch to handle exception ?

package com.codingchallenges.solution.exceptions.basicexception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {

		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]); // Accessing an index out of bounds
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}

}
