package FunctionsAndMethods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n=in.nextInt();
        System.out.println("Enter Second number:");
        int k=in.nextInt();
//        boolean ans = isArmstrong(n);
        System.out.print("Armstrong numbers between "+n+" and "+k+" are: ");
        for(int i=n;i<k;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
//        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
       int original = n;
       int sum = 0;

       while(n>0){
           int rem  = n%10;
           n=n/10;
           sum = sum+rem*rem*rem;
       }
       return sum==original;
    }
}
