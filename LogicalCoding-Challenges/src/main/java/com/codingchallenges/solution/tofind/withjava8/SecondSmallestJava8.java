package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondSmallestJava8 {

    public static void main(String[] args) {
    
        int[] arr = {10, 20, 14, 45, 99};
        
        // Find the second smallest number using Java 8 Streams
        OptionalInt secondSmallest = Arrays.stream(arr)
                                           .distinct()  // Remove duplicates
                                           .sorted()    // Sort the stream in ascending order
                                           .skip(1)     // Skip the smallest element
                                           .findFirst(); // Get the first element, which will be the second smallest
        
        // Print the second smallest number
        if (secondSmallest.isPresent()) {
            System.out.println("Second smallest number: " + secondSmallest.getAsInt());
        } else {
            System.out.println("There is no second smallest number.");
        }
    }
}
