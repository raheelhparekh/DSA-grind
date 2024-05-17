package Arrays;

import java.util.Arrays;
/*
 * Leetcode 1619: Mean of array after removing some elements
 * Link: https://leetcode.com/problems/mean-of-array-after-removing-some-elements/
 * TC=0(Nlogn) where N is the length of the array (sorting the array takes Nlogn time)
 * SC=O(1)
 * 
 *  INPUT: ARR = [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]
    SORT THE ARRAY: THE ARRAY IS ALREADY SORTED: [1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3]
    REMOVE EXTREMES:
    5% OF 20 (TOTAL ELEMENTS) = 1 ELEMENT.
    REMOVE THE SMALLEST 1 ELEMENT: [1]
    REMOVE THE LARGEST 1 ELEMENT: [3]
    REMAINING ARRAY: [2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
    CALCULATE THE MEAN:
    SUM = 2 * 18 = 36
    MEAN = 36 / 18 = 2.00000
    OUTPUT: 2.00000
    
 * Approach: 1)sort the array
 * 2) calculate the length of 5% of the array because we need to remove 5% of the elements from the start and end of the array
 * 3) calculate the sum of the elements after removing 5% of the elements from the start and end of the array
 * 4) calculate the mean of the elements
 */

public class mean_of_array_after_removing_elements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len=(int) (0.05*arr.length);
        int j=0;
        double sum=0;

        for(int i=len;i<arr.length-len;i++){
            sum+=arr[i];
            j++;
        }
        double mean=sum/j;
        return mean;
    }
}
