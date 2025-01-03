package com.codingchallenges.solution.tofind;

import java.util.Arrays;
import java.util.Comparator;

public class SmallestAndLargestStringJava8 {

    public static void main(String[] args) {

        String[] arr = { "apple", "orange", "banana", "grape", "kiwi" };

        // Using Java 8 streams to find the smallest and largest strings
        String smallest = Arrays.stream(arr)
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("Array is empty"));

        String largest = Arrays.stream(arr)
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("Array is empty"));

        System.out.println("Smallest string (lexicographically): " + smallest);
        System.out.println("Largest string (lexicographically): " + largest);
    }
}
