package com.codingchallenges.solution.exceptions.basicexception;

import java.util.concurrent.*;

public class TimeoutExceptionExample {
	
    public static void main(String[] args) {
        try {
            simulateTimeout();
        } catch (TimeoutException e) {
            System.out.println("Caught TimeoutException: " + e.getMessage());
        }
    }

    public static void simulateTimeout() throws TimeoutException {
        throw new TimeoutException("Operation timed out!"); // Manually throwing the exception
    }
}
