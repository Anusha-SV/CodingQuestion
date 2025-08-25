package com.aug.TwentyThree;

// Q34: Stock Buy Sell to Maximize Profit
//
// Explanation:
// - We want to maximize profit by buying at min price, selling later at max.
// - Track min price while scanning array.
// - Calculate profit = currentPrice - minPrice.
// - Keep updating maxProfit.
// - Time complexity = O(n).

public class StockBuySell {
    public static int maxProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            else if (price - minPrice > maxProfit) maxProfit = price - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit = " + maxProfit(prices));
    }
}
