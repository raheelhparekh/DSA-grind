package SlidingWindow;
/*
 * LeetCode: 1423. Maximum Points You Can Obtain from Cards
 * Link: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
 * Input: cardPoints = [1,2,3,4,5,6,1], k = 3
 * Output: 12
 * Sliding Window :CONSTANT WINDOW size problem
   TC=O(k)
   SC=O(1)
 */

public class max_points_obtain_from_cards {
    public int maxScore(int[] card, int k) {
        int lsum=0;
        int rsum=0;
        int maxSum=0;
        // considered first we chose first left 4 elements 
        for(int i=0;i<k;i++){
            lsum+=card[i];
            rsum=0;
            maxSum=Math.max(lsum,maxSum);
        }

        // from here we start removing one element from k-1 th index from left and add
        // elements from the right
        int rightindex=card.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-card[i];
            rsum+=card[rightindex];
            maxSum=Math.max(maxSum,lsum+rsum);
            rightindex--;
        }
        return maxSum;
    }
}
