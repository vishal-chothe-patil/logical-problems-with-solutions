package com.codingchallenges.solution.exceptions.advanceconcept;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class LambdaExceptionHandling2 {
    public static void main(String[] args) {
        List<String> files = Arrays.asList("file1.txt", "file2.txt");

        files.forEach(file -> {
            try {
                processFile(file);
            } catch (FileNotFoundException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
        });
    }

    public static void processFile(String fileName) throws FileNotFoundException {
        throw new FileNotFoundException("File not found: " + fileName);
    }
}
