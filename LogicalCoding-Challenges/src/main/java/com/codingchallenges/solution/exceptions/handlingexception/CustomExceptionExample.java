package com.codingchallenges.solution.exceptions.handlingexception;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
	
    public static void main(String[] args) {
    	
        try {
            int age = 15;
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
