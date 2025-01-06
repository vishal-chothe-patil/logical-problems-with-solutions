// How does IllegalArgumentException occur? Demonstrate with an example.
package com.codingchallenges.solution.exceptions.basicexception;

public class IllegalArgumentExceptionExample {
	
    public static void main(String[] args) {
    	
        try {
            validateAge(-5); // Invalid argument
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative."); // `throw`
        }
    }
}
