package com.tgt.igniteplus;

import java.util.Scanner;

public class Avg_Arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0, avg = 0;
        System.out.print("Enter the size of array:\t");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array:\n");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < n; i++)
            sum += arr[i];
        avg = sum / n;
        System.out.println("Average:\t" + avg);

    }
}
/*
Enter the size of array:	5
Enter the array:
1 2 3 4 5
Average:	3
 */