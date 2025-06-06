package org.example;

/**
 * Best Time to Buy and Sell Stock with Cooldown
 */
public class Solution309 {
    public int maxProfit(int[] prices) {
        int b0, b1 = -prices[0];
        int s0 = 0, s1 = 0, s2 = 0;
        for (int i = 1; i < prices.length; i++) {
            b0 = Math.max(b1, s2 - prices[i]);
            s0 = Math.max(s1, b1 + prices[i]);
            s2 = s1;
            s1 = s0;
            b1 = b0;
        }
        return s0;
    }
}
