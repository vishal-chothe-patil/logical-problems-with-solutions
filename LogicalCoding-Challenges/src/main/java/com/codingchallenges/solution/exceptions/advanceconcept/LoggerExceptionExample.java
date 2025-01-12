package com.codingchallenges.solution.exceptions.advanceconcept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExceptionExample {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingExceptionDemo.class);

	public static void main(String[] args) {
		try {
			int result = 10 / 0; // ArithmeticException
		} catch (ArithmeticException e) {
			logger.error("An error occurred: Division by zero", e);
		}
	}
}
