package com.codingchallenges.solution.exceptions.advanceconcept;

public class ChainingException {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }

    public static void method1() throws Exception {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            throw new Exception("Error in method1", e); // Chaining exceptions
        }
    }
}

