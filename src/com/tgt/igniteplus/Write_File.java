package com.tgt.igniteplus;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("file.txt");
            obj.write("This is a test file in java.");
            obj.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
/*
Successfully wrote to the file.
 */