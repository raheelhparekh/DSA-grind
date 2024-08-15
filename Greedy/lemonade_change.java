package Greedy;
/*
 * LeetCode: 860. Lemonade Change
 * Link: https://leetcode.com/problems/lemonade-change/
 * TC: O(n)
 * SC: O(1)
 */
public class lemonade_change {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int tens=0;

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                tens++;
                if(five==0){
                    return false;
                }
                five--;
            }
            else{
                if(five>0 && tens>0){
                    five--;
                    tens--;
                }
                else if(five>2){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
