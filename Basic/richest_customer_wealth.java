package Basic;
/*
 * LeetCode: 1672. Richest Customer Wealth
 * Link: https://leetcode.com/problems/richest-customer-wealth/
 * TC: O(n^2)
 * SC: O(1)
 * 
 *  Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
    Explanation: 
    1st customer has wealth = 6
    2nd customer has wealth = 10 
    3rd customer has wealth = 8
    The 2nd customer is the richest with a wealth of 10.
 */

public class richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;

        for(int row=0;row< accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum=sum+accounts[row][col];
            }
            if(sum> max){
                max=sum;
            }
        }
        return max;
    }
}
