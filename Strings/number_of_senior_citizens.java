package Strings;
/*
 * LeetCode 2678. Number of Senior Citizens
 * Link : https://leetcode.com/problems/number-of-senior-citizens/description
 * TC : O(n)
 * SC : O(1)
 */

public class number_of_senior_citizens {
    public int countSeniors(String[] details) {
        int total=0;
        int first=0;
        int second=0;
        int count=0;

        for(int i=0;i<details.length;i++){
            first=details[i].charAt(11)-'0';
            second=details[i].charAt(12)-'0';
            total=(first*10)+second;

            if(total>60){
                count++;
            }   
        }
        return count;
        
    }
}
