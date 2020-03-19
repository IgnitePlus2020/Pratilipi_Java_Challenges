package com.tgt.igniteplus;

import java.util.Scanner;

public class ASCII_char {
    public static void main(String[] args) {
        int flag = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enetr any character:\t");
            char ch = in.next().charAt(0);
            int ascii = ch;
            System.out.println("ASCII of " + ch + " is: " + ascii);
            System.out.println("Do you want to continue? (1/0)");
            flag = in.nextInt();
        } while (flag == 1);

    }
}
/*
Enetr any character:	b
ASCII of b is: 98
Do you want to continue? (1/0)
1
Enetr any character:	Z
ASCII of Z is: 90
Do you want to continue? (1/0)
0
 */

