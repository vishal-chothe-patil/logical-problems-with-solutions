// Write a program to demonstrate NullPointerException & use try-catch to handle exception ?
package com.codingchallenges.solution.exceptions.basicexception;

public class NullPointerExceptionExample {
	
    public static void main(String[] args) {
    	
        try {
            String str = null;
            System.out.println(str.length()); // Attempting to access length of a null object
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
