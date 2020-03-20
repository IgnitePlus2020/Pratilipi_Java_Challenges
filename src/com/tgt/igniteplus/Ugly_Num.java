package com.tgt.igniteplus;

import java.util.Scanner;

public class Ugly_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.print("Invalid input");
        }
        int num = n;
        int x = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.println(num + " is not an ugly number.");
                x = 1;
                break;
            }
        }
        if (x == 0)
            System.out.println(num + " is an ugly number.");
    }
}
/*
Enter any value: 18
18 is an ugly number.

Enter any value: 13
13 is not an ugly number.
 */