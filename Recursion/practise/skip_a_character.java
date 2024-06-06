package Recursion.practise;

public class skip_a_character {
    public static void main(String[] args) {
        // skip1("", "baabbabc",0);
        System.out.println(skip1("", "baabbabc",0));
    }
    public static void skip(String ans, String given,int index){
        if(index==given.length()){
            System.out.println(ans);
            return;
        }

        char ch=given.charAt(index);

        if(ch=='a'){
            skip(ans,given,index+1);
        }
        else{
            skip(ans+ch,given,index+1);

        }
    }
    public static String skip1(String ans, String given,int index){
        if(index==given.length()){
            return ans;
        }

        char ch=given.charAt(index);

        if(ch=='a'){
            return skip1(ans,given,index+1);
        }
        else{
            return skip1(ans+ch,given,index+1);

        }
    }
}
