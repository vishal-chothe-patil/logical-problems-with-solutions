package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.stream.IntStream;

public class FactorialOfNumberJava8 {

    public static void main(String[] args) {

        // Define the number for which we want to find the factorial
        int num = 7;

        // Use IntStream to generate numbers from 1 to num and reduce them by multiplying
        int fact = IntStream.rangeClosed(1, num)  // Generate numbers from 1 to num
                            .reduce(1, (a, b) -> a * b);  // Multiply them together to get the factorial

        // Print the result
        System.out.println(num + " is Number and Factorial : " + fact);
    }
}
