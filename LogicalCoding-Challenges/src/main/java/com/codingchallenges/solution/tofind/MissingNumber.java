package com.codingchallenges.solution.tofind;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        // Define the array with numbers where one number is missing
        int[] arr = {13, 14, 15, 16, 18, 19};
        
        // Sort the array to find the correct min and max values
        Arrays.sort(arr);

        // Find the minimum and maximum values in the array
        int min = arr[0];
        int max = arr[arr.length - 1];

        // Calculate the sum of numbers from min to max
        int expectedSum = 0;
        for (int i = min; i <= max; i++) {
            expectedSum += i;
        }

        // Calculate the sum of elements present in the array
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        System.out.println("Missing number is " + (expectedSum - arrSum));
    }
}
