package com.tgt.igniteplus;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 values:");
        int a, b, c, max;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest is: " + max);
    }
}
/*
Enter 3 values:
2 4 6
Largest is: 6

 */