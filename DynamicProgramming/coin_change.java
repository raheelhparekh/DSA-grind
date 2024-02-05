package DynamicProgramming;
/*
 * Leetcode Problem 322 : Coin Change
 * Description: https://leetcode.com/problems/coin-change/
 * Time Complexity: O(n*m) where n is the number of coins and m is the amount
 * Space Complexity: O(n*m) where n is the number of coins and m is the amount
 * 
 */

public class coin_change {
    
        public int coinChange(int[] coins, int amount) {
    
            int[][] dp=new int[coins.length+1][amount+1]; // +1 because we are also considering the 0 th element
            for(int j=1;j<amount+1;j++){ // first row is filled with amount+1
                dp[0][j]=amount+1;  // didnt write as integer.max value since if i add 1 it will overflow . and this amount+1 will be treated as infinty
    
            }
            for(int i=1;i<coins.length+1;i++){ //starting from 1 because 0th row is filled with 0 already and we are considering the 0th element in the coins array as well so we have to start from 1 
                for(int j=1;j<amount+1;j++){ 
                    if(j<coins[i-1]){ // if the amount is less than the coin value then we cannot take the coin and we have to take the previous value which is 0 case
                        dp[i][j]=dp[i-1][j];
                    }
                    else{ // if the amount is greater than the coin value then we can take the coin or not take the coin and take the previous value which is minimum of the two cases 
                        dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                    }
                }
            }
            if(dp[coins.length][amount]> amount){ // if the value is greater than the amount then we cannot make the amount using the given coins so return -1
                return -1;
            }
            return dp[coins.length][amount];
            
        }
    
    
}
