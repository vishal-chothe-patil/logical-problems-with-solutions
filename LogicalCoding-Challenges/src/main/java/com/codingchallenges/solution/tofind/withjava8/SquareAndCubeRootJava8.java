package main.java.com.codingchallenges.solution.tofind.withjava8;

import java.util.Arrays;

public class SquareAndCubeRootJava8 {

    public static void main(String[] args) {

        int num = 81;

        // Use Java 8 Streams to calculate the square root and cube root
        Arrays.asList(num)  // Wrap the number in a list to use streams (if needed for more numbers)
            .forEach(n -> {
                double squareRoot = Math.sqrt(n);
                double cubeRoot = Math.cbrt(n);

                System.out.println("Square root of " + n + ": " + squareRoot);
                System.out.println("Cube root of " + n + ": " + cubeRoot);
            });
    }
}
