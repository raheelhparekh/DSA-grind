package Math;
/*
 * Leetcode 1701. Average Waiting Time
 * Link: https://leetcode.com/problems/average-waiting-time/
 * TC: O(n)
 * SC: O(1)
 * 
 * 
 */

public class average_waiting_time {
    public double averageWaitingTime(int[][] customers) {
        int N=customers.length;
        double sum=customers[0][0]+customers[0][1];
        double totalWait=sum-customers[0][0];

        for(int i=1;i<N;i++){
            if (sum < customers[i][0]) {
                sum= customers[i][0];
            }
            int arrival=customers[i][0];
            int out=customers[i][1];
            sum+=out;
            totalWait+=(sum-arrival);
        }
        return totalWait/N;
    }
}
