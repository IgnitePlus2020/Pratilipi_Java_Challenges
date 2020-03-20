package com.tgt.igniteplus;

import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string:");
        String str;
        str = in.nextLine();
        int words = 0, flag = 0;
        for (int i = 0; i < str.length(); i++) {
            //If current character is space or tab then, one word has ended
            if (str.charAt(i) == ' ' || str.charAt(i) == '\t')
                flag = 0;
            else if (flag == 0) {
                flag = 1;
                words++;
            }
        }
        System.out.println("Character count: " + words);

    }
}
/*
Enter any string:
This is a test string
Character count: 5
 */