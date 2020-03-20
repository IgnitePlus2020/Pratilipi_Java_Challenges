package com.tgt.igniteplus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_File {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");
        int ch;
        //Read one character at a time until the end
        while ((ch = fis.read()) != -1)
            fos.write(ch);
        System.out.println("Copied successfully");
        fis.close();
        fos.close();
    }
}
/*
Copied successfully
 */
