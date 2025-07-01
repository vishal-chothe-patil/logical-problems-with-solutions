package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbersJava8 {

    public static void main(String[] args) {

        // Input array of numbers
        int[] number = { 1, 2, 3, 2, 4, 5, 6, 3 };

        // Convert the array into a list and process it with Java 8 Streams
        List<Integer> numberList = Arrays.stream(number)
            .boxed()  // Convert the int[] to Integer objects
            .collect(Collectors.toList());

        // Use groupingBy to count occurrences of each number and filter duplicates
        numberList.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Count occurrences of each number
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)  // Keep only the entries where the count is greater than 1 (duplicates)
            .map(Map.Entry::getKey)  // Extract the duplicate numbers (keys)
            .forEach(num -> System.out.println("Duplicate number: " + num));  // Print the duplicates
    }
}
