package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.Arrays;
import java.util.Optional;

public class LexicographicalMiddleStringJava8 {

    public static void main(String[] args) {

        // Define an array of strings
        String[] arr = {"watermelon", "apple", "grape", "kiwi", "orange"};

        // Sort the array lexicographically using Arrays.sort()
        Arrays.sort(arr);

        // Determine the middle index and find the lexicographical middle string using Java 8 Stream API
        Optional<String> middleString = Optional.ofNullable(
                arr.length % 2 == 0
                        ? arr[(arr.length / 2) - 1]  // For even length, take the smaller middle string
                        : arr[arr.length / 2]         // For odd length, take the exact middle string
        );

        // Output the middle string
        middleString.ifPresent(middle -> System.out.println("Lexicographical middle string: " + middle));
    }
}
