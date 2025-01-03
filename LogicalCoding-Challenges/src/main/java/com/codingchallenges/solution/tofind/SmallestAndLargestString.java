package com.codingchallenges.solution.tofind;

public class SmallestAndLargestString {

    public static void main(String[] args) {

        String[] arr = { "apple", "orange","xigua(watermelon)", "banana", "grape", "kiwi" };

        // Initialize smallest and largest with the first element of the array
        String smallest = arr[0];
        String largest = arr[0];

        // Loop through each string in the array
        for (String str : arr) {
            // Check if the current string is smaller than the smallest value
            if (str.compareTo(smallest) < 0) {
                smallest = str; // Update smallest
            }
            // Check if the current string is larger than the largest value
            if (str.compareTo(largest) > 0) {
                largest = str; // Update largest
            }
        }

        System.out.println("Smallest string (lexicographically): " + smallest);
        System.out.println("Largest string (lexicographically): " + largest);
    }
}
