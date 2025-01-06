package com.codingchallenges.solution.exceptions.basicexception;

import java.util.*;

public class ConcurrentModificationExceptionExample {

    public static void main(String[] args) {
        try {
            // Step 1: Create a list and add elements separately
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");

            // Step 2: Iterate and modify the list to trigger ConcurrentModificationException
            for (String item : list) {
                list.add("D"); // Modifying list during iteration
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException: " + e.getMessage());
        }
    }
}
