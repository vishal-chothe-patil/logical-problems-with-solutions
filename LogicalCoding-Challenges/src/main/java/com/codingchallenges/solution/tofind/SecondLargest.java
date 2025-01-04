package com.codingchallenges.solution.tofind;

public class SecondLargest {

	public static void main(String[] args) {

		// Define an array of integers
		int[] arr = { 10, 55, 14, 45, 99 };

		// Initialize the largest and second largest values to the minimum possible
		// value
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		// Loop through the array to find the largest and second largest values
		for (int num : arr) {
			// If the current number is greater than the largest value
			if (num > largest) {
				secondLargest = largest; // Update the second largest to be the current largest
				largest = num; // Update largest to the current number
			}
			// If the current number is greater than the second largest and not equal to the
			// largest
			else if (num > secondLargest && num != largest) {
				secondLargest = num; // Update second largest
			}
		}

		// Print the second largest number in the array
		System.out.println("Second largest number: " + secondLargest);
	}
}
