package Arrays;
/*
 *  LeetCode: 121. Best Time to Buy and Sell Stock
 *  Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *  TC: O(n)
 *  SC: O(1)
 * Approach: 1. Initialize buy as first element of prices and profit as 0.
 *           2. Iterate over prices from 1 to n. 
 *           3. If prices[i] < buy, update buy to prices[i].
 *           4. If prices[i] - buy > profit, update profit to prices[i] - buy.
 *           5. Return profit.
 */

public class best_time_buy_sell_stock {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
