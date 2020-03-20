package com.tgt.igniteplus;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1, str2;
        str1 = in.next();
        str2 = in.next();
        System.out.println("Result:" + str1.concat(str2));
    }
}
/*
Enter two strings:
hello
world
Result:helloworld
 */
