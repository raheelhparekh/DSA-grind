package Math;
/*
 * LeetCode Prob No. 2485 : Pivot integer
 * Link: https://leetcode.com/problems/find-the-middle-index-in-array/
 * Example : Input: n = 8
            Output: 6
            Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 21
                                                        6+7+8=21

    TC : 0(N^2)
    SC : 0(1)
    Solved by me? --> Yes                                                    
 * 
 * 
 */

public class pivot_integer {
        public int pivotInteger(int n) {
            int sum=0;
            int count=0;
            for(int i=1;i<=n;i++){
                count=count+i;
                for(int j=i;j<=n;j++){
                    
                    sum=sum+j;
    
                }
                if(count==sum){
                    return i;
                }
                sum=0;
            }
            return -1;
        }
}