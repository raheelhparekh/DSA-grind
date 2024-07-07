package Math;
/*
 * Leetcode Problem: 1518 Water Bottles
 * Link: https://leetcode.com/problems/water-bottles/
 * TC: O(log(numBottles))
 * SC: O(1)
 * 
 * Input: numBottles = 15, numExchange = 4
    Output: 19
    Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
    Number of water bottles you can drink: 15 + 3 + 1 = 19.

    Input: numBottles = 9, numExchange = 3
    Output: 13
    Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
    Number of water bottles you can drink: 9 + 3 + 1 = 13.
 */

public class water_bottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int remainder = 0;
        int drink = 0;

        while (numBottles >= numExchange) {

            remainder = numBottles % numExchange;
            drink = numBottles / numExchange;
            count += drink;
            numBottles = drink + remainder;
        }
        return count;
    }
}
