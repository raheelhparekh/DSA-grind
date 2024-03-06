import java.util.Stack;
/*
 *      Leetcode 921: Minimum Add to Make Parentheses Valid
 *      Description: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 *      Time Complexity: O(n) where n is the length of the string
 *      Space Complexity: O(n) where n is the length of the string
 * 
 */

public class minadd_make_valid_paranthesis {
    public int minAddToMakeValid(String str) {


        Stack<Character> s=new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                s.push(ch);
                count++;
            }
            else{
                if(!s.isEmpty() && s.peek()=='('){
                    s.pop();
                    count--;

                }
                else{
                    count++;
                }

               
                
            }
        }
        return count;
        
    }
}
