package com.codingchallenges.solution.tofind;

import java.util.Arrays;

public class SumAverageOfNumberJava8 {
	
    public static void main(String[] args) {
       
        int[] arr = {10, 20, 30, 40, 50, 60};

        // Calculate the sum using Java 8 Streams
        int sum = Arrays.stream(arr).sum();

        // Calculate the average using Java 8 Streams
        double average = Arrays.stream(arr).average().orElse(0.0);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
