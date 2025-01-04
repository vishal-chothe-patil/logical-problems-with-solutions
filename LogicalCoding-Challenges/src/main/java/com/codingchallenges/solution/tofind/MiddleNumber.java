package com.codingchallenges.solution.tofind;

import java.util.Arrays;

public class MiddleNumber {

    public static void main(String[] args) {

        // Define an array of integers
        int[] arr = {21, 26, 17, 25, 23, 27};

        // Sort the array
        Arrays.sort(arr);

        // Determine the middle index
        int middleIndex;
        if (arr.length % 2 == 0) {
            // For even-length arrays, choose the smaller middle index
            middleIndex = (arr.length / 2) - 1;
        } else {
            // For odd-length arrays, choose the exact middle index
            middleIndex = arr.length / 2;
        }

        // Find the middle number
        int middle = arr[middleIndex];

        System.out.println("Middle number : " + middle);
    }
}
