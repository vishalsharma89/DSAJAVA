package RecursionQuestions;

public class stringLengthUsing {
    public static void main(String[] args) {
        System.out.println(length("GEEKSFORGEEKS"));
        System.out.println(count("GEEKSFORGEEKS"));
    }

    static int length(String s){
        if(s.equals("")){
            return 0;
        }else{
            return 1+length(s.substring(1));
        }
    }
    static int count(String s){
        int count=0;
     for(int i=0;i<s.length();i++){
         count++;
     }
     return count;
    }

}
