package Sorting;

import java.util.Arrays;
/*
 * LeetCode 2037. Minimum Number of Moves to Seat Everyone
 * Link: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
 * TC: O(nlogn)
 * SC: O(1)
 * Input: seats = [4,1,5,9], students = [1,3,2,6]
Output: 7
Explanation: The students are moved as follows:
- The first student is not moved.
- The second student is moved from from position 3 to position 4 using 1 move.
- The third student is moved from from position 2 to position 5 using 3 moves.
- The fourth student is moved from from position 6 to position 9 using 3 moves.
In total, 0 + 1 + 3 + 3 = 7 moves were used.
 * Approach: Sort both the arrays and calculate the sum of absolute difference between the corresponding elements of the two arrays.
 
 */

public class minimum_number_of_moves_to_seat_everyone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;

        for(int i=0;i<seats.length;i++){
            ans+=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
