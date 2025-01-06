package com.codingchallenges.solution.exceptions.basicexception;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Create an IOException by attempting to write to a read-only file
            createAndWriteToReadOnlyFile();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }

    public static void createAndWriteToReadOnlyFile() throws IOException {
        // Step 1: Create a temporary read-only file
        File file = new File("readonlyfile.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        file.setReadOnly(); // Make the file read-only

        // Step 2: Attempt to write to the read-only file (this will cause an IOException)
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("This will fail because the file is read-only.");
        }
    }
}
