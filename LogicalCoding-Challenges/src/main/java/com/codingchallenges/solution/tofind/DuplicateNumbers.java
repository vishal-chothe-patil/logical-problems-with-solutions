package com.codingchallenges.solution.tofind;

import java.util.HashSet;

public class DuplicateNumbers {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 2, 4, 5, 6, 3 };

		// Create a HashSet to store unique numbers as we encounter them in the array
		HashSet<Integer> set = new HashSet<>();

		// Iterate over each number in the array
		for (int num : number) {

			// Try to add the number to the HashSet
			// If the number is already in the set, add() will return false
			// meaning it is a duplicate number
			if (!set.add(num)) {
				// If add() returns false, print the duplicate number
				System.out.println("Duplicate number: " + num);
			}
		}
	}
}
