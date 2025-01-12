package com.codingchallenges.solution.exceptions.advanceconcept;

public class RethrowException {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }

    static void methodA() throws Exception {
        try {
            throw new Exception("Original Exception");
        } catch (Exception e) {
            System.out.println("Caught in method A");
            throw e; // Rethrow the exception
        }
    }
}