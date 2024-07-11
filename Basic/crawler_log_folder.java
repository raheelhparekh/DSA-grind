package Basic;
/*
 * Leetcode 1598. Crawler Log Folder
 * Link: https://leetcode.com/problems/crawler-log-folder/
 * TC: O(n)
 * SC: O(1)
 */

public class crawler_log_folder {
    public int minOperations(String[] logs) {
        int count=0;

        for (String log : logs) {
            if (log.equals("../")) {
                count--;
                if(count<0){
                    count=0;
                }
            } else if (log.equals("./")) {
                continue;
            }
            else{
                count++;
            }
        }

        return count;
    }
}
