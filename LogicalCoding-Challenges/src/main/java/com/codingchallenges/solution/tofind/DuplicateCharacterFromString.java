package com.codingchallenges.solution.tofind;

public class DuplicateCharacterFromString {

	public static void main(String[] args) {

		String str = "Chothe Patil";

		// Loop to find duplicates
		for (int i = 0; i < str.length(); i++) {
			// Compare the current character with the subsequent characters
			for (int j = i + 1; j < str.length(); j++) {
				// If a duplicate is found
				if (str.charAt(i) == str.charAt(j)) {
					// Print the duplicate character
					System.out.println("Duplicate character: " + str.charAt(i));
					// Break the inner loop to avoid printing the same character multiple times
					break;
				}
			}
		}
	}
}
