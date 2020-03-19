package com.tgt.igniteplus;

import java.io.File;
import java.io.IOException;

public class Create_File {
    public static void main(String[] args) {
        try {
            File obj = new File("file.txt");
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
/*
File created: file.txt

File already exists.
 */
