// Code Example (without manually throwing the exception)
package com.codingchallenges.solution.exceptions.basicexception;

import java.util.concurrent.*;

public class TimeoutExceptionExample2 {

    public static void main(String[] args) {
        // Create a thread pool and a task to simulate an operation
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> {
            Thread.sleep(5000);  // Simulate a long-running task
            return "Task completed";
        };

        Future<String> future = executor.submit(task);

        try {
            // Try to get the result with a timeout of 2 seconds
            String result = future.get(2, TimeUnit.SECONDS); // Will throw TimeoutException if not completed in time
            System.out.println(result);
        } catch (TimeoutException e) {
            System.out.println("Caught TimeoutException: " + e.getMessage()); // Handle the TimeoutException
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
