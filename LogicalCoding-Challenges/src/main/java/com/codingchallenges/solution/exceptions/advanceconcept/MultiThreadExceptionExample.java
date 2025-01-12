package com.codingchallenges.solution.exceptions.advanceconcept;

public class MultiThreadExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in thread: " + e.getMessage());
            }
        });

        thread.start();
    }
}
