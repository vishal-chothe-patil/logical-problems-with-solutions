// Write a program to demonstrate FileNotFoundException in Java & usage with throw and throws?

package com.codingchallenges.solution.exceptions.basicexception;

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }

    // Using `throws` keyword to declare the exception
    public static void readFile(String fileName) throws FileNotFoundException {
        // `throw` keyword to throw the exception
        throw new FileNotFoundException("File not found: " + fileName);
    }
}
