package com.codingchallenges.solution.tofind;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestJava8 {

    public static void main(String[] args) {

        // Define an array of integers
        int[] arr = {10, 20, 4, 45, 99};

        // Find the second largest number using Java 8 Streams
        OptionalInt secondLargest = Arrays.stream(arr)
                                          .distinct()  // Remove duplicates
                                          .sorted()    // Sort the stream in ascending order
                                          .skip(arr.length - 2) // Skip all elements except the last two
                                          .findFirst();  // Get the first element, which will be the second largest

        // Print the second largest number
        if (secondLargest.isPresent()) {
            System.out.println("Second largest number: " + secondLargest.getAsInt());
        } else {
            System.out.println("There is no second largest number.");
        }
    }
}
