package FunctionsAndMethods;

import java.util.Scanner;

public class SumArguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c =  sum(a,b);
        System.out.println(c);
        Scanner get=new Scanner(System.in);
        String name = in.next();
        String printb = greeting(name);
        System.out.println(printb);
    }
    static int sum(int a, int b){
        int c = a+b;
        return c;
    }
    static String greeting(String greet){
        String message = "Hello " + greet;
        return message;
    }
}
