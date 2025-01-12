package com.codingchallenges.solution.exceptions.advanceconcept;

import java.util.Arrays;
import java.util.List;

public class LambdaExceptionHandling {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "a", "3");

        numbers.forEach(num -> {
            try {
                int parsed = Integer.parseInt(num);
                System.out.println(parsed);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + num);
            }
        });
    }
}
