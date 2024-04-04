/*
 * Leetcode 1614. Maximum Nesting Depth of the Parentheses
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
    TC: O(N) where N is the length of the string
    SC: O(1)

 */


public class max_nesting_depth_paranthesis {
    public int maxDepth(String s) {

        int count=0;
        int max=0;
        

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                if(count>max){
                    max=count;
                }

            }
            else if(ch==')'){
                count--;
                

            }
            else{
                continue;
            }
            
        }
        return max;
    }
    
}

/*
 *  Using Stacks SC=O(N)
 *      public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
                max = Math.max(max, stack.size());
            }else if(c == ')'){
                stack.pop();
            }
        }
        return max;
    }
 */
