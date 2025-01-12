package com.codingchallenges.solution.exceptions.advanceconcept;

public class ExceptionChainingExample {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void methodA() throws Exception {
        try {
            throw new IllegalArgumentException("Root Cause");
        } catch (IllegalArgumentException e) {
            throw new Exception("Chained Exception", e); // Link cause
        }
    }
}
