package org.levelup.lesson2;

public class Array {
    public static void main(String[] args) {
        double[] prices = new double[3];
        prices[0] = 2353.4;
        prices[1] = 843.2;
        prices[2] = 330.1;
        double priceSum = 0.0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
            priceSum+=prices[i];
        }
        double averagePrice = priceSum / prices.length;
        System.out.println("Average price is: " + averagePrice);
    }
}
