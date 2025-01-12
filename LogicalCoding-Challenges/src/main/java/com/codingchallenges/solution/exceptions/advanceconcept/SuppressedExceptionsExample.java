package com.codingchallenges.solution.exceptions.advanceconcept;

public class SuppressedExceptionsExample {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            throw new Exception("Exception in try");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("Suppressed: " + suppressed);
            }
        }
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Exception in close");
    }
}
