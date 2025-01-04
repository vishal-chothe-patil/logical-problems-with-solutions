package com.codingchallenges.solution.tofind;

public class SecondSmallest {
	
    public static void main(String[] args) {
    
    	int[] arr = {10, 20, 4, 45, 99};
        
        // Initialize smallest and second smallest with the maximum possible value
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        // Loop through the array to find the smallest and second smallest
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;  // Update second smallest
                smallest = num;             // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;  // Update second smallest
            }
        }
        
        // Print the second smallest number
        System.out.println("Second smallest number: " + secondSmallest);
    }
}
