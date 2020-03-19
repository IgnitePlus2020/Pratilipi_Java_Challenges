package com.tgt.igniteplus;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        System.out.print("Enter any year:\t");
        year = in.nextInt();
        if (year % 400 == 0)
            System.out.println(year + " is a leap year");
        else if (year % 100 == 0)
            System.out.println(year + " is not a leap year");
        else if (year % 4 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
/*
Enter any year:	2020
2020 is a leap year

Enter any year:	2017
2017 is not a leap year
 */
