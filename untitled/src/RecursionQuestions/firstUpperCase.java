package RecursionQuestions;

public class firstUpperCase {
    public static void main(String[] args) {
        String str = "makeI";
        char res = first(str);
            System.out.println(res);

    }

    static char first(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return 0;
    }
}
