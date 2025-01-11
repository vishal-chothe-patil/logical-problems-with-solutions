package com.codingchallenges.solution.exceptions.handlingexception;

import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("IOException generate : " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("file.txt");
        BufferedReader fileInput = new BufferedReader(file);
        fileInput.readLine();
        fileInput.close();
    }
}
