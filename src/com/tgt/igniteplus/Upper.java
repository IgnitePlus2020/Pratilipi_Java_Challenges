package com.tgt.igniteplus;

import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str;
        str = in.nextLine();
        System.out.println(str.toUpperCase());
    }
}
/*
Enter a string:
hello
HELLO
 */