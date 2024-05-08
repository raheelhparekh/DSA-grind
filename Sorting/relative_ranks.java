package Sorting;
import java.util.Arrays;
import java.util.HashMap;
/*
 * LeetCode 506 : Relative Ranks
 * Link: https://leetcode.com/problems/relative-ranks/
 * TC : O(NlogN)
 * SC : O(N)
 * 
 * Pehle array ka copy banaya usko sort kiya. means sabse bada element last me milega
 * map ko ulta traverse kiya aur sab element ko map kiya with thier ranks 
 * fhir normal score array traverse kiya aur element ko get kiya from map and uska rank dekha
 */

public class relative_ranks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        // created a copy of my array
        int[] dup = Arrays.copyOf(score, n);
        // Sort the copied array
        Arrays.sort(dup);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 1;
        for (int i = n - 1; i >= 0; i--) {
            map.put(dup[i], index);
            index++;
        }
        String res[]=new String[n];
        for(int i=0;i<n;i++){
            if(map.get(score[i])==1){
                res[i]="Gold Medal";
            }
            else if(map.get(score[i])==2){
                res[i]="Silver Medal";
            }
            else if(map.get(score[i])==3){
                res[i]="Bronze Medal";
            }
            else{
                res[i]=map.get(score[i])+"";
            }

        }
        return res;


    }
}
