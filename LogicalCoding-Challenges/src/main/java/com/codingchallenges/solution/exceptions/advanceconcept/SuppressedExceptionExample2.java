package com.codingchallenges.solution.exceptions.advanceconcept;

import java.io.*;

public class SuppressedExceptionExample2 {

	public static void main(String[] args) {

		try (FileWriter writer = new FileWriter("output.txt")) {
			throw new Exception("Main Exception"); // Main exception
		} catch (Exception e) {
			System.out.println("Caught exception: " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Suppressed: " + t.getMessage());
			}
		}
	}
}
