package com.codingchallenges.solution.exceptions.advanceconcept;

class DetailedException extends Exception {
    private int errorCode;

    public DetailedException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

public class CustomExceptionWithDetailsExample {
    public static void main(String[] args) {
        try {
            throw new DetailedException("Custom error occurred", 404);
        } catch (DetailedException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());
        }
    }
}
