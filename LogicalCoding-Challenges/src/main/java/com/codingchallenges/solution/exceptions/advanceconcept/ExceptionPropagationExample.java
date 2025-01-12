package com.codingchallenges.solution.exceptions.advanceconcept;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        throw new Exception("Exception propagated from method2.");
    }
}
