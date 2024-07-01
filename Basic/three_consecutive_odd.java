package Basic;
/*
 * LeetCode 1550. Three Consecutive Odds
 * Link: https://leetcode.com/problems/three-consecutive-odds/
 * TC: O(N)
 * SC: O(1)
 * Input: arr = [2,6,4,1]
    Output: false
    Explanation: There are no three consecutive odds.

    Input: arr = [1,2,34,3,4,5,7,23,12]
    Output: true
    Explanation: [5,7,23] are three consecutive odds.
 */
public class three_consecutive_odd {
    public boolean threeConsecutiveOdds(int[] arr) {

        boolean flag=false;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                count++;
                if(count==3){
                    flag=true;
                }
            }
            else{
                count=0;
            }
        }
        return flag;
    }
}
