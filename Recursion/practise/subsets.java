package Recursion.practise;

public class subsets {
    public static void main(String[] args) {
        sub("","abc");
    }
    
    public static void sub(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);

        sub(processed+ch, unprocessed.substring(1));
        sub(processed,unprocessed.substring(1));
    }

}
