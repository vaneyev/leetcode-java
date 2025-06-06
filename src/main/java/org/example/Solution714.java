package org.example;

/**
 * Best Time to Buy and Sell Stock with Transaction Fee
 */
public class Solution714 {
    public int maxProfit(int[] prices, int fee) {
        int buy = - prices[0];
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, buy + prices[i] - fee);
        }
        return sell;
    }
}
