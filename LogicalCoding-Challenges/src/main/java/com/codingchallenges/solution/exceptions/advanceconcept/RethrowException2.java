package com.codingchallenges.solution.exceptions.advanceconcept;

import java.io.FileNotFoundException;

public class RethrowException2 {
    public static void main(String[] args) {
        try {
            processFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    public static void processFile() throws FileNotFoundException {
        try {
            throw new FileNotFoundException("File not found during processing.");
        } catch (FileNotFoundException e) {
            System.out.println("Caught in processFile, rethrowing...");
            throw e; // Rethrowing the exception
        }
    }
}
