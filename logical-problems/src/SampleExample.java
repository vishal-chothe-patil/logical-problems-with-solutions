/* This Java program calculates the sum of the first 10 natural numbers
         using a for loop and prints the result. */
public class SampleExample {

    public static void main(String[] args) {
        // Print a welcome message to the console using formatted output
        System.out.println("Hello and welcome to logical-problems!\n");

        int sum = 0; // Variable to store the cumulative sum

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            sum += i; // Add current number 'i' to the sum
        }

        // Print the final result
        System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}
