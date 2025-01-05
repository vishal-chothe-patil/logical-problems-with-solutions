// Write a program to demonstrate ArithmeticException (division by zero) & use try catch to handle exception ?
package com.codingchallenges.solution.exceptions.basicexception;

public class ArithmeticExceptionExample {
	
    public static void main(String[] args) {
    	
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
