package Basic;
/*
 * LeetCode 3019. Number of Changing Keys
 * Link: https://leetcode.com/problems/number-of-changing-keys/
 * TC: O(N)
 * SC: O(1)
 */

public class number_of_changing_keys {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int count=0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}
