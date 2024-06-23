package Basic;
/*
 * LeetCode: 2798 : Number of Employees Who Met the Target
 * Link: https://leetcode.com/problems/number-of-employees-who-met-the-target/
 * TC: O(n)
 * SC: O(1)
 */

public class number_of_employees_who_met_the_target {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;

        for(int num:hours){
            if(num>=target){
                count++;
            }
        }
        return count; 
    }
}
