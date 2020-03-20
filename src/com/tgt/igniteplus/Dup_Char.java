package com.tgt.igniteplus;

import java.util.Scanner;

public class Dup_Char {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enetr any string:");
        String str;
        str = in.nextLine();
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.print(inp[j] + "\t");
                    break;
                }
            }
        }
    }
}
/*
Enetr any string:
helloworld
Duplicate Characters are:
l	l	o
 */


