package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.Arrays;

public class MissingNumberJava8 {

    public static void main(String[] args) {

        // Define the array with numbers where one number is missing
        int[] arr = {13, 14, 15, 16, 18, 19};

        // Sort the array (ensure min and max are correct)
        Arrays.sort(arr);

        // Find the minimum and maximum values using streams
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        // Calculate the sum of numbers from min to max (inclusive)
        int expectedSum = (max - min + 1) * (min + max) / 2;

        // Calculate the actual sum of elements in the array
        int arrSum = Arrays.stream(arr).sum();

        // The missing number is the difference between the expected sum and the actual sum
        int missingNumber = expectedSum - arrSum;

        System.out.println("Missing number is " + missingNumber);
    }
}
