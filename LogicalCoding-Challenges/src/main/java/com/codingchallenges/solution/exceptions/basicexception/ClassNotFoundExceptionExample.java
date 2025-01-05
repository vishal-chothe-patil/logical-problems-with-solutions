// Write a program to demonstrate ClassNotFoundException in Java & use try catch to handle exception ?

package com.codingchallenges.solution.exceptions.basicexception;

public class ClassNotFoundExceptionExample {
	
    public static void main(String[] args) {
    	
        try {
            // This will throw a ClassNotFoundException
            Class.forName("com.nonexistent.Class"); // Attempt to load a class that does not exist
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
