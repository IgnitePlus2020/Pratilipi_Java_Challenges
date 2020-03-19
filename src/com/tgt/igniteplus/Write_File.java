package com.tgt.igniteplus;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Write_File {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            OutputStream fos = new FileOutputStream("file.txt");
            System.out.println("Enter any text.");
            String text = in.nextLine();
            byte buf[] = text.getBytes();
            for (int i = 0; i < buf.length; i++)
                fos.write(buf[i]);
            System.out.println("Successfully written into file.");
            fos.close();
        } catch (IOException e) {
            System.out.println("Error.");
        }
    }
}
/*
Enter any text.
Hello World
Successfully written into file.
 */
