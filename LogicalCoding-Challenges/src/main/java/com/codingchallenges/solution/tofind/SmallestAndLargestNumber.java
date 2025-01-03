package com.codingchallenges.solution.tofind;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 6, 7, 4, 5, 3 };

		// Initialize smallest and largest with the first element of the array
		int smallest = arr[0];
		int largest = arr[0];

		// Loop through each number in the array
		for (int num : arr) {
			// Check if the current number is smaller than the smallest value
			if (num < smallest) {
				smallest = num; // Update smallest
			}
			// Check if the current number is larger than the largest value
			if (num > largest) {
				largest = num; // Update largest
			}
		} 

		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);
	}
}
