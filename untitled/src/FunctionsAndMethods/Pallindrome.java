package FunctionsAndMethods;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        int n=121;

        System.out.println(isPalindrome(n));

    }
    static boolean isPalindrome(int n){
        if(n<0){
            return false;
        }
        int temp = n,rev=0;
//        long  rev=0;
        while(n!=0){
            rev = (rev*10)+(n%10);
            n = n/10;
        }
        return (rev==temp);
    }
}
