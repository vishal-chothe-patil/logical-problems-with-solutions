package com.codingchallenges.solution.tofind;

public class MiddleElementOfArray {

	public static void main(String[] args) {

		// Define an array of integers
		int[] arr = { 1, 6, 17, 4, 5, 3, 7 };

		// Find the middle element
		int middleIndex = arr.length / 2;
		int middle = arr[middleIndex];

		System.out.println("Middle number : " + middle);
	}
}
