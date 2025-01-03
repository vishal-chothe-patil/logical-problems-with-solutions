package com.codingchallenges.solution.tofind;

public class DuplicateElementFromArray {

	public static void main(String[] args) {

		int[] numbers = { 11, 12, 13, 12, 14, 14, 15, 16, 13 };

		// Outer loop to go through each element in the array
		for (int i = 0; i < numbers.length; i++) {
			// Inner loop to compare the current element with all subsequent elements
			for (int j = i + 1; j < numbers.length; j++) {
				// Check if the current element is equal to a subsequent element
				if (numbers[i] == numbers[j]) {
					// Print the duplicate number if a match is found
					System.out.println("Duplicate Element From Array: " + numbers[i]);
					// Exit to avoid checking the same number again
					break;
				}
			}
		}
	}
}
