package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.stream.IntStream;

public class MiddleElementOfArrayJava8 {

	    public static void main(String[] args) {

	        // Define an array of integers
	        int[] arr = {1, 6, 17, 2, 5, 3, 7};

	        // Find the middle element using Java 8 features
	        int middleIndex = arr.length / 2;
	        int middle = IntStream.range(0, arr.length)
	                              .filter(i -> i == middleIndex)
	                              .map(i -> arr[i])
	                              .findFirst()
	                              .orElseThrow(() -> new IllegalArgumentException("Array is empty"));

	        System.out.println("Middle number is " + middle);
	    }
	}
