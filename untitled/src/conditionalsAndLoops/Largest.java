package conditionalsAndLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Num1:");
//        int num1=in.nextInt();
//        System.out.println("Num2:");
//        int num2=in.nextInt();
//        System.out.println("Num3:");
//        int num3=in.nextInt();
//
//        if(num1>num2&&num1>num3){
//            System.out.println("Num1 is greatest");
//        } else if (num2>num1 && num2>num3) {
//            System.out.println("Num2 is greatest");
//        }else{
//            System.out.println("Num3 is greatest");
//        }
//        OR
//        FIND THE LARGEST NUMBER
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}
