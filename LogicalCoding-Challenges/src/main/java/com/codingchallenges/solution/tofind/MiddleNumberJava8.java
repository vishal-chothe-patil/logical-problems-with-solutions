package com.codingchallenges.solution.tofind;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MiddleNumberJava8 {

    public static void main(String[] args) {

        // Define an array of integers
        int[] arr = {1, 6, 2, 5, 3, 7};

        // Sort the array using Arrays.sort() (no change here as Java 8 doesn't change sorting)
        Arrays.sort(arr);

        // Determine the middle index using Java 8 stream API (for readability)
        int middleIndex = IntStream.range(0, 1)
                                   .map(i -> arr.length % 2 == 0 ? (arr.length / 2) - 1 : arr.length / 2)
                                   .findFirst()
                                   .orElseThrow(() -> new IllegalArgumentException("Array is empty"));

        // Find the middle number
        int middle = arr[middleIndex];

        System.out.println("Middle number : " + middle);
    }
}
