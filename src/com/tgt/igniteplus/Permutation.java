package com.tgt.igniteplus;

public class Permutation {
    static void per(String str, String res) {
        // If string is empty
        if (str.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String s = str.substring(0, i) + str.substring(i + 1);
            per(s, res + ch);
        }
    }

    public static void main(String[] args) {
        String str = "GOD";
        System.out.println("Permutations are:");
        per(str, "");

    }
}
/*
Permutations are:
GOD GDO OGD ODG DGO DOG
 */