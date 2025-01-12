package com.codingchallenges.solution.exceptions.advanceconcept;

class CustomException extends Exception {
    private int errorCode;

    public CustomException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

public class CustomExceptionWithDetailsExample2 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom error occurred", 404);
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage() + ", Error Code: " + e.getErrorCode());
        }
    }
}
