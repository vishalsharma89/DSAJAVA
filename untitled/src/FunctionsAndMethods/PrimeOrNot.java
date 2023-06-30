package FunctionsAndMethods;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
