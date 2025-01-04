package com.codingchallenges.solution.tofind;

import java.util.Arrays;

public class LexicographicalMiddleString {

    public static void main(String[] args) {

        // Define an array of strings
        String[] arr = {"banana", "apple", "grape", "kiwi", "orange"};

        // Sort the array lexicographically
        Arrays.sort(arr);

        // Determine the middle index
        int middleIndex = arr.length % 2 == 0 ? (arr.length / 2) - 1 : arr.length / 2;

        // Get the middle string
        String middleString = arr[middleIndex];

        System.out.println("Lexicographical middle string: " + middleString);
    }
}
