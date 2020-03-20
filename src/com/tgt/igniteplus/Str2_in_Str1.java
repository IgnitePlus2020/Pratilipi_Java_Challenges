package com.tgt.igniteplus;

import java.util.Scanner;

public class Str2_in_Str1 {
    static int Substring(String str1, String str2) {
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int j;
            for (j = 0; j < str2.length(); j++)
                if (str1.charAt(i + j) != str2.charAt(j))
                    break;
            if (j == str2.length())
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1, str2;
        str1 = in.next();
        str2 = in.next();
        int j = Substring(str1, str2);
        if (j != -1)
            System.out.println(str2 + " is present in " + str1 + " at position " + j);
        else
            System.out.println(str2 + " is NOT present in " + str1);


    }
}
/*
Enter two strings:
helloworld
low
low is present in helloworld at position 3

Enter two strings:
helloworld
help
help is NOT present in helloworld
 */
