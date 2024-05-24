package Strings;
/*
 * Leetcode 1108 : Defanging an IP Address
 * Link : https://leetcode.com/problems/defanging-an-ip-address/
 * TC : O(n)
 * SC : O(n)
 * Input: address = "1.1.1.1"
    Output: "1[.]1[.]1[.]1"
 */

public class defanging_an_IP_address {
    class Solution {
        public String defangIPaddr(String address) {
            String result="";
    
            for(int i=0;i<address.length();i++){
                char ch=address.charAt(i);
                if(ch=='.'){
                    result=result+"[.]";
                }
                else{
                    result=result+ch;
                }
            }
            return result;
        }
    }
}
