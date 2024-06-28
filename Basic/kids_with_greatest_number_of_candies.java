package Basic;
import java.util.ArrayList;
import java.util.List;
/*
 * LeetCode 1431. Kids With the Greatest Number of Candies
 * Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * TC: O(N)
 * SC: O(N)
 */

public class kids_with_greatest_number_of_candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=0;
        int count=0;
        for(int nums:candies){
            max=Math.max(nums,max);
        }
        for(int num:candies){
            count=0;
            count=num+extraCandies;
            if(count>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }

}
