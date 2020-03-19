package com.tgt.igniteplus;

import java.util.Scanner;

public class Perfect_Squ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        System.out.print("Enetr any value:\t");
        num = in.nextInt();
        double sr = Math.sqrt(num);

        // If square root is an integer
        if ((sr - Math.floor(sr)) == 0)
            System.out.println(num + " is a perfect square");
        else
            System.out.println(num + " is NOT a perfect square");
    }
}

/*
Enetr any value:	16
16 is a perfect square

Enetr any value:	8
8 is NOT a perfect square
 */