package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.Arrays;

public class SmallestAndLargestNumberJava8 {

	public static void main(String[] args) {

		int[] arr = { 1, 6, 7, 4, 5, 3 };

		// Using Java 8 streams to find the smallest and largest numbers
		int smallest = Arrays.stream(arr).min().orElseThrow(() -> new RuntimeException("Array is empty"));
		int largest = Arrays.stream(arr).max().orElseThrow(() -> new RuntimeException("Array is empty"));

		System.out.println("Smallest number using Java8: " + smallest);
		System.out.println("Largest number using Java8: " + largest);
	}
}
