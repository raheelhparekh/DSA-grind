package Sorting;
/*
    Leet Code: 75
 *  Leetcode: https://leetcode.com/problems/sort-colors/
 *  Tc: O(N) where N is the length of the array
 *  SC: O(1)
 *  We maintain 3 pointers low,mid and high. low tracks 0s, mid tracks 1s and high tracks 2s.
 *  We keep moving mid and based on the value of mid we swap the values of mid with low or high.
 *  We keep moving mid until it reaches high.
 * 
 

 */

public class sort_colors {
    public void sortColors(int[] nums) {
        int low=0; // track 0s
        int mid=0; // track 1s
        int high=nums.length-1; // track 2s
        while(mid<=high){

            if(nums[mid]==0){
                //swap mid with low and increment low and midd
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;

            }
            else if(nums[mid]==2){
                // swap mid and high and decrement only high
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;


            }
            else{
                mid++;

            }

        }
    }
}

/*
    *  The below code is a brute force approach where we count the number of 0s, 1s and 2s and then fill the array with 0s, 1s and 2s
    *  This approach is not efficient as it takes O(N) time and O(1) space
 * public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;

            } else if (nums[i] == 1) {
                one++;

            } else {
                two++;

            }
        }

        while (index != nums.length) {
            while (zero != 0) {
                nums[index] = 0;
                index++;
                zero--;
            }
            while (one != 0) {
                nums[index] = 1;
                index++;
                one--;
            }
            while (two != 0) {
                nums[index] = 2;
                index++;
                two--;
            }

     
        }  
    }
 */