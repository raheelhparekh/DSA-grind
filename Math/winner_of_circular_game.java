package Math;
import java.util.ArrayList;
/*
 * Leetcode 1823. Find the Winner of the Circular Game
 * Link: https://leetcode.com/problems/find-the-winner-of-the-circular-game/
 * TC: O(n)
 * SC: O(n)
 */

public class winner_of_circular_game {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int index=0;

        while(list.size()>1){
            int nextIndexToRemove= (index+k-1)%list.size();
            list.remove(nextIndexToRemove);
            index=nextIndexToRemove;
        }
        return list.get(0);
    }
}
