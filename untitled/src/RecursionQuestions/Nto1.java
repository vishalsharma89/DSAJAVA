package RecursionQuestions;

public class Nto1 {
    public static void main(String[] args) {
ntoOneToN(5);
    }

    static void ntoOneToN(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        ntoOneToN(n-1);
        System.out.println(n);
    }
}
