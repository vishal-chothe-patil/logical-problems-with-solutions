package com.codingchallenges.solution.tofind;

public class SumAverageOfNumber {
	
    public static void main(String[] args) {
       
    	int[] arr = {10, 20, 30, 40, 50, 60};
    	
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        double average = sum / (double) arr.length;
       
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
 