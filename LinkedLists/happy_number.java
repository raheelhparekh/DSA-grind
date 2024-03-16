package LinkedLists;
/*
 * LeetCode Prob No. 202 : Happy Number
 * Link: https://leetcode.com/problems/happy-number/
 * TC : 0(N)
 * SC : 0(1)
 * Approach: We need to detect a cycle. If we detect a cycle, then the number is not happy. If we reach 1, then the number is happy.
 * How to think first: Pehle consider a case where the happy number did not exist.I n that we will go on cycle and never reach 1. So, we need to detect a cycle.If we detect a cycle, then the number is not happy. If we reach 1, then the number is happy.
 * We use slow and fast pointer approach to detect a cycle. move slow by 1 steps of finding square whereas fast by 2 steps of finding square. If we detect a cycle, then the number is not happy. If we reach 1, then the number is happy.
 * 
 * Solved by me? : Yes , Kunal kushwaha video
 */

public class happy_number {
    
        public boolean isHappy(int n) {
            int slow=n;
            int fast=n;
            // used do while bcoz initially slow and fast are same so we need to run them by atleast 1 step
            do{
                slow=findSquare(slow);
                fast=findSquare(findSquare(fast));
    
            }while(slow!=fast);
            if(slow==1){
                return true;
            }
            return false;
    
        }
        // this function will return the sum of squares of digits of a number. simple logic
    
        private int findSquare(int n) {
            int sum=0;
            int rem;
            while (n > 0) {
                rem = n % 10;
                sum += rem * rem;
                n = n / 10;
            }
            return sum;
    
        }
    
}
