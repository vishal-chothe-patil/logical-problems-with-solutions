// Write a program in Java to find a duplicate character in a string.

package com.codingchallenges.solution.tofind;

import java.util.HashSet;

public class DuplicateCharacter {

	public static void main(String[] args) {

		String s = "Vishal Chothe";

		// Create a HashSet to store characters as we encounter them in the string
        HashSet<Character> set = new HashSet<Character>();

        // Iterate over each character in the string using toCharArray()
        for (char c : s.toCharArray()) {

            // Try to add the character to the HashSet
            // If the character is already in the set, add() will return false
            // meaning it is a duplicate character
            if (!set.add(c)) {
                // If add() returns false, print the duplicate character
                System.out.println("Duplicate Character : " + c);

                // Once a duplicate is found, stop further checking
                break;
            }
		}

	}
}
