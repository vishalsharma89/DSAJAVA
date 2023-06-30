package Recursion;

public class NumberPrints {
    public static void main(String[] args) {
        printNum(1);
    }

    static void printNum(int n){
//        base condition
        if(n==5){
            System.out.println(5);
            return;
        }
//        body
        System.out.println(n);
        printNum(n+1);
    }
}
