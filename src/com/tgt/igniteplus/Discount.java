/*
discount price = (discpunt / 100) * original price
selling price = original price - discount price
 */
package com.tgt.igniteplus;

public class Discount {
    public static void main(String[] args) {
        double original_cost = 50, discount = 12;
        double dis_cost, selling_price;
        dis_cost = (discount / 100) * original_cost;
        selling_price = original_cost - dis_cost;
        System.out.println("Discount price is:\t" + dis_cost + " $");
        System.out.println("Selling price is:\t" + selling_price + " $");

    }
}
/*
Discount price is:	6.0 $
Selling price is:	44.0 $
 */
