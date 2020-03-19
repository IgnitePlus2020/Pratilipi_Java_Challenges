package com.tgt.igniteplus;
import java.util.Scanner;
public class Vol_Cyl {
    static double pi = 3.14;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double r, h;
        System.out.print("Enter the radius (in m):\t");
        r = in.nextDouble();
        System.out.print("Enetr the height (in m):\t");
        h = in.nextDouble();
        double vol = pi * r * r * h;
        System.out.println("Vlolume of the cylinder is: " + vol + " m3");
    }
}
/*
Enter the radius (in m):	1.5
Enetr the height (in m):	2.5
Vlolume of the cylinder is: 17.662499999999998 m3
 */